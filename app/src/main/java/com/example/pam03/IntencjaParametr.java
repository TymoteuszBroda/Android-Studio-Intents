package com.example.pam03;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IntencjaParametr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intencja_parametr);

        Bundle b = getIntent().getExtras();
        String parametr = b.getString("zmienna");
        TextView poleTekstowe = findViewById(R.id.parameterIntent);
        poleTekstowe.setText(parametr);
    }
}

