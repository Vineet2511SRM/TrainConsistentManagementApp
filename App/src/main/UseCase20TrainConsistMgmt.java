package main;
/**
 * MAIN CLASS - UseCase20TrainConsistMgmt
 *
 * Use Case 20: Exception Handling During Search Operations
 *
 * Description:
 * Prevents search execution when no bogies exist in the train
 * using fail-fast validation with IllegalStateException.
 *
 * Author: Vineet Seth
 * Version: 20.0
 */

public class UseCase20TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC20 - Exception Handling During Search");
        System.out.println("======================================");

        // Create bogie array (empty train scenario)
        String[] bogieIds = {};

        String searchId = "BG101";

        // ---- FAIL FAST VALIDATION ----
        if (bogieIds.length == 0) {

            throw new IllegalStateException(
                    "No bogies available in train. Cannot perform search."
            );
        }

        // ---- SEARCH LOGIC (runs only if not empty) ----
        boolean found = false;

        for (String id : bogieIds) {

            if (id.equals(searchId)) {

                found = true;
                break;
            }
        }

        // display result
        if (found) {

            System.out.println(
                    "Bogie " + searchId +
                            " found in train consist."
            );
        }
        else {

            System.out.println(
                    "Bogie " + searchId +
                            " NOT found in train consist."
            );
        }

        System.out.println("\nUC20 execution completed ...");
    }
}