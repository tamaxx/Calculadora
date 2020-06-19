package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.FormatException;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import java.text.Normalizer;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    Button btnSoma;
    Button btnSubtracao;
    Button btnMultiplicacao;
    Button btnDivisao;
    TextView resultado;

    double n1, n2, soma, subtracao, multiplicacao, divisao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        resultado = (TextView)findViewById(R.id.resultado);
        btnSoma = (Button)findViewById(R.id.btnSoma);
        btnSubtracao = (Button)findViewById(R.id.btnSubtracao);
        btnMultiplicacao = (Button)findViewById(R.id.btnMultiplicacao);
        btnDivisao = (Button)findViewById(R.id.btnDivisao);

    }

    public void Somar(View view){

        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            soma = n1 + n2;
            resultado.setText(Double.toString(soma));
        } catch (NumberFormatException e){
            resultado.setText("Por favor, insira apenas valores numéricos");
        }

    }
    public void Subtrair(View view){

        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            subtracao = n1 - n2;
            resultado.setText(Double.toString(subtracao));
        } catch (NumberFormatException e){
            resultado.setText("Por favor, insira apenas valores numéricos");
        }

    }
    public void Dividir(View view) {

        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());

            try {
                divisao = n1 / n2;
                resultado.setText(Double.toString(divisao));
            } catch (ArithmeticException E) {
                resultado.setText("Impossível dividir um valor por 0");
            }
        } catch (NumberFormatException e) {
            resultado.setText("Por favor, insira apenas valores numéricos");
        }
    }
    public void Multiplicar(View view){

        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());

            multiplicacao = n1 * n2;
            resultado.setText(Double.toString(multiplicacao));
        } catch (NumberFormatException e) {
            resultado.setText("Por favor, insira apenas valores numéricos");
        }
    }
}
