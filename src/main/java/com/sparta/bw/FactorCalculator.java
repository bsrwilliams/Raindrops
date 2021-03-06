package com.sparta.bw;

public class FactorCalculator {
    /*
     * This method takes a number as a parameter and
     * returns a String containing either Pling,
     * Plang or Plong depending if the number is
     * a factor of 3, 5 or 7 respectively.
     *
     * @param n The number to be evaluated
     * @return result The resulting string
     */
    public static String plingPlangPlong(int n) {
        String result = "";
        // If the number is a factor of 3
        if (n % 3 == 0) {
            result += "Pling";
        }

        // If the number is a factor of 5
        if (n % 5 == 0) {
            result += "Plang";
        }

        // If the number is a factor of 7
        if (n % 7 == 0) {
            result += "Plong";
        }

        // If the number is not a factor of either 3,5 or 7
        if (result.length() == 0) {
            return result + n;
        }
        return result;
    }
}
