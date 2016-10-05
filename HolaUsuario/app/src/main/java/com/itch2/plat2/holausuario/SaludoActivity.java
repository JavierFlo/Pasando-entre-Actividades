package com.itch2.plat2.holausuario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {
    private TextView txtSaludo;
    private TextView txt2;
    private TextView txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);


        txtSaludo = (TextView)findViewById(R.id.txtSaludo);
        txt2 = (TextView)findViewById(R.id.txt2);
        txt3 = (TextView)findViewById(R.id.txt3);

        Bundle bundle = this.getIntent().getExtras();


        txtSaludo.setText("Hola " + bundle.getString("NOMBRE"));
        txtSaludo.setText("texto2 " + bundle.getString("Texto2"));
        txtSaludo.setText("texto3 " + bundle.getString("Texto3"));


    }
}
