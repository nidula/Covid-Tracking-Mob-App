package com.example.qrreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Map extends AppCompatActivity {
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        button2 = (Button) findViewById(R.id.button4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenActivity();
            }
        });
    }
    public void OpenActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}