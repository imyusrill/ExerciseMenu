package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kelilingLingkaran extends AppCompatActivity {

    EditText eJari;
    Button hitung;
    TextView hsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_lingkaran);


        eJari= (EditText)findViewById(R.id.editJari);
        hitung = (Button)findViewById(R.id.btnHitung);
        hsl = (TextView)findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (eJari.getText().toString().isEmpty() || eJari.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),
                            "Tidak Boleh Ada Yang Kosong",Toast.LENGTH_SHORT).show();
                } else {
                    hitung();
                }
            }
        });

    }
    private void hitung() {
        double jari = Integer.parseInt(eJari.getText().toString());
        double yaitu = 3.14 * 2 * jari;
        hsl.setText("Keliling Lingkaran dengan Jari-jari: "+ jari + " adalah " + yaitu);

    }
}
