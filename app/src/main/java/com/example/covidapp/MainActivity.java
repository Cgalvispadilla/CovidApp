package com.example.covidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private EditText etUsuario, etContraseña;
    private Button btnLogin;
    private ProgressBar pbLogin;
    private String us="";
    private String c="";
    private boolean autenticado = false;
    public boolean isAutenticado() {
        if(etUsuario.getText().toString().equals(us) && etContraseña.getText().toString().equals(c)){
            return true;
        }else{
            return false;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        etContraseña = (EditText) findViewById(R.id.etContraseña);
        etUsuario = (EditText) findViewById(R.id.etUser);
        btnLogin = (Button) findViewById(R.id.btLogin);
        pbLogin = (ProgressBar) findViewById(R.id.pbLogin);
    }

    @Override
    protected void onStart() {
        super.onStart();
        pbLogin.setVisibility(View.INVISIBLE);
    }
}
