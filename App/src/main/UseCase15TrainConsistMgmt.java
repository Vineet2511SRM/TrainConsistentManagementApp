package main;
/**
 * MAIN CLASS - UseCase15TrainConsistMgmt
 *
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 *
 * Description:
 * Demonstrates runtime safety validation using custom
 * RuntimeException and structured try-catch-finally handling.
 *
 * Author: Vineet Seth
 * Version: 15.0
 */

public class UseCase15TrainConsistMgmt {

    // ---- CUSTOM RUNTIME EXCEPTION ----
    static class CargoSafetyException extends RuntimeException {

        public CargoSafetyException(String message) {
            super(message);
        }
    }

    // ---- GOODS BOGIE MODEL ----
    static class GoodsBogie {

        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        // assign cargo with validation
        void assignCargo(String cargo) {

            try {

                // safety rule
                if (shape.equalsIgnoreCase("Rectangular")
                        && cargo.equalsIgnoreCase("Petroleum")) {

                    throw new CargoSafetyException(
                            "Unsafe cargo assignment!"
                    );
                }

                this.cargo = cargo;

                System.out.println(
                        "Cargo assigned successfully -> " + cargo
                );

            }
            catch (CargoSafetyException e) {

                System.out.println("Error: " + e.getMessage());

            }
            finally {

                System.out.println(
                        "Cargo validation completed for "
                                + shape
                                + " bogie"
                );
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC15 - Safe Cargo Assignment");
        System.out.println("======================================");

        GoodsBogie cylindrical =
                new GoodsBogie("Cylindrical");

        cylindrical.assignCargo("Petroleum");

        GoodsBogie rectangular =
                new GoodsBogie("Rectangular");

        rectangular.assignCargo("Petroleum");

        System.out.println(
                "\nUC15 runtime handling completed ..."
        );
    }
}