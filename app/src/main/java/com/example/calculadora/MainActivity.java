package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button numeroZero,numeroUm,numeroDois,numeroTreis,numeroQuatro,numeroCinco,numeroSeis,
            numeroSete,numeroOito,numeroNove,ponto,soma,subtracao,mutiplicacao,divisao,igual,
            boton_limpar,apagar;

    private TextView txtExpressao,txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        IniciarComponentes();
        getSupportActionBar().hide();

        numeroZero.setOnClickListener(this);
        numeroUm.setOnClickListener(this);
        numeroDois.setOnClickListener(this);
        numeroTreis.setOnClickListener(this);
        numeroQuatro.setOnClickListener(this);
        numeroCinco.setOnClickListener(this);
        numeroSeis.setOnClickListener(this);
        numeroSete.setOnClickListener(this);
        numeroOito.setOnClickListener(this);
        numeroNove.setOnClickListener(this);
        ponto.setOnClickListener(this);
        soma.setOnClickListener(this);
        subtracao.setOnClickListener(this);
        mutiplicacao.setOnClickListener(this);
        divisao.setOnClickListener(this);

        boton_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtExpressao.setText("");
                txtResultado.setText("");
            }
        });

        apagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView expressao = findViewById(R.id.txt_expressao);
                String string = expressao.getText().toString();

                if (!string.isEmpty()){
                    byte var0 = 0;
                    int var1 = string.length()-1; //ira deletar um espressao
                    String txtExpressao = string.substring(var0,var1);
                    expressao.setText(txtExpressao);

                }
                txtResultado.setText("");
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void IniciarComponentes(){
        numeroZero = findViewById(R.id.numero_Zero);
        numeroUm = findViewById(R.id.numero_Um);
        numeroDois = findViewById(R.id.numero_Dois);
        numeroTreis = findViewById(R.id.numero_Treis);
        numeroQuatro = findViewById(R.id.numero_Quatro);
        numeroCinco = findViewById(R.id.numero_Cinco);
        numeroSeis = findViewById(R.id.numero_Seis);
        numeroSete = findViewById(R.id.numero_Sete);
        numeroOito = findViewById(R.id.numero_Oito);
        numeroNove = findViewById(R.id.numero_Nove);
        ponto = findViewById(R.id.ponto);
        soma = findViewById(R.id.soma);
        mutiplicacao = findViewById(R.id.multiplicacao);
        subtracao = findViewById(R.id.subtracao);
        divisao = findViewById(R.id.divisao);
        igual = findViewById(R.id.igual);
        boton_limpar = findViewById(R.id.bt_limpa);
        txtExpressao = findViewById(R.id.txt_expressao);
        txtResultado = findViewById(R.id.txt_resultado);
        apagar = findViewById(R.id.apagar);
    }

    public void AcrescentarUmaEpressao(String string,boolean limpar_dados){

        if (txtResultado.getText().equals("")){
            txtExpressao.setText("");
        }
        if (limpar_dados){
            txtResultado.setText("");
            txtExpressao.append(string);
        }else{
            txtExpressao.append(txtResultado.getText());
            txtExpressao.append(string);
            txtResultado.setText("");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.numero_Zero:
                AcrescentarUmaEpressao("0",true);
                break;

            case R.id.numero_Um:
                AcrescentarUmaEpressao("1",true);
                break;
            case R.id.numero_Dois:
                AcrescentarUmaEpressao("2",true);
                break;
            case R.id.numero_Treis:
                AcrescentarUmaEpressao("3",true);
                break;
            case R.id.numero_Quatro:
                AcrescentarUmaEpressao("4",true);
                break;
            case R.id.numero_Cinco:
                AcrescentarUmaEpressao("5",true);
                break;
            case R.id.numero_Seis:
                AcrescentarUmaEpressao("6",true);
                break;
            case R.id.numero_Sete:
                AcrescentarUmaEpressao("7",true);
                break;
            case R.id.numero_Oito:
                AcrescentarUmaEpressao("8",true);
                break;
            case R.id.numero_Nove:
                AcrescentarUmaEpressao("9",true);
                break;
            case R.id.ponto:
                AcrescentarUmaEpressao(".",true);
                break;
            case R.id.soma:
                AcrescentarUmaEpressao("+",false);
                break;
            case R.id.subtracao:
                AcrescentarUmaEpressao("-",false);
                break;
            case R.id.multiplicacao:
                AcrescentarUmaEpressao("*",false);
                break;
            case R.id.divisao:
                AcrescentarUmaEpressao("/",false);
                break;

        }

    }
}