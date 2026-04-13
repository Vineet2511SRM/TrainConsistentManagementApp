package main;
import java.util.Arrays;

/**
 * MAIN CLASS - UseCase17TrainConsistMgmt
 *
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 *
 * Description:
 * Demonstrates sorting of bogie type names alphabetically
 * using Java built-in Arrays.sort() method.
 *
 * Author: Vineet Seth
 * Version: 17.0
 */

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC17 - Sort Bogie Names Using Arrays.sort()");
        System.out.println("======================================");

        // Create array of bogie names
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        // Display original order
        System.out.println("\nOriginal Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        // ---- SORT USING ARRAYS.SORT ----
        Arrays.sort(bogieNames);

        // Display sorted result
        System.out.println("\nSorted Bogie Names (Alphabetical):");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 sorting completed ...");
    }
}
