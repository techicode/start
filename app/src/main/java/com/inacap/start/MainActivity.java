package com.inacap.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton sandButton;
    ImageButton pizzaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sandButton = (ImageButton) findViewById(R.id.imageView14);
        pizzaButton = (ImageButton) findViewById(R.id.imageView15);

        sandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityListaSand = new Intent(MainActivity.this, listaSanguches.class);
                startActivity(activityListaSand);
            }
        });

        pizzaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityListaPizza = new Intent(MainActivity.this, listaPizza.class);
                startActivity(activityListaPizza);
            }
        });
    }
}