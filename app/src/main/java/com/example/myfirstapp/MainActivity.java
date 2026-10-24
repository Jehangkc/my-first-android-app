package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout screen = new LinearLayout(this);
        screen.setOrientation(LinearLayout.VERTICAL);
        screen.setPadding(40, 80, 40, 40);

        TextView message = new TextView(this);
        message.setText("Hello!");
        message.setTextSize(24);

        Button button = new Button(this);
        button.setText("Tap me");

        button.setOnClickListener(view -> {
            message.setText("My first coded Android app works!");
        });

        screen.addView(message);
        screen.addView(button);

        setContentView(screen);
    }
}