package com.neck.findme.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.neck.findme.HomeActivity;
import com.neck.findme.R;
import com.neck.findme.entidad.DumyEstablecimiento;
import com.neck.findme.fragments.ProductosFragment;
import com.neck.findme.fragments.StoresFragment;

import java.util.List;

/**
 * Created by Kevin on 13/11/2016.
 */

public class EstablecimientoAdapterD extends ArrayAdapter<DumyEstablecimiento> {
    public EstablecimientoAdapterD(Context context, List<DumyEstablecimiento> objects) {
        super(context, 0, objects);
    }
    FragmentManager fragmentManager;
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
        fragmentManager = ((HomeActivity)getContext()).getSupportFragmentManager();
        // Referencias UI.
        ImageView imgEst = (ImageView) convertView.findViewById(R.id.iv_img_est);
        TextView nombre = (TextView) convertView.findViewById(R.id.tv_name_est);
        TextView direccion = (TextView) convertView.findViewById(R.id.tv_direccion_est);
        TextView tel = (TextView) convertView.findViewById(R.id.tv_teléfono_est);
        TextView sDomicilio = (TextView) convertView.findViewById(R.id.tv_serv_dom_est);
        Button ir = (Button)convertView.findViewById(R.id.btn_geoloc);
        Button menu = (Button)convertView.findViewById(R.id.btn_menu);
        // Lead actual.
        final DumyEstablecimiento dEst = getItem(position);

        // Setup.
        Glide.with(getContext()).load(dEst.getImg()).into(imgEst);
        nombre.setText(dEst.getNombre());
        direccion.setText(dEst.getDireccion());
        tel.setText(dEst.getTelefono());
        sDomicilio.setText(dEst.getsDomicilio());
        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+dEst.getCoordX()+","+dEst.getCoordY()+",19z("+dEst.getNombre().replace(" ","+")+")");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                view.getContext().startActivity(mapIntent);

            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle args = new Bundle();
                Fragment fragment = new ProductosFragment();
                args.putInt("eId",dEst.getEstId());
                fragment.setArguments(args);
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.main_content, fragment).addToBackStack(null)
                        .commit();
            }
        });
        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(!dEst.getTelefono().contains("N")){
                   Intent callIntent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+dEst.getTelefono().trim()));
                   view.getContext().startActivity(callIntent);
               }

            }
        });
        return convertView;
    }
}