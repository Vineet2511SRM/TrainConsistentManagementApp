package main;

import java.util.*;
import java.util.stream.Collectors;

/**
 * MAIN CLASS - UseCase13TrainConsistMgmt
 *
 * Use Case 13: Performance Comparison (Loops vs Streams)
 *
 * Description:
 * Compares execution time of loop-based filtering
 * and stream-based filtering using System.nanoTime().
 *
 * Author: Vineet Seth
 * Version: 13.0
 */

public class UseCase13TrainConsistMgmt {

    // Bogie model
    static class Bogie {

        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("UC13 - Performance Comparison (Loops vs Streams)");
        System.out.println("======================================");

        // Create large dataset
        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {

            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
            bogies.add(new Bogie("First Class", 24));
            bogies.add(new Bogie("General", 90));
        }

        // ---- LOOP FILTERING ----
        long loopStart = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();

        for (Bogie b : bogies) {

            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopTime = loopEnd - loopStart;

        // ---- STREAM FILTERING ----
        long streamStart = System.nanoTime();

        List<Bogie> streamFiltered =
                bogies.stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamTime = streamEnd - streamStart;

        // ---- RESULTS ----
        System.out.println("\nLoop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);

        System.out.println("\nFiltered Count (Loop): " + loopFiltered.size());
        System.out.println("Filtered Count (Stream): " + streamFiltered.size());

        System.out.println("\nUC13 performance benchmarking completed ...");
    }
}