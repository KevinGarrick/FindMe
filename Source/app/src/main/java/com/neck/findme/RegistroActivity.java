package com.neck.findme;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.neck.findme.Utilidades.Utils;

public class RegistroActivity extends AppCompatActivity {
    Button btnRegistrarse;
    EditText etNombre;
    EditText etPape;
    EditText etSape;
    EditText etUsu;
    EditText etPass;
    TextInputLayout tilNombre;
    TextInputLayout tilPapellido;
    TextInputLayout tilSapellido;
    private String textRegex = "^[a-zA-Z ]+$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        tilNombre = (TextInputLayout) findViewById(R.id.til_nombre);
        etNombre = (EditText) findViewById(R.id.reg_nombre);
        setETChangeListener(etNombre);

        tilPapellido = (TextInputLayout) findViewById(R.id.til_papellido);
        etPape = (EditText) findViewById(R.id.reg_papellido);
        setETChangeListener(etPape);

        tilSapellido = (TextInputLayout) findViewById(R.id.til_sapellido);
        etSape = (EditText) findViewById(R.id.reg_sapellido);
        setETChangeListener(etSape);

        btnRegistrarse = (Button) findViewById(R.id.btn_registro);
        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isValidForm();
            }
        });
    }

    protected boolean isValidForm() {
        boolean ret = true;
        return isValidName() && isValidPApellido() && isValidSApellido();
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
    protected void setETChangeListener(EditText et){
        et.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (!hasFocus) {
                    isValidPApellido();
                }
            }
        });
    }

}
