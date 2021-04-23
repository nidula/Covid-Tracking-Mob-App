package com.example.qrreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {
    private Button button;
    private Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        button=(Button) findViewById(R.id.button7);
        button1=(Button) findViewById(R.id.button10);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity1();
            }
        });
    }
    public void openActivity(){
        Intent intent = new Intent(this, QrScan.class);
        startActivity(intent);
    }
    public void openActivity1(){
        Intent intent = new Intent(this, PCRRequst.class);
        startActivity(intent);
    }
}