package com.neck.findme.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.neck.findme.R;
import com.neck.findme.adapters.EspecialidadAdapter;
import com.neck.findme.modelo.Especialidad;

public class EspecialityFragment extends Fragment {
    /**
     * Este argumento del fragmento representa el título de cada
     * sección
     */
    public static final String ARG_SECTION_TITLE = "section_number";
    protected ListView eList;
    protected EspecialidadAdapter eAdapter;

    /**
     * Crea una instancia prefabricada de {@link StoresFragment}
     *
     * @param sectionTitle Título usado en el contenido
     * @return Instancia dle fragmento
     */
    public static EspecialityFragment newInstance(String sectionTitle) {
        EspecialityFragment fragment = new EspecialityFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, sectionTitle);
        fragment.setArguments(args);
        return fragment;
    }

    public EspecialityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_especiality, container, false);
        Especialidad mEsp = new Especialidad();
        eList = (ListView)view.findViewById(R.id.list_especialidades);
        // Inicializar el adaptador con la fuente de datos.
        eAdapter = new EspecialidadAdapter(getActivity(),
                mEsp.getEspecialidades(view.getContext()));

        //Relacionando la lista con el adaptador
        eList.setAdapter(eAdapter);
        eList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                com.neck.findme.entidad.Especialidad currentEsp = eAdapter.getItem(position);
                FragmentManager fragmentManager = getFragmentManager();
                Bundle args = new Bundle();
                Fragment fragment = null;
                args.putInt("eId",currentEsp.getId());
                fragment = StoresFragment.newInstance("Locales", currentEsp.getId());
                fragment.setArguments(args);
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.main_content, fragment)
                        .commit();


            }
        });

        return view;
    }
}
