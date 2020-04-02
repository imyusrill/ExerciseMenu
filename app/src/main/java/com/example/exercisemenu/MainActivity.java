package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signin;
    EditText un,ps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signin = (Button) findViewById(R.id.btnSignin);
        un = (EditText) findViewById(R.id.editUN);
        ps = (EditText) findViewById(R.id.editPass);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(un.getText().toString().equals("admin") &&
                   ps.getText().toString().equals("123")) {

                    Intent i = new Intent(MainActivity.this, menu.class);
                    startActivity(i);

                    Toast.makeText(getApplicationContext(),
                            "Login Sukses",Toast.LENGTH_SHORT).show();
                } else if (un.getText().toString().isEmpty() || ps.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),
                            "Tidak Boleh Ada Yang Kosong",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Login Gagal",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
