package com.global.oakdays.udacityportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    Button btnPopularMovies;
    Button btnStockHawk;
    Button btnBuildItBigger;
    Button btnMakeYourAppMaterial;
    Button btnGoUbiquitous;
    Button btnCapstone;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener portfolioButtonListener = new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Button pressedButton = (Button) view;
                Toast.makeText(MainActivity.this, "This button will launch my " + pressedButton.getText() + " app!", Toast.LENGTH_SHORT).show();
            }
        };
        
        btnPopularMovies = (Button) findViewById(R.id.btn_movies);
        btnPopularMovies.setOnClickListener(portfolioButtonListener);
        
        btnStockHawk = (Button) findViewById(R.id.btn_hawk);
        btnStockHawk.setOnClickListener(portfolioButtonListener);

        btnBuildItBigger = (Button) findViewById(R.id.btn_bib);
        btnBuildItBigger.setOnClickListener(portfolioButtonListener);

        btnMakeYourAppMaterial = (Button) findViewById(R.id.btn_myam);
        btnMakeYourAppMaterial.setOnClickListener(portfolioButtonListener);

        btnGoUbiquitous = (Button) findViewById(R.id.btn_goubi);
        btnGoUbiquitous.setOnClickListener(portfolioButtonListener);

        btnCapstone = (Button) findViewById(R.id.btn_capstone);
        btnCapstone.setOnClickListener(portfolioButtonListener);
    }
}
