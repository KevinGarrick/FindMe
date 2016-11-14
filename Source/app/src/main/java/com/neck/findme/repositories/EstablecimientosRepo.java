package com.neck.findme.repositories;

import com.neck.findme.R;
import com.neck.findme.entidad.DumyEstablecimiento;
import com.neck.findme.entidad.Establecimiento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Repositorio ficticio de leads
 */
public class EstablecimientosRepo {
    private static EstablecimientosRepo repository = new EstablecimientosRepo();
    private HashMap<String, DumyEstablecimiento> dEstablecimientos = new HashMap<>();
    private static int idEst = 0;
    public static EstablecimientosRepo getInstance(int id)
    {
        idEst=id;
        return new EstablecimientosRepo();
    }

    private EstablecimientosRepo() {
        switch (idEst){
            case 2:
                saveEstablecimiento(new DumyEstablecimiento("selene", "Taqueria Selene", "Calle Río Lerma 107, Colinas del Lago, 54744 Cuautitlán Izcalli, Méx.","55 5881 0346","Si",19.6422754, -99.227582,R.drawable.taco));
                saveEstablecimiento(new DumyEstablecimiento("guero", "Antojitos Mexicanos \"Los güeros\"", "Los Pajaros, 54700 Cuautitlán Izcalli, Méx.","55 9195 1874","No",19.639919,-99.2114702, R.drawable.taco));
                break;
            case 4:
                saveEstablecimiento(new DumyEstablecimiento("china1", "Long Hang", "Andador Londres 1, esquina Primero de Mayo, Centro Urbano, 54720 Cuautitlán Izcalli, MEX, México","55 5881 5805","Si",19.652873, -99.208936,R.drawable.china));
                //saveEstablecimiento(new DumyEstablecimiento("guero", "Antojitos Mexicanos \"Los güeros\"", "Los Pajaros, 54700 Cuautitlán Izcalli, Méx.","55 9195 1874","No",19.639919,-99.2114702, R.drawable.taco));
                break;
            case 5:
                saveEstablecimiento(new DumyEstablecimiento("sushi1", "Sushi Cumbria", "Av Tianguistenco 76, Cumbria, 54740 Cuautitlán Izcalli, Méx., México","55 5868 6500","No",19.654666, -99.213053,R.drawable.sushi));
                break;
        }

    }

    private void saveEstablecimiento(DumyEstablecimiento est) {
        dEstablecimientos.put(est.getId(), est);
    }

    public List<DumyEstablecimiento> getEstablecimientos() {
        return new ArrayList<>(dEstablecimientos.values());
    }
}
