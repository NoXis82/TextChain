package com.example.textchain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        textView = findViewById(R.id.textView);
        Button clearBtn = findViewById(R.id.clearBtn);
        Button symbolBtn = findViewById(R.id.symbolBtn);
        Button percentBtn = findViewById(R.id.percentBtn);
        Button divBtn = findViewById(R.id.divBtn);
        Button multiBtn = findViewById(R.id.multiBtn);
        Button minusBtn = findViewById(R.id.minusBtn);
        Button plusBtn = findViewById(R.id.plusBtn);
        Button equalBtn = findViewById(R.id.equalBtn);
        Button numberBtn_0 = findViewById(R.id.numberBtn_0);
        Button numberBtn_1 = findViewById(R.id.numberBtn_1);
        Button numberBtn_2 = findViewById(R.id.numberBtn_2);
        Button numberBtn_3 = findViewById(R.id.numberBtn_3);
        Button numberBtn_4 = findViewById(R.id.numberBtn_4);
        Button numberBtn_5 = findViewById(R.id.numberBtn_5);
        Button numberBtn_6 = findViewById(R.id.numberBtn_6);
        Button numberBtn_7 = findViewById(R.id.numberBtn_7);
        Button numberBtn_8 = findViewById(R.id.numberBtn_8);
        Button numberBtn_9 = findViewById(R.id.numberBtn_9);
        Button pointBtn = findViewById(R.id.pointBtn);
        clearBtn.setText(R.string.clearBtn);
        symbolBtn.setText(R.string.symbolBtn);
        percentBtn.setText(R.string.percentBtn);
        divBtn.setText(R.string.divBtn);
        multiBtn.setText(R.string.multiBtn);
        minusBtn.setText(R.string.minusBtn);
        plusBtn.setText(R.string.plusBtn);
        equalBtn.setText(R.string.equalBtn);
        numberBtn_0.setText(R.string.numberBtn_0);
        numberBtn_1.setText(R.string.numberBtn_1);
        numberBtn_2.setText(R.string.numberBtn_2);
        numberBtn_3.setText(R.string.numberBtn_3);
        numberBtn_4.setText(R.string.numberBtn_4);
        numberBtn_5.setText(R.string.numberBtn_5);
        numberBtn_6.setText(R.string.numberBtn_6);
        numberBtn_7.setText(R.string.numberBtn_7);
        numberBtn_8.setText(R.string.numberBtn_8);
        numberBtn_9.setText(R.string.numberBtn_9);
        pointBtn.setText(R.string.pointBtn);
    }


}
