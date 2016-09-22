package com.neck.findme;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.neck.findme.Utilidades.Utils;
import com.neck.findme.entidad.Persona;
import com.neck.findme.modelo.Usuario;

import java.util.ArrayList;

public class LoginActivity extends Activity {
    EditText user;
    EditText pass;
    TextView registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.et_user);
        pass = (EditText) findViewById(R.id.et_pswd);
        Button login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Usuario u = new Usuario();
                /*ArrayList<com.neck.findme.entidad.Usuario>lstUsers = u.obtenerUsuarios(view.getContext());
                String users="";

                for(com.neck.findme.entidad.Usuario user : lstUsers ){
                    users += user.getEmail()+":"+user.getContrasenia() +";";
                }
                registro.setText(users);*/
                Persona p = u.iniciarSesion(view.getContext(), Utils.getValue(user), Utils.getValue(pass));
                if (p != null) {
                    Intent intent = new Intent(view.getContext(), HomeActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Usario y/o contraseñas invalidos.", Toast.LENGTH_LONG).show();
                }
            }
        });
        registro= (TextView)findViewById(R.id.registrate);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),RegistroActivity.class);
                startActivity(intent);
            }
        });

    }
}
