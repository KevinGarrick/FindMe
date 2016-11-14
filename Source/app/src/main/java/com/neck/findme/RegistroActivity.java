package com.neck.findme;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.neck.findme.Utilidades.Utils;


public class RegistroActivity extends AppCompatActivity {
    Button btnRegistrarse;
    EditText etNombre;
    EditText etPape;
    EditText etSape;
    EditText etEmail;
    EditText etPass;
    TextInputLayout tilNombre;
    TextInputLayout tilPapellido;
    TextInputLayout tilSapellido;
    TextInputLayout tilEmail;
    TextInputLayout tilPass;
    private String textRegex = "^[a-zA-Z ]+$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        tilNombre = (TextInputLayout) findViewById(R.id.til_nombre);
        etNombre = (EditText) findViewById(R.id.reg_nombre);
        setETChangeListener(etNombre, "nombre");

        tilPapellido = (TextInputLayout) findViewById(R.id.til_papellido);
        etPape = (EditText) findViewById(R.id.reg_papellido);
        setETChangeListener(etPape, "primero");

        tilSapellido = (TextInputLayout) findViewById(R.id.til_sapellido);
        etSape = (EditText) findViewById(R.id.reg_sapellido);
        setETChangeListener(etSape, "segundo");

        tilEmail = (TextInputLayout) findViewById(R.id.til_email);
        etEmail = (EditText) findViewById(R.id.reg_email);
        setETChangeListener(etEmail, "correo");

        tilPass = (TextInputLayout) findViewById(R.id.til_pass);
        etPass = (EditText) findViewById(R.id.reg_password);
        setETChangeListener(etPass, "pass");

        btnRegistrarse = (Button) findViewById(R.id.btn_registro);
        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isValidForm()) {
                    com.neck.findme.modelo.Usuario u = new com.neck.findme.modelo.Usuario();
                    if (u.crearNuevo(view.getContext(), Utils.getValue(etEmail), Utils.getValue(etPass), Utils.getValue(etNombre), Utils.getValue(etPape), Utils.getValue(etSape))) {
                        Toast.makeText(getApplicationContext(), "Usuario registrado exitosamente", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(view.getContext(), LoginActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), "Hubo un error al registrar el usuario intente mas tarde", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

    protected boolean isValidForm() {
        return isValidName() && isValidPApellido() && isValidSApellido() && esCorreoValido();
    }

    protected boolean isValidName() {
        boolean ret = true;
        if (!Utils.isValidRegex(textRegex, etNombre.getText().toString())) {
            tilNombre.setErrorEnabled(true);
            tilNombre.setError("Debes ingresar un nombre valido");
            ret = false;
        } else {
            tilNombre.setError(null);
            tilNombre.setErrorEnabled(false);
        }
        return ret;
    }

    protected boolean isValidPApellido() {
        boolean ret = true;
        if (!Utils.isValidRegex(textRegex, etPape.getText().toString())) {
            tilPapellido.setErrorEnabled(true);
            tilPapellido.setError("Debes ingresar un apellido valido");
            ret = false;
        } else {
            tilPapellido.setError(null);
            tilPapellido.setErrorEnabled(false);
        }
        return ret;
    }

    protected boolean isValidSApellido() {
        boolean ret = true;
        if (!etSape.getText().toString().isEmpty()) {
            if (!Utils.isValidRegex(textRegex, etSape.getText().toString())) {
                tilSapellido.setErrorEnabled(true);
                tilSapellido.setError("Debes ingresar un apellido valido");
                ret = false;
            }
        }
        if (ret) {
            tilSapellido.setError(null);
            tilSapellido.setErrorEnabled(false);
        }
        return ret;
    }

    private boolean esCorreoValido() {
        boolean ret = true;
        if (!Patterns.EMAIL_ADDRESS.matcher(etEmail.getText().toString()).matches()) {
            tilEmail.setErrorEnabled(true);
            tilEmail.setError("Debes ingresar un E-mail valido");
            ret = false;
        } else {
            tilEmail.setError(null);
            tilEmail.setErrorEnabled(false);
        }
        return ret;
    }

    private boolean isValidPass() {
        boolean ret = true;
        if (etPass.getText().toString().length() < 6 || etPass.getText().toString().length() > 20) {
            tilPass.setErrorEnabled(true);
            tilPass.setError("La contraseña debe contener entr 6 y 20 caracteres");
            ret = false;
        } else {
            tilPass.setError(null);
            tilPass.setErrorEnabled(false);
        }
        return ret;
    }


    protected void setETChangeListener(EditText et, final String action) {
        et.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    switch (action) {
                        case "nombre":
                            isValidName();
                            break;
                        case "primero":
                            isValidPApellido();
                            break;
                        case "segundo":
                            isValidSApellido();
                            break;
                        case "correo":
                            esCorreoValido();
                            break;
                        case "pass":
                            isValidPass();
                            break;
                    }

                }
            }
        });
    }


}
