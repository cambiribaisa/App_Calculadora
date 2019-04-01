package com.example.aluno.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private Button somar;
    private Button subtrair;
    private Button multiplicar;
    private Button limpar;
    private EditText valor1;
    private EditText valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText)findViewById(R.id.valor1);
        valor2 = (EditText)findViewById(R.id.valor2);
        somar = (Button) findViewById(R.id.somar);
        subtrair = (Button) findViewById(R.id.subtrair);
        multiplicar = (Button) findViewById(R.id.multiplicar);
        resultado = (TextView) findViewById(R.id.resultado);
        limpar = (Button) findViewById(R.id.limpar);

        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double total;
                    double t1 = Double.parseDouble(valor1.getText().toString());
                    double t2 = Double.parseDouble(valor2.getText().toString());

                    total = t1 + t2;
                    resultado.setText(""+total);

                } catch (Exception E){
                    // Caso ocorra algum erro...
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();

                }
            }
        });

        subtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double total;
                    double t1 = Double.parseDouble(valor1.getText().toString());
                    double t2 = Double.parseDouble(valor2.getText().toString());

                    total = t1 - t2;
                    resultado.setText(""+total);

                } catch (Exception E){
                    // Caso ocorra algum erro...
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();

                }
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    Double total;
                    double t1 = Double.parseDouble(valor1.getText().toString());
                    double t2 = Double.parseDouble(valor2.getText().toString());

                    total = t1 * t2;
                    resultado.setText(""+total);

                } catch (Exception E){
                    // Caso ocorra algum erro...
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();

                }
            }
        });


        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    valor1.setText("");
                    valor2.setText("");
                    resultado.setText("");

                } catch (Exception E){
                    // Caso ocorra algum erro...
                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();

                }
            }
        });







    }
}
