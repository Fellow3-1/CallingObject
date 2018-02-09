package com.fellow.felloh.callingobject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("What!");
        textView.setTextSize(46);
        textView.setTextColor(android.R.color.holo_green_dark);
        setContentView(textView);
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_display_message);
//
//        // Get the Intent that started this activity and extract the string
//        Intent intent = getIntent();
//        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//
//        // Capture the layout's TextView and set the string as its text
//        TextView textView = findViewById(R.id.textView);
//        textView.setText(message);
//    }
}
