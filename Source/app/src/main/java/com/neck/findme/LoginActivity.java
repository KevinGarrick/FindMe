package com.neck.findme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.neck.findme.modelo.Usuario;

import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Usuario usuario = new Usuario();
       // usuario.crearNuevo(this,"kevin.saaul@gamil.com","123","Kevin","Arriaga", "Araizaga");
        ArrayList<com.neck.findme.entidad.Usuario> usuarios = usuario.obtenerUsuarios(this);
        for (com.neck.findme.entidad.Usuario usuarioE : usuarios){
            tv = (TextView)findViewById(R.id.uno);
            tv.setText(usuarioE.getEmail());
        }

    }
}
