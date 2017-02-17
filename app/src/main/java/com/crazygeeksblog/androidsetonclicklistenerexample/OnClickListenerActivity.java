package com.crazygeeksblog.androidsetonclicklistenerexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OnClickListenerActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_click_listener);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(getString(R.string.button_2_message));
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    public void button1OnClick(View view) {
        showToast(getString(R.string.button_1_message));
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void onClick(View v) {
        switch (v.getId() /*to get clicked view id**/) {
            case R.id.button3:
                showToast(getString(R.string.button_3_message));
                break;
            default:
                break;
        }
    }
}
