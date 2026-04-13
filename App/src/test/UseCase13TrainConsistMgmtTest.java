package test;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase13TrainConsistMgmtTest {

    static class Bogie {

        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    private List<Bogie> createDataset() {

        List<Bogie> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {

            list.add(new Bogie("Sleeper", 72));
            list.add(new Bogie("AC Chair", 56));
            list.add(new Bogie("First Class", 24));
            list.add(new Bogie("General", 90));
        }

        return list;
    }

    @Test
    void testLoopFilteringLogic() {

        List<Bogie> result = new ArrayList<>();

        for (Bogie b : createDataset()) {

            if (b.capacity > 60) {
                result.add(b);
            }
        }

        assertTrue(result.stream().allMatch(b -> b.capacity > 60));
    }

    @Test
    void testStreamFilteringLogic() {

        List<Bogie> result =
                createDataset().stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        assertTrue(result.stream().allMatch(b -> b.capacity > 60));
    }

    @Test
    void testLoopAndStreamResultsMatch() {

        List<Bogie> loopResult = new ArrayList<>();

        for (Bogie b : createDataset()) {

            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        List<Bogie> streamResult =
                createDataset().stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {

        long start = System.nanoTime();

        createDataset().stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long end = System.nanoTime();

        long duration = end - start;

        assertTrue(duration > 0);
    }

    @Test
    void testLargeDatasetProcessing() {

        List<Bogie> result =
                createDataset().stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        assertFalse(result.isEmpty());
    }
}