package com.neck.findme.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.neck.findme.R;
import com.neck.findme.entidad.Especialidad;

import java.util.ArrayList;

/**
 * Created by Kevin on 22/10/2016.
 */
public class StoresAdapter extends ArrayAdapter<Especialidad> {

    public StoresAdapter(Context context, ArrayList<Especialidad> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtener inflater.
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // ¿Existe el view actual?
        if (null == convertView) {
            convertView = inflater.inflate(
                    R.layout.list_item_establecimientos,
                    parent,
                    false);
        }

        // Referencias UI.
        ImageView avatar = (ImageView) convertView.findViewById(R.id.iv_img_est);
        TextView name = (TextView) convertView.findViewById(R.id.tv_name_est);
        TextView direction = (TextView) convertView.findViewById(R.id.tv_direccion_est);
        TextView tel = (TextView) convertView.findViewById(R.id.tv_teléfono_est);
        // Lead actual.
        Especialidad esp = getItem(position);

        // Setup.
        Glide.with(getContext()).load(R.drawable.taco).into(avatar);
        name.setText(esp.getDsc());
        //title.setText(esp.getTitle());
        //company.setText(esp.getCompany());

        return convertView;
    }
}
