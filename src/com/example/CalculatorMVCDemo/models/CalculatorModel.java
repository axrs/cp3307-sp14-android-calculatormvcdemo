package com.example.CalculatorMVCDemo.models;

/**
 * Created by Alex on 25/03/14.
 */
public class CalculatorModel implements Calculator {

    private double calculatorValue = 0.0;

    @Override
    public void add(double value) {
        calculatorValue += value;
    }

    @Override
    public void clear() {
        calculatorValue = 0.0;
    }

    @Override
    public double getValue() {
        return calculatorValue;
    }
}
