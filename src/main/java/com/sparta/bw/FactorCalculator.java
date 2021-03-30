package com.sparta.bw;

public class FactorCalculator {
    public static String plingPlangPlong(int n) {
        String result = "";
        if (n % 3 == 0) {
            result += "Pling";
        }

        if (n % 5 == 0) {
            result += "Plang";
        }

        if (n % 7 == 0) {
            result += "Plong";
        }

        if (result.length() == 0) {
            return result + n;
        }
        return result;
    }
}
