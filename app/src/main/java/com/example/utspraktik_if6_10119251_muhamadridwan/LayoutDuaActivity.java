package com.example.utspraktik_if6_10119251_muhamadridwan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LayoutDuaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_dua);

            View.OnClickListener listener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(LayoutDuaActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            };

            Button button = (Button) findViewById(R.id.ubah);
            button.setOnClickListener(listener);
        }
    }

//Nama: Muhamad Ridwan
//Kelas : IF6
//NIM : 10119251
//Tgl Pengerjaan : 03 Juni 2022