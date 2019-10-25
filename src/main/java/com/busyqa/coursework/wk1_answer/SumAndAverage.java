package com.busyqa.coursework.wk1_answer;

public class SumAndAverage {
    public static void main (String[] args) {
        int sum = 0;          // Store the accumulated sum, init to 0
        double count = 0;
        double average;       // average in double
//        int lowerbound = 1;   // The lowerbound to sum
//        int upperbound = 100; // The upperbound to sum
          int i;

        // Use a for-loop to sum from lowerbound to upperbound
        for (i = 1; i <=100; i++) {
            sum = sum + i;     // same as "sum = sum + number"
            count = count + 1;
            System.out.println( "count is " +count );
        }
        System.out.println( "sum is " +sum );
        average = sum/count;
        System.out.println( "Average is " +average );
        // Compute average in double. Beware that int/int produces int.
        // Print sum and average.
    }
}
