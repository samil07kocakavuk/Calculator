package com.example.hesap_makinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextSayi1,editTextSayi2;
    TextView textViewSonuc;
    Button buttonTopla,buttonCikar,buttonCarp,buttonBol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextSayi1=findViewById(R.id.editText_sayi1);
        editTextSayi2=findViewById(R.id.editText_sayi2);
        textViewSonuc=findViewById(R.id.textView_Sonuc);
        buttonTopla=findViewById(R.id.btn_topla);
        buttonCikar=findViewById(R.id.btn_cikar);
        buttonCarp=findViewById(R.id.btn_carp);
        buttonBol=findViewById(R.id.btn_bol);

        buttonTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1=Integer.parseInt(editTextSayi1.getText().toString());
                int sayi2=Integer.parseInt(editTextSayi2.getText().toString());
                int sonuc=sayi1+sayi2;
                textViewSonuc.setText(String.valueOf(sonuc));
            }
        });
        buttonCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1=Integer.parseInt(editTextSayi1.getText().toString());
                int sayi2=Integer.parseInt(editTextSayi2.getText().toString());
                int sonuc=sayi1-sayi2;
                textViewSonuc.setText(String.valueOf(sonuc));
            }
        });
        buttonCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1=Integer.parseInt(editTextSayi1.getText().toString());
                int sayi2=Integer.parseInt(editTextSayi2.getText().toString());
                int sonuc=sayi1*sayi2;
                textViewSonuc.setText(String.valueOf(sonuc));
            }
        });
        buttonBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1=Integer.parseInt(editTextSayi1.getText().toString());
                int sayi2=Integer.parseInt(editTextSayi2.getText().toString());
                int sonuc=sayi1/sayi2;
                textViewSonuc.setText(String.valueOf(sonuc));
            }
        });
    }

}