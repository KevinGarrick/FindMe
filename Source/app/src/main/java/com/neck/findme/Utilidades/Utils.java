package com.neck.findme.Utilidades;

import android.widget.EditText;

import java.util.regex.Pattern;

/**
 * Created by Kevin on 10/09/2016.
 */
public class Utils {
    public static boolean isValidRegex(String regex, String toValidate)
    {
        Pattern patron = Pattern.compile(regex);
        return patron.matcher(toValidate).matches();
    }
    public static String getValue(EditText et){
        return et.getText().toString().trim();
    }
}
