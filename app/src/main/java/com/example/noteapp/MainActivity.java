package com.example.noteapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AlertDialog dialog;
    ArrayList<String> arrChuDeGhiChu;
    ArrayAdapter<String> adapterChuDe;
    ListView lvChuDeGhiCHu;
    EditText txtChuDeGhuChu;
    Button btnLuuChuDe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {

    }

    private void addControls() {
        arrChuDeGhiChu = new ArrayList<String>();
        adapterChuDe = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, arrChuDeGhiChu);
        lvChuDeGhiCHu = findViewById(R.id.lvChuDeGhiChu);
        lvChuDeGhiCHu.setAdapter(adapterChuDe);
        txtChuDeGhuChu = findViewById(R.id.txtChuDeGhiChu);
    }

    public void themChuDe(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View v = inflater.inflate(R.layout.dialogchudeghichu, null);
        btnLuuChuDe = v.findViewById(R.id.btnLuuDuLieu);
        builder.setView(v);
        dialog = builder.create();
        dialog.show();
    }

    public void luuChuDe(View view) {
        Toast.makeText(this, "OK", Toast.LENGTH_SHORT).show();
    }
}
