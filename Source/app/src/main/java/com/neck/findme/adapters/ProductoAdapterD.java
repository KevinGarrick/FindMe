package com.neck.findme.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.neck.findme.R;
import com.neck.findme.entidad.DummyProducto;
import com.neck.findme.entidad.DumyEstablecimiento;

import java.util.List;

/**
 * Created by Kevin on 13/11/2016.
 */

public class ProductoAdapterD extends ArrayAdapter<DummyProducto> {
    public ProductoAdapterD(Context context, List<DummyProducto> objects) {
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
                    R.layout.list_item_productos,
                    parent,
                    false);
        }

        // Referencias UI.
        ImageView imgProd = (ImageView) convertView.findViewById(R.id.iv_img_prod);
        TextView title = (TextView) convertView.findViewById(R.id.tv_name_prod);
        TextView left = (TextView) convertView.findViewById(R.id.tv_productos_l);
        TextView right = (TextView) convertView.findViewById(R.id.tv_productos_r);

        // Lead actual.
        final DummyProducto dProd = getItem(position);

        // Setup.
        Glide.with(getContext()).load(dProd.getImg()).override(800, 300).into(imgProd);
        title.setText(dProd.getProductoServicio());
        left.setText(dProd.getLeftProducts());
        right.setText(dProd.getRightProducts());

        return convertView;
    }
}