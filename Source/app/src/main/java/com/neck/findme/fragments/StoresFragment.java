package com.neck.findme.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import android.widget.Button;
import android.widget.ListView;


import com.neck.findme.R;
import com.neck.findme.adapters.EspecialidadAdapter;
import com.neck.findme.adapters.EstablecimientoAdapterD;
import com.neck.findme.modelo.Especialidad;
import com.neck.findme.repositories.EstablecimientosRepo;


public class StoresFragment extends Fragment {
    /**
     * Este argumento del fragmento representa el título de cada
     * sección
     */
    public static final String ARG_SECTION_TITLE = "section_number";
    protected ListView eList;
    protected EstablecimientoAdapterD eAdapter;

    protected Button ir;
    /**
     * Crea una instancia prefabricada de {@link StoresFragment}
     *
     * @param sectionTitle Título usado en el contenido
     * @return Instancia dle fragmento
     */
    public static StoresFragment newInstance(String sectionTitle,int idEst) {
        idEst =idEst;
        StoresFragment fragment = new StoresFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, sectionTitle);
        args.putInt("idEst",idEst);
        fragment.setArguments(args);
        return fragment;
    }

    public StoresFragment() {
    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = this.getArguments();
        View view = inflater.inflate(R.layout.fragment_stores, container, false);
        eList = (ListView)view.findViewById(R.id.list_establecimientos);
        // Inicializar el adaptador con la fuente de datos.

        eAdapter = new EstablecimientoAdapterD(getActivity(),
                EstablecimientosRepo.getInstance(bundle.getInt("eId")).getEstablecimientos());
        //Relacionando la lista con el adaptador
        eList.setAdapter(eAdapter);


        return view;
    }
}
