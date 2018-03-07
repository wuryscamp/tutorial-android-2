package com.wurianto.tutorial2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTitle = (TextView) findViewById(R.id.tv_title);
        btn1 = (Button) findViewById(R.id.btn1);

        textViewTitle.setText("Musobar Media");

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(textViewTitle.getText().toString().equals("Musobar Media")) {
                    textViewTitle.setText("I Love Musobar Media");
                } else {
                    textViewTitle.setText("Musobar Media");
                }
            }
        });
    }
}
