package com.example.CalculatorMVCDemo.models;

/**
 * Calculator Model Interface
 */
public interface Calculator {
    /**
     * Adds the specified value to the calculator result
     * @param value Value to add
     */
    public void add(double value);

    /**
     * Gets the calculator value
     * @return Calculator value
     */
    public double getValue();

    /**
     * Clears/Resets the calculator back to initial state
     */
    public void clear();
}
