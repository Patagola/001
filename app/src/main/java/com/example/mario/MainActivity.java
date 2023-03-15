package com.example.mario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    EditText somar,subtrair,horaInicio,minutoInicial,horaFinal,minutoFinal;

    private Button Somar , Subtrair ;
    private EditText getHoraInicio , getMinutoInicial , getHoraFinal , getMinutoFinal;
    private TextView rH;
    private TextView rM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        somar = findViewById( Somar );
        subtrair = findViewById( Subtrair );

        horaInicio = findViewById(R.id.horaInicio);
        minutoInicial = findViewById(R.id.minutoInicial);
        horaFinal = findViewById(R.id.horaFinal);
        minutoFinal = findViewById(R.id.minutoFinal);
        rH = findViewById(horaInicio,horaFinal);
        rM = findViewById(minutoInicial,minutoFinal);

    }
    public void somar(View view){
        String A = horaInicio.getText().toString().trim();
        String B = minutoInicial.getText().toString().trim();
        String C = horaFinal.getText().toString().trim();
        String D = minutoFinal.getText().toString().trim();

        Double E = Double.parseDouble(A);
        Double G = Double.parseDouble(B);
        Double H = Double.parseDouble(C);
        Double I = Double.parseDouble(D);

        Double J = A + C;
        rH.setText(E.toString());

        Double K = B + D;
        rM.setText(E.toString());


    }
    public void subtrair (View view){
        String A = horaInicio.getText().toString().trim();
        String B = minutoInicial.getText().toString().trim();
        String C = horaFinal.getText().toString().trim();
        String D = minutoFinal.getText().toString().trim();

        Double E = Double.parseDouble(A);
        Double G = Double.parseDouble(B);
        Double H = Double.parseDouble(C);
        Double I = Double.parseDouble(D);

        Double J = A - C;
        rH.setText(E.toString());

        Double K = B - D;
        rM.setText(E.toString());


    }
}
