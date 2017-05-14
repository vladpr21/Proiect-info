package com.example.vlad.orderapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity2 extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
        if (quantity > 0)
            quantity = quantity - 1;
        display(quantity);
    }

    public void submitOrder(View view) {
        EditText nameField = (EditText) findViewById(R.id.your_name);
        String name = nameField.getText().toString();
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.whipped_cream);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();
        CheckBox ChocolateCreamCheckBox = (CheckBox) findViewById(R.id.chocolate);
        boolean hasChocolate = ChocolateCreamCheckBox.isChecked();
        int price = calculatePrice();

        String message = createOrderSummary(name, price, hasWhippedCream, hasChocolate);
        displayPrice(message);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     *
     * @param
     */
    private void displayPrice(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    /**
     * Calculates the price of the order based on the current quantity.
     *
     * @return the price
     */
    private int calculatePrice() {
        int price = quantity * 7;
        return price;
    }

    private String createOrderSummary(String name, int price, boolean hasWhippedCream, boolean hasChocolate) {
        String message = "Name: " + name;
        message += "\nAdd Tomatoe and Basil Soup? " + hasWhippedCream;
        message += "\nVERDICCHIO DEI CASTELLI CLASSICO, MARCHE, ITALY ? " + hasChocolate;
        message += "\nQuantity: " + quantity;
        message += "\nTotal: $" + price;
        message += "\nThank you!";
        return message;
    }
}

