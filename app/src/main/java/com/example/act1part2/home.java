package com.example.act1part2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class home extends AppCompatActivity {
    TextView Email, Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Email = findViewById(R.id.tf_nama);
        Password = findViewById(R.id.tf_password);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");
        String password = bundle.getString("b");

        Email.setText(email);
        Password.setText(password);

    }
}