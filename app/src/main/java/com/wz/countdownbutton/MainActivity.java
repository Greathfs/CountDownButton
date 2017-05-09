package com.wz.countdownbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wz.library.CountDownButton;

public class MainActivity extends AppCompatActivity {

    private CountDownButton mCountDownButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCountDownButton = (CountDownButton) findViewById(R.id.btn_count_down);
        mCountDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCountDownButton.startCount();
            }
        });
    }
}
