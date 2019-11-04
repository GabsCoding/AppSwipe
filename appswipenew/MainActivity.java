package com.douglasgabriel.appswipenew;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout tela;
    private TextView tvSwipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tela = (ConstraintLayout) findViewById(R.id.tela);
        tvSwipe = (TextView) findViewById(R.id.tvSwipe);

        tela.setOnTouchListener(new OnSwipeTouchListener(this) {
            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();

                tvSwipe.setText("Para Baixo!!!");
            }

            @Override
            public void onSwipeTop() {
                super.onSwipeTop();

                tvSwipe.setText("Para Cima!!!");
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                tvSwipe.setText("Para Esquerda!!!");
            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();

                tvSwipe.setText("Para Direita!!!");
            }
        });
    }
}
