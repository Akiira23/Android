package com.cursoandroid.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonJogar;
    private TextView textCara, textCoroa;
    private int countCara = 0, countCoroa = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonJogar = findViewById(R.id.buttonJogar);
        textCara = findViewById(R.id.textCara);
        textCoroa = findViewById(R.id.textCoroa);


        buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                int num = new Random().nextInt(2);

                intent.putExtra("numero", num);
                startActivity(intent);
                if (num == 0)
                    countCara++;
                else
                    countCoroa++;
                textCara.setText(String.valueOf(countCara));
                textCoroa.setText(String.valueOf(countCoroa));

            }
        });
    }
}
