package com.itch2.plat2.holausuario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {
    private TextView txt1;
    private TextView txt2;
    private TextView txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);


        txt1 = (TextView)findViewById(R.id.txt1);
        txt2 = (TextView)findViewById(R.id.txt2);
        txt3 = (TextView)findViewById(R.id.txt3);

        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje a mostrar
        txt1.setText(  bundle.getString("Texto1"));
        txt2.setText( bundle.getString("Texto2"));
        txt3.setText( bundle.getString("Texto3"));


    }
}
