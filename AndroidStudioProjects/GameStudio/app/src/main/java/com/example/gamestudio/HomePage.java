package com.example.gamestudio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home_page);

        Intent intention = new Intent(this, Game.class);

        Button button = (Button) findViewById(R.id.button_see_more_ori);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                startActivity(intention);
            }
        });
    }
}