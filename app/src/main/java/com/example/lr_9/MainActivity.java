package com.example.lr_9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView circleImageView;
    private Button left, right, small, medium, large;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleImageView = findViewById(R.id.circleImageView);
        left = findViewById(R.id.left);
        right = findViewById(R.id.right);
        small = findViewById(R.id.small);
        medium = findViewById(R.id.medium);
        large = findViewById(R.id.large);

        // Устанавливаем начальное изображение (circle1)
        circleImageView.setImageResource(R.drawable.circle1);

        // Обработчики кнопок
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveCircleLeft();
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveCircleRight();
            }
        });

        small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCircleSize(R.drawable.circle1, 200, 200);
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCircleSize(R.drawable.circle2, 400, 400);
            }
        });

        large.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setCircleSize(R.drawable.circle3, 600, 600);
            }
        });
    }

    private void moveCircleLeft() {
        // Получаем текущие координаты
        float x = circleImageView.getX();
        // Перемещаем влево на 10 пикселей
        circleImageView.setX(x - 10);
    }

    private void moveCircleRight() {
        // Получаем текущие координаты
        float x = circleImageView.getX();
        // Перемещаем вправо на 10 пикселей
        circleImageView.setX(x + 10);
    }

    private void setCircleSize(int drawableId, int width, int height) {
        // Устанавливаем новое изображение
        circleImageView.setImageResource(drawableId);
        // Устанавливаем новый размер
        circleImageView.getLayoutParams().width = width;
        circleImageView.getLayoutParams().height = height;
        circleImageView.requestLayout();
    }
}

