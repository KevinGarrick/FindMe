package com.neck.findme.repositories;

import com.neck.findme.R;
import com.neck.findme.entidad.DumyEstablecimiento;
import com.neck.findme.entidad.Establecimiento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Repositorio ficticio de leads
 */
public class EstablecimientosRepo {
    private static EstablecimientosRepo repository = new EstablecimientosRepo();
    private LinkedHashMap<String, DumyEstablecimiento> dEstablecimientos = new LinkedHashMap<>();
    private static int idEst = 0;

    public static EstablecimientosRepo getInstance(int id) {
        idEst = id;
        return new EstablecimientosRepo();
    }

    private EstablecimientosRepo() {
        switch (idEst) {
            case 2:
                saveEstablecimiento(new DumyEstablecimiento("selene", "Taqueria Selene", "Calle Río Lerma 107, Colinas del Lago, 54744 Cuautitlán Izcalli, Méx.", "55 5881 0346", "Si", 19.6422754, -99.227582, R.drawable.taco, idEst));
                saveEstablecimiento(new DumyEstablecimiento("guero", "Antojitos Mexicanos \"Los güeros\"", "Los Pajaros, 54700 Cuautitlán Izcalli, Méx.", "55 9195 1874", "No", 19.6397384, -99.2109180, R.drawable.taco, idEst));
                break;
            case 4:
                saveEstablecimiento(new DumyEstablecimiento("china1", "Long Hang", "Andador Londres 1, esquina Primero de Mayo, Centro Urbano, 54720 Cuautitlán Izcalli, MEX, México", "55 5881 5805", "Si", 19.652873, -99.208936, R.drawable.china, idEst));
                saveEstablecimiento(new DumyEstablecimiento("china2", "Restaurante Buffet Lin China", "Av, Temoaya 18, Centro Urbano, 54740 Cuautitlán Izcalli, Méx., México", "55 1113 4203", "No", 19.652274, -99.207073, R.drawable.china, idEst));
                break;
            case 5:
                saveEstablecimiento(new DumyEstablecimiento("sushi1", "Sushi Cumbria", "Av Tianguistenco 76, Cumbria, 54740 Cuautitlán Izcalli, Méx., México", "55 5868 6500", "Si", 19.654666, -99.213053, R.drawable.sushi, idEst));
                saveEstablecimiento(new DumyEstablecimiento("sushi2", "KiKuyoshi", "Av. Toluca 142, Cumbria, 54740 Cuautitlán Izcalli, Méx., México", "N/A", "No", 19.653329, -99.210142, R.drawable.sushi, idEst));
                break;
            case 6:
                saveEstablecimiento(new DumyEstablecimiento("pan1", "Pastelería Rivera", "Unicornio 1, Ensueños, 54740 Cuautitlán Izcalli, Méx.", "N/A", "No", 19.659645, -99.212818, R.drawable.cake, idEst));
                saveEstablecimiento(new DumyEstablecimiento("pan2", "Pastelería Tepalcapa", "Av. Adolfo Lopez Mateos 10, Santiago Tepalcapa, 54743 Cuautitlán Izcalli, Méx.", "55 5893 1936", "No", 19.623917, -99.195450, R.drawable.cake, idEst));
                saveEstablecimiento(new DumyEstablecimiento("pan3", "Panaderia Lecaroz - Ayegui", "Avenida Adolfo López Mateos 55, Luis Echeverría, Luis Echeverria, 54760 Cuautitlán Izcalli, Méx.", "55 5397 0833", "Si", 19.622972, -99.203888, R.drawable.cake, idEst));
                break;

            case 7:
                saveEstablecimiento(new DumyEstablecimiento("burguer1", "El rodeo", "Av. Toluca 2, Cumbria, 54740 Cuautitlán Izcalli, Méx.", "N/A", "No", 19.652939, -99.211766, R.drawable.burguer, idEst));
                saveEstablecimiento(new DumyEstablecimiento("burguer2", "El güero", "Centauros 3G, Ensueños, 54740 Cuautitlán Izcalli, Méx.", "N/A", "No", 19.661969, -99.211861, R.drawable.burguer, idEst));
                saveEstablecimiento(new DumyEstablecimiento("burguer3", "Beric Burguer", "Blvd. Cuautitlán Izcalli Atizapán #92, Boulevard, Villas de la Hacienda, 52926 Cd López Mateos, Méx.", "55 5887 0157", "Si", 19.591719, -99.231332, R.drawable.burguer, idEst));
                saveEstablecimiento(new DumyEstablecimiento("burguer4", "El arco", "Av. Benito Juárez 4, San Sebastian Xhala, 54714 Cuautitlán Izcalli, Méx.", "N/A", "No", 19.689693, -99.187050, R.drawable.burguer, idEst));
                break;
            case 9:
                saveEstablecimiento(new DumyEstablecimiento("alitas1", "Red wings", "A54740, Cenegal 33, Atlanta, Cuautitlán Izcalli, Méx", "5908 7781", "No", 19.6423359, -99.2122865, R.drawable.chicken, idEst));
                saveEstablecimiento(new DumyEstablecimiento("alitas2", "Izc-alitas ", " Av. Primero de Mayo s/n, Santiago Tepalcapa, 54143 Cuatitlan Izcalli, Méx.", "5065 4882", "No", 19.6303049, -99.2755245, R.drawable.chicken, idEst));
                saveEstablecimiento(new DumyEstablecimiento("alitas3", "Las Alas Wings House", "Centauros, Ensueños, 54740 Cuautitlán Izcalli, Méx.", "55 9168 6226", "No", 19.6617479, -99.2833193, R.drawable.chicken, idEst));
                saveEstablecimiento(new DumyEstablecimiento("alitas4", "Wings Army", "Avenida Primero de Mayo, Cumbria, 54720 Cuautitlán Izcalli, Méx.", "55 5868 6683", "No", 19.6423359, -99.2122865, R.drawable.chicken, idEst));
                break;
            case 10:
                saveEstablecimiento(new DumyEstablecimiento("piza1", "Erick Pizza", "Calle nogales Mz.25, Lt.31, esquina pistachos, Bosques de Morelos", "5861 5121", "Si", 19.6322508,-99.2306986, R.drawable.pizza, idEst));
                saveEstablecimiento(new DumyEstablecimiento("pizza2", "Bonny Pizza", "Av. de las Musas esq. Orion en Cuautitlan Izcalli", "1113 1498\n", "Si", 19.6574648,-99.215883, R.drawable.pizza, idEst));
                saveEstablecimiento(new DumyEstablecimiento("pizza3", "Beny's", "Plaza Comercial de la Alba, Av. Adolfo López Mateos sn Local 24, Tepalcapa, 54743 Cuautitlán Izcalli, Méx.", "55 5893 5921", "Si", 19.6274888,-99.2780609 , R.drawable.pizza, idEst));
                break;
            case 14:
                saveEstablecimiento(new DumyEstablecimiento("postre1", "La Reyna Michoacana", "Av. Toluca, Cumbria, 54740 Cuautitlán Izcalli, Méx., México", "N/A", "No", 19.6531211, -99.2135516, R.drawable.helado, idEst));
                saveEstablecimiento(new DumyEstablecimiento("postre2", "Churrolandia", " Avenida Toluca 142, Cumbria, Cuautitlán Izcalli, Méx.", "N/A", "No", 19.6533829,-99.2797209, R.drawable.helado, idEst));
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
