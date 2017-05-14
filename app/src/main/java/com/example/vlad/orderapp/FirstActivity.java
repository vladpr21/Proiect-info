package com.example.vlad.orderapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by fast on 5/16/2016.
 */
public class FirstActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.themain_food);
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
        if (button_text.equals("Drinks"))
        {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }

    }
}
