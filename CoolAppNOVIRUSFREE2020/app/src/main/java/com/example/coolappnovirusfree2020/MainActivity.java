package com.example.coolappnovirusfree2020;

import android.media.Image;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.app.Dialog;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton Lakik = findViewById(R.id.Lakik);
        RadioButton Betina = findViewById(R.id.Betina);
        RadioButton Hitam = findViewById(R.id.Hitam);
        RadioButton Asean = findViewById(R.id.Asean);
        Button realButton = findViewById(R.id.realButton);
        ImageButton fakeButton = findViewById(R.id.fakeButton);

        RelativeLayout myrelativeLayout = findViewById(R.id.myrelativeLayout);
        ImageButton closeButton = findViewById(R.id.closeButton);
        ImageView Scammed = findViewById(R.id.Scammed);


        myrelativeLayout.setVisibility(View.INVISIBLE);

        Glide.with(this)
                .load(R.drawable.scammed)
                .placeholder(R.drawable.placeholder)
                .into(Scammed);

        realButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Lakik.isChecked()){
                    Toast.makeText(MainActivity.this,
                            "Kamu lakik",
                            Toast.LENGTH_SHORT).show();
                } else if (Betina.isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Kamu betina",
                            Toast.LENGTH_SHORT).show();
                } else if (Hitam.isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Kamu ilmu hitam",
                            Toast.LENGTH_SHORT).show();
                } else if (Asean.isChecked()) {
                    Toast.makeText(MainActivity.this,
                            "Kamu sedang tidur",
                            Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(MainActivity.this,
                            "Pilih dulu baru tekan tombol",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        fakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myrelativeLayout.setVisibility(View.VISIBLE);
            }
        });

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myrelativeLayout.setVisibility(View.INVISIBLE);
            }
        });
    }
}
