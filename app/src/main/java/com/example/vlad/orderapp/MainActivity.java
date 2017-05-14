package com.example.vlad.orderapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }

    public void openPage(View View)
    {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals(" DRINKS "))
        {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }
        else if(button_text.equals("ORDER"))
        {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }
        else if(button_text.equals(" FOOD "))
        {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);
        }
    }


}