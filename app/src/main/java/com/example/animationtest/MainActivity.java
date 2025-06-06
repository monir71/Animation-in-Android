package com.example.animationtest;

import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView animationText = findViewById(R.id.animText);
        Button scaleButton = findViewById(R.id.scale);
        scaleButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Animation scaleAmination = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                animationText.startAnimation(scaleAmination);
            }
        });

        Button rotateButton = findViewById(R.id.rotate);
        rotateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotateAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                animationText.startAnimation(rotateAnimation);
            }
        });

        Button translateButton = findViewById(R.id.translate);
        translateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation translateAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
                animationText.startAnimation(translateAnim);
            }
        });

        Button alphaButton = findViewById(R.id.alpha);
        alphaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation alphaAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                animationText.startAnimation(alphaAnimation);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}