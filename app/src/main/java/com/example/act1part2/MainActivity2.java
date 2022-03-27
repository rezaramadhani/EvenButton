package com.example.act1part2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {
    EditText edtNama, edtEmail, edtPassword, edtrepass;

    Button fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fab = findViewById(R.id.btSignin);
        edtNama = findViewById(R.id.enama);
        edtEmail = findViewById(R.id.eEmail);
        edtPassword = findViewById(R.id.epass);
        edtrepass = findViewById(R.id.erepass);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama, email, rpas1, rpas2;
                nama = edtNama.getText().toString();
                email = edtEmail.getText().toString();
                rpas1 = edtPassword.getText().toString();
                rpas2 = edtrepass.getText().toString();

                if(nama.isEmpty()){
                    showErorNama(edtNama,"Nama Tidak Boleh Kosong");
                }else if(email.isEmpty()){
                    showErorEmail(edtEmail,"Email Tidak Boleh Kosong");
                }else if(!rpas2.equals(rpas1)){
                    showErorPass(edtrepass,"Password Tidak Sama");
                }else{
                    Intent i = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                    Toast t = Toast.makeText(getApplicationContext(),"Pendaftaran Berhasil...",Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
    }

    private void showErorPass(EditText pass1, String pw_ts) {
        pass1.setError(pw_ts);
    }

    private void showErorNama(EditText isinama, String r) {
        isinama.setError(r);
    }
    private void showErorEmail(EditText isiemail, String r) {
        isiemail.setError(r);
    }
}