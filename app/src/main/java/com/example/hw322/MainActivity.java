package com.example.hw322;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final View calc1 = findViewById(R.id.calculator1);
        final View calc2 = findViewById(R.id.calculator2);
        button = findViewById(R.id.btnSwitch);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (calc1.getVisibility() == View.VISIBLE){
                    calc1.setVisibility(View.GONE);
                    calc2.setVisibility(View.VISIBLE);
                }
                else if (calc2.getVisibility() == View.VISIBLE) {
                    calc1.setVisibility(View.VISIBLE);
                    calc2.setVisibility(View.GONE);
                }
            }
        });
    }
}
