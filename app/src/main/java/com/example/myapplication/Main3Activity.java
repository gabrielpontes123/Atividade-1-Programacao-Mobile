package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;


public class Main3Activity extends AppCompatActivity {

    private static final HashMap<String, String> usuariosMap = new HashMap<>();

    EditText editTextLogin;
    EditText editTextPass;
    Button btnLimpar;
    Button btnOk;

    {

        usuariosMap.put("joze", "123");
        usuariosMap.put("maria", "123");
        usuariosMap.put("joao", "123");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editTextLogin = findViewById(R.id.editTextLogin);
        editTextPass = findViewById(R.id.editTextPassord);
        btnLimpar = findViewById(R.id.btnLimparCampos);
        btnOk = findViewById(R.id.btnOk);

        this.btnOk.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String nomeDeUsuarioInformado = editTextLogin.getText().toString();
                String senhaDeUsuarioInformada = editTextPass.getText().toString();

                Toast.makeText(getApplicationContext(),
                        "editTextLogin.getText()="+editTextLogin.getText(),
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getApplicationContext(),
                        "editTextLogin.getText()="+editTextPass.getText(),
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getApplicationContext(),
                        "editTextLogin.getText().toString()="+editTextLogin.getText().toString(),
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getApplicationContext(),
                        "editTextPass.getText().toString()="+editTextLogin.getText().toString(),
                        Toast.LENGTH_LONG).show();

                Toast.makeText(getApplicationContext(),
                        "senhaDeUsuarioInformada="+senhaDeUsuarioInformada,
                        Toast.LENGTH_LONG).show();

                String passwCadastrado = Main3Activity.usuariosMap.get(nomeDeUsuarioInformado);

                if(passwCadastrado != null && passwCadastrado.equals(senhaDeUsuarioInformada)) {
                    Toast.makeText(getApplicationContext(),"Login Sucesso!", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(getApplicationContext(),"Login efetuado com Sucesso!", Toast.LENGTH_LONG).show();


            }
        }

        });
    }

}
