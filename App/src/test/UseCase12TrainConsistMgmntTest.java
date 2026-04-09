package test;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase12TrainConsistMgmntTest {

    static class GoodsBogie {

        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    private boolean validate(List<GoodsBogie> list) {

        return list.stream()
                .allMatch(g ->
                        !g.type.equalsIgnoreCase("Cylindrical")
                                || g.cargo.equalsIgnoreCase("Petroleum")
                );
    }

    @Test
    void testSafety_AllBogiesValid() {

        List<GoodsBogie> list = List.of(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Grain")
        );

        assertTrue(validate(list));
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo() {

        List<GoodsBogie> list = List.of(
                new GoodsBogie("Cylindrical", "Coal")
        );

        assertFalse(validate(list));
    }

    @Test
    void testSafety_NonCylindricalBogiesAllowed() {

        List<GoodsBogie> list = List.of(
                new GoodsBogie("Open", "Coal"),
                new GoodsBogie("Box", "Grain")
        );

        assertTrue(validate(list));
    }

    @Test
    void testSafety_MixedBogiesWithViolation() {

        List<GoodsBogie> list = List.of(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Cylindrical", "Coal")
        );

        assertFalse(validate(list));
    }

    @Test
    void testSafety_EmptyBogieList() {

        List<GoodsBogie> list = new ArrayList<>();

        assertTrue(validate(list));
    }
}