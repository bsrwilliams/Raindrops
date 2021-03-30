package com.sparta.bw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    @DisplayName("Test a positive factor of 3")
    public void positiveFactorOf3() {
        Assertions.assertEquals("Pling", FactorCalculator.plingPlangPlong(9));
    }

    @Test
    @DisplayName("Test a negative factor of 3")
    public void negativeFactorOf3() {
        Assertions.assertEquals("Pling", FactorCalculator.plingPlangPlong(-12));
    }

    @Test
    @DisplayName("Test a positive factor of 5")
    public void positiveFactorOf5() {
        Assertions.assertEquals("Plang", FactorCalculator.plingPlangPlong(20));
    }

    @Test
    @DisplayName("Test a negative factor of 5")
    public void negativeFactorOf5() {
        Assertions.assertEquals("Plang", FactorCalculator.plingPlangPlong(-25));
    }

    @Test
    @DisplayName("Test a positive factor of 7")
    public void positiveFactorOf7() {
        Assertions.assertEquals("Plong", FactorCalculator.plingPlangPlong(14));
    }

    @Test
    @DisplayName("Test a negative factor of 7")
    public void negativeFactorOf7() {
        Assertions.assertEquals("Plong", FactorCalculator.plingPlangPlong(-28));
    }

    @Test
    @DisplayName("Test a positive value with no matching factor")
    public void positiveNoMatchingFactor() {
        Assertions.assertEquals("8", FactorCalculator.plingPlangPlong(8));
    }

    @Test
    @DisplayName("Test a negative value with no matching factor")
    public void negativeNoMatchingFactor() {
        Assertions.assertEquals("-11", FactorCalculator.plingPlangPlong(-11));
    }

    @Test
    @DisplayName("Test a positive factor of both 3 and 5")
    public void positiveFactorOf3And5() {
        Assertions.assertEquals("PlingPlang", FactorCalculator.plingPlangPlong(15));
    }

    @Test
    @DisplayName("Test a negative factor of both 3 and 5")
    public void negativeFactorOf3And5() {
        Assertions.assertEquals("PlingPlang", FactorCalculator.plingPlangPlong(-30));
    }

    @Test
    @DisplayName("Test a positive factor of both 3 and 7")
    public void positiveFactorOf3And7() {
        Assertions.assertEquals("PlingPlong", FactorCalculator.plingPlangPlong(21));
    }

    @Test
    @DisplayName("Test a negative factor of both 3 and 7")
    public void negativeFactorOf3And7() {
        Assertions.assertEquals("PlingPlong", FactorCalculator.plingPlangPlong(-42));
    }

    @Test
    @DisplayName("Test a positive factor of both 5 and 7")
    public void positiveFactorOf5And7() {
        Assertions.assertEquals("PlangPlong", FactorCalculator.plingPlangPlong(35));
    }

    @Test
    @DisplayName("Test a negative factor of both 5 and 7")
    public void negativeFactorOf5And7() {
        Assertions.assertEquals("PlangPlong", FactorCalculator.plingPlangPlong(-70));
    }

    @Test
    @DisplayName("Test a positive value that is a factor of all")
    public void positiveFactorOfAll() {
        Assertions.assertEquals("PlingPlangPlong", FactorCalculator.plingPlangPlong(105));
    }

    @Test
    @DisplayName("Test a negative value that is a factor of all")
    public void negativeFactorOfAll() {
        Assertions.assertEquals("PlingPlangPlong", FactorCalculator.plingPlangPlong(-105));
    }

    @Test
    @DisplayName("Test a large value")
    public void largeValues() {
        Assertions.assertEquals("PlingPlong", FactorCalculator.plingPlangPlong(2147483646));
    }
}
