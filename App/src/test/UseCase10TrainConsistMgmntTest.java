package test;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TrainConsistMgmntTest {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    private List<Bogie> createBogies() {

        return List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70)
        );
    }

    @Test
    void testReduce_TotalSeatCalculation() {

        int total =
                createBogies().stream()
                        .map(b -> b.capacity)
                        .reduce(0, Integer::sum);

        assertEquals(222, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {

        int total =
                createBogies().stream()
                        .map(b -> b.capacity)
                        .reduce(0, Integer::sum);

        assertTrue(total > 0);
    }

    @Test
    void testReduce_SingleBogieCapacity() {

        List<Bogie> list =
                List.of(new Bogie("Sleeper", 72));

        int total =
                list.stream()
                        .map(b -> b.capacity)
                        .reduce(0, Integer::sum);

        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {

        int total =
                new ArrayList<Bogie>().stream()
                        .map(b -> b.capacity)
                        .reduce(0, Integer::sum);

        assertEquals(0, total);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {

        List<Integer> capacities =
                createBogies().stream()
                        .map(b -> b.capacity)
                        .toList();

        assertTrue(capacities.contains(72));
        assertTrue(capacities.contains(56));
    }

    @Test
    void testReduce_AllBogiesIncluded() {

        int total =
                createBogies().stream()
                        .map(b -> b.capacity)
                        .reduce(0, Integer::sum);

        assertEquals(222, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {

        List<Bogie> original = new ArrayList<>(createBogies());

        int total =
                original.stream()
                        .map(b -> b.capacity)
                        .reduce(0, Integer::sum);

        assertEquals(4, original.size());
        assertEquals(222, total);
    }
}