package com.example.lenovo.hoodie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText eNama;
    private EditText eJumlah;
    private EditText eUkuran;
    private Button bCetak;
    private TextView tOutputnama;
    private TextView tOutputjumlah;
    private TextView tOutputukuran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eNama = findViewById(R.id.nama_hoodie);
        eJumlah = findViewById(R.id.jumlah);
        eUkuran = findViewById(R.id.ukuran);
        bCetak = findViewById(R.id.idcetak);
        tOutputnama = findViewById(R.id.outputnamahoodie);
        tOutputjumlah = findViewById(R.id.outputjumlah);
        tOutputukuran = findViewById(R.id.outputukuran);

        bCetak.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String inputNama = eNama.getText().toString();
        String inputJumlah = eJumlah.getText().toString();
        String inputUkuran = eUkuran.getText().toString();

        if (inputNama.length() == 0) {
            eNama.setError("Data tidak boleh kosong");
        } else {
            tOutputnama.setText(inputNama);
        }
        if (inputJumlah.length() == 0) {
            eJumlah.setError("Data tidak boleh kosong");
        } else {
            tOutputjumlah.setText(inputJumlah);
        }
        if (inputUkuran.length() == 0) {
            eUkuran.setError("Data tidak boleh kosong");
        } else {
            tOutputukuran.setText(inputJumlah);
        }
    }
}
