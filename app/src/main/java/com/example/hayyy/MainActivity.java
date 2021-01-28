package com.example.hayyy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {
public int jumlah=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final TextView txthw = findViewById(R.id.tv_hw);
       final TextView txtuy = findViewById(R.id.tv_alamat);
       final TextView txtalamat = findViewById(R.id.tv_uy);
        Button btnMove = findViewById(R.id.btn_pindah);
        getIntent().putExtra(txtalamat);


       txthw.setText("Selamat Datang");
       txtuy.setText("Ujang");
       txtalamat.setText("Bandung");
       
       txtuy.setOnClickListener(new  View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Anda Menemukan tulisan"+txtuy.getText(), Toast.LENGTH_SHORT).show();
           }
       });

       txtalamat.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "Anda Menemukan tulisan Alamat", Toast.LENGTH_SHORT).show();
           }
       });

        txthw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumlah++;
                Toast.makeText(MainActivity.this, "Anda Menekan sebanyak"+jumlah+"kali", Toast.LENGTH_SHORT).show();
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Activity2.class);
                Intent.putExtra("nama_key",txtalamat.getInputExtras());
                intent.putExtra("alamat");

                startActivity(intent);
//                finish();
//                onDestroy();
                onAttachedToWindow();
            }
        });
    }

}