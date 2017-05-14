package com.example.vlad.orderapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by fast on 5/16/2016.
 */
public class SecondActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drinks_main);
    }
    public void getHome(View View)
    {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("Home"))
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
    public void goNext(View View)
    {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("Order"))
        {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }

    }
    public void goBack(View View)
    {
        String button_text;
        button_text = ((Button) View).getText().toString();
        if (button_text.equals("Food"))
        {
            Intent intent = new Intent(this, FirstActivity.class);
            startActivity(intent);
        }

    }
}
