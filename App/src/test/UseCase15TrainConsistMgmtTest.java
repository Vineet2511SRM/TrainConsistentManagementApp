package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase15TrainConsistMgmtTest {

    static class CargoSafetyException extends RuntimeException {

        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {

        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {

            try {

                if (shape.equalsIgnoreCase("Rectangular")
                        && cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe cargo assignment!"
                    );
                }

                this.cargo = cargo;

            }
            catch (CargoSafetyException e) {

                this.cargo = null;

            }
            finally {

                // logging simulation
                System.out.println(
                        "Validation completed for " + shape
                );
            }
        }
    }

    @Test
    void testCargo_SafeAssignment() {

        GoodsBogie g =
                new GoodsBogie("Cylindrical");

        g.assignCargo("Petroleum");

        assertEquals("Petroleum", g.cargo);
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {

        GoodsBogie g =
                new GoodsBogie("Rectangular");

        g.assignCargo("Petroleum");

        assertNull(g.cargo);
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {

        GoodsBogie g =
                new GoodsBogie("Rectangular");

        g.assignCargo("Petroleum");

        assertNull(g.cargo);
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {

        GoodsBogie g1 =
                new GoodsBogie("Rectangular");

        g1.assignCargo("Petroleum");

        GoodsBogie g2 =
                new GoodsBogie("Cylindrical");

        g2.assignCargo("Petroleum");

        assertEquals("Petroleum", g2.cargo);
    }

    @Test
    void testCargo_FinallyBlockExecution() {

        GoodsBogie g =
                new GoodsBogie("Rectangular");

        g.assignCargo("Petroleum");

        assertNull(g.cargo);
    }
}