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
import java.util.List;

/**
 * Created by Kevin on 22/10/2016.
 */
public class EspecialidadAdapter extends ArrayAdapter<Especialidad> {

    public EspecialidadAdapter(Context context, ArrayList<Especialidad> objects) {
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
                    R.layout.list_item_especialidad,
                    parent,
                    false);
        }

        // Referencias UI.
        ImageView avatar = (ImageView) convertView.findViewById(R.id.iv_img_esp);
        TextView name = (TextView) convertView.findViewById(R.id.tv_name);

        // Lead actual.
        Especialidad esp = getItem(position);

        // Setup.
        Glide.with(getContext()).load(R.drawable.cutlery).into(avatar);
        name.setText(esp.getDsc());
        //title.setText(esp.getTitle());
        //company.setText(esp.getCompany());

        return convertView;
    }
}
