package com.example.CalculatorMVCDemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.CalculatorMVCDemo.models.Calculator;
import com.example.CalculatorMVCDemo.models.CalculatorModel;

public class CalculatorActivityController extends Activity {

    /**
     * Calculator Model
     */
    private Calculator calculator;

    /**
     * Reference to the views display label
     */
    private TextView resultLabel;

    public Calculator getCalculator() {
        if (calculator == null) {
            calculator = new CalculatorModel();
        }
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity_view);

        resultLabel = (TextView) findViewById(R.id.calculatorResultDisplay);
        updateDisplay();
    }

    /**
     * Updates the view to show the calculator value
     */
    private void updateDisplay() {
        if (resultLabel != null) {
            resultLabel.setText(String.valueOf(getCalculator().getValue()));
        }
    }

    /**
     * Adds the senders text value to the calculator model
     *
     * @param sender Android Button
     */
    public void addValueToCalculator(View sender) {
        Button b = (Button) sender;
        getCalculator().add(Integer.valueOf((String) b.getText()));
        updateDisplay();
    }

    /**
     * Resets the Calculator
     *
     * @param sender
     */
    public void clearCalculator(View sender) {
        getCalculator().clear();
        updateDisplay();
    }
}
