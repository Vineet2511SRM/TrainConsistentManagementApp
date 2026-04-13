package main;
import java.util.Arrays;

/**
 * MAIN CLASS - UseCase19TrainConsistMgmt
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * Demonstrates optimized searching using Binary Search
 * on sorted bogie ID data.
 *
 * Author: Vineet Seth
 * Version: 19.0
 */

public class UseCase19TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("======================================");

        // Create sorted array of bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // ensure sorted order (precondition)
        Arrays.sort(bogieIds);

        String key = "BG309";

        System.out.println("\nSorted Bogie IDs:");

        for (String id : bogieIds) {
            System.out.println(id);
        }

        // ---- BINARY SEARCH LOGIC ----
        boolean found = binarySearch(bogieIds, key);

        if (found) {

            System.out.println(
                    "\nBogie " + key +
                            " found using Binary Search."
            );
        }
        else {

            System.out.println(
                    "\nBogie " + key +
                            " NOT found in train consist."
            );
        }

        System.out.println("\nUC19 search completed ...");
    }


    // Binary Search Method
    static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = arr[mid].compareTo(key);

            if (comparison == 0) {

                return true;
            }
            else if (comparison < 0) {

                low = mid + 1;
            }
            else {

                high = mid - 1;
            }
        }

        return false;
    }
}