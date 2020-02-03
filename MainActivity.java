package com.example.fastclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b_click1, b_click2, b_start;
    TextView tv_time, tv_clicks;
    int numberOfClicks = 0;
    int secondsLeft = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b_click1 = (Button) findViewById(R.id.b_click1);
        b_click2 = (Button) findViewById(R.id.b_click2);
        b_start = (Button) findViewById(R.id.b_start);

        tv_time = (TextView) findViewById(R.id.tv_time);
        tv_clicks = (TextView) findViewById(R.id.tv_clicks);

        b_click1.setEnabled(false);
        b_click2.setEnabled(false);


        final CountDownTimer timer = new CountDownTimer(20000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                secondsLeft--;
                tv_time.setText("Seconds Left: " + secondsLeft);

            }

            @Override
            public void onFinish() {
                b_click1.setEnabled(false);
                b_click2.setEnabled(false);
            }
        };

        b_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondsLeft = 20;
                numberOfClicks = 0;

                b_click1.setEnabled(true);
                b_click2.setEnabled(false);

                timer.start();
            }
        });

        b_click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOfClicks++;
                tv_clicks.setText("Number of clicks :" + numberOfClicks);


            }
        });

        b_click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOfClicks++;
                tv_clicks.setText("Number of clicks :" + numberOfClicks);
            }
        });
    }
}
