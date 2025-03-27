package com.example.project1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button btnApaItuBan = findViewById(R.id.btn_apa_itu_ban);
        btnApaItuBan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this, "Ban adalah bagian penting kendaraan.", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnApaItuRem = findViewById(R.id.btn_apa_itu_rem);
        btnApaItuRem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this, "Rem digunakan untuk memperlambat kendaraan.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
