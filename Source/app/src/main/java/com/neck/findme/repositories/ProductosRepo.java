package com.neck.findme.repositories;

import com.neck.findme.R;
import com.neck.findme.entidad.DummyProducto;
import com.neck.findme.entidad.DumyEstablecimiento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Repositorio ficticio de leads
 */
public class ProductosRepo {
    private static ProductosRepo repository = new ProductosRepo();
    private LinkedHashMap<String, DummyProducto> dProductos = new LinkedHashMap<>();

    public static ProductosRepo getInstance() {
        return repository;
    }

    private ProductosRepo() {
        saveProducto(new DummyProducto("tacos", "- Pastor\n- Suadero\n- Cabeza", "- Longaniza\n- Tripa\n- Lengua","Tacos",R.drawable.tacos));
        saveProducto(new DummyProducto("tortas", "- Pastor", "- Suadero","Tortas",R.drawable.torta));
        saveProducto(new DummyProducto("gringas",  "- Pastor", "- Suadero","Gringas",R.drawable.gringa));
        saveProducto(new DummyProducto("refrescos",  "- Sabor\n- Boing", "- Cola","Refrescos",R.drawable.refrescos));
        /*saveLead(new Establecimiento("Sara Bonz", "Directora de Marketing", "Electrical Parts ltd", R.drawable.taco));
        saveLead(new Establecimiento("Liliana Clarence", "Diseñadora de Producto", "Creativa App", R.drawable.taco));
        saveLead(new Establecimiento("Benito Peralta", "Supervisor de Ventas", "Neumáticos Press", R.drawable.taco));
        saveLead(new Establecimiento("Juan Jaramillo", "CEO", "Banco Nacional", R.drawable.taco));
        saveLead(new Establecimiento("Christian Steps", "CTO", "Cooperativa Verde", R.drawable.taco));
        saveLead(new Establecimiento("Alexa Giraldo", "Lead Programmer", "Frutisofy", R.drawable.taco));
        saveLead(new Establecimiento("Linda Murillo", "Directora de Marketing", "Seguros Boliver", R.drawable.taco));
        saveLead(new Establecimiento("Lizeth Astrada", "CEO", "Concesionario Motolox", R.drawable.taco));*/
    }

    private void saveProducto(DummyProducto prod) {
        dProductos.put(prod.getId(), prod);
    }

    public List<DummyProducto> getProductoss() {
        return new ArrayList<>(dProductos.values());
    }
}
