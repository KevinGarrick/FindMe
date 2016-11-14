package com.neck.findme.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.neck.findme.R;
import com.neck.findme.adapters.EstablecimientoAdapterD;
import com.neck.findme.adapters.ProductoAdapterD;
import com.neck.findme.modelo.Especialidad;
import com.neck.findme.repositories.EstablecimientosRepo;
import com.neck.findme.repositories.ProductosRepo;


public class ProductosFragment extends Fragment {
    /**
     * Este argumento del fragmento representa el título de cada
     * sección
     */
    public static final String ARG_SECTION_TITLE = "section_number";
    protected ListView eList;
    protected ProductoAdapterD pAdapter;

    /**
     * Crea una instancia prefabricada de {@link StoresFragment}
     *
     * @param sectionTitle Título usado en el contenido
     * @return Instancia dle fragmento
     */
    public static ProductosFragment newInstance(String sectionTitle) {
        ProductosFragment fragment = new ProductosFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, sectionTitle);
        fragment.setArguments(args);
        return fragment;
    }

    public ProductosFragment() {
    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_stores, container, false);
        Especialidad mEsp = new Especialidad();
        eList = (ListView)view.findViewById(R.id.list_establecimientos);
        // Inicializar el adaptador con la fuente de datos.
        /*eAdapter = new EspecialidadAdapter(getActivity(),
                mEsp.getEspecialidades(this.getContext()));*/
        pAdapter = new ProductoAdapterD(getActivity(),
                ProductosRepo.getInstance().getProductoss());
        //Relacionando la lista con el adaptador
        eList.setAdapter(pAdapter);
        return view;
    }
}
