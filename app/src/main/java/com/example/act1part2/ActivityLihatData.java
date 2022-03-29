package com.example.act1part2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    //deklarasi variabel dengan jenis data TextView
    TextView tvnama,tvnomor;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        //membuat variabel dengan jenis data bundle dan assign value dari variabel tersebut dengan
        //getIntent().getExtras()
        Bundle bundle = getIntent().getExtras();

        tvnama = findViewById(R.id.tvnama);
        tvnomor = findViewById(R.id.tvnomor);

        //membuat variabel nama dan assign value dari pesan yang dikirimkan dari activity sebelumnya
        String nama = bundle.getString("a");
        switch (nama)
        {
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("08122233344");
                break;
            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("081333224455");
                break;
            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("08125533344");
                break;
            case "Fikri":
                tvnama.setText("M Fikri");
                tvnomor.setText("08122423344");
                break;
            case "Maul":
                tvnama.setText("Maul M");
                tvnomor.setText("081222349102");
                break;
            case "Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("081222334234");
                break;
            case "Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("081222353441");
                break;
            case "Gita":
                tvnama.setText("Gita S");
                tvnomor.setText("08122233344");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi M");
                tvnomor.setText("08122232358");
                break;
            case "Vian":
                tvnama.setText("Vian M");
                tvnomor.setText("08124763344");
                break;
        }

    }
}