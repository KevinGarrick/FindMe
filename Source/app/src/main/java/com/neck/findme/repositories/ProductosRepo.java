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
    private static int idEst = 0;

    public static ProductosRepo getInstance(int id) {
        idEst = id;
        return new ProductosRepo();
    }

    private ProductosRepo() {
        switch (idEst) {
            case 2:
                saveProducto(new DummyProducto("tacos", "- Pastor\n- Suadero\n- Cabeza", "- Longaniza\n- Tripa\n- Lengua", "Tacos", R.drawable.tacos));
                saveProducto(new DummyProducto("tortas", "- Pastor", "- Suadero", "Tortas", R.drawable.torta));
                saveProducto(new DummyProducto("gringas", "- Pastor", "- Suadero", "Gringas", R.drawable.gringa));
                saveProducto(new DummyProducto("refrescos", "- Sabor\n- Boing", "- Cola", "Refrescos", R.drawable.refrescos));
                break;
            case 4:
                saveProducto(new DummyProducto("entradas", "- Rollo Primavera\n- Costilla de Cerdo\n   al Horno\n- Won Ton Frito\n- Entremes Hong Kong", "- Alitas de Pollo\n- Camarones Estilo\n  Jiu Yim\n- Wol Tip Cha Siu", "Entradas", R.drawable.rollos_primavera));
                saveProducto(new DummyProducto("sopas", "- Buda\n- Szechwan", "- Fideos Chinos\n - Won Ton a la Wong", "Sopas", R.drawable.fideos_chinos));
                saveProducto(new DummyProducto("fuertes", "- Chop Suey\n- Pollo Agridulce\n- Pollo Frito\n- Pescado Fan Sun\n- Pescado Kun Pao\n Chow Fan de Camarón", "- Cerdo Agridulce\n -Cerdo Chin King\n- Tit Pan\n- Res en Salsa\n   de Ostiones", "Plato Fuerte", R.drawable.comida_china));
                saveProducto(new DummyProducto("postres", "- Helado frito\n- Galleta de\n   la Fortuna", "- Nian Gao\n- Douhua", "Postres", R.drawable.helado_frito));
                saveProducto(new DummyProducto("bebidas", "- Limonada\n- Naranjada\n- Refresco Embotellado", "- Cerveza Nacional\n- Cerveza Importada", "Bebidas", R.drawable.limonada));
                break;
            case 5:
                saveProducto(new DummyProducto("entradas", "- Tostadas de salmón \n- Nuggets de jaiba\n- Espárragos a\n   la parrilla\n- Camarones crujientes", "- Ravioles japoneses\n- Tenazas de cangrejo\n  empanizadas\n- Tártara de atún", "Entradas", R.drawable.camarones));
                saveProducto(new DummyProducto("brochetas", "- Kushiage", "Yakitori", "Brochetas", R.drawable.brochetas));
                saveProducto(new DummyProducto("sopas", "- Misoshiro\n- Torizosui", "- Sumashi\n- Miso Especial", "Sopas", R.drawable.sopa_miso));
                saveProducto(new DummyProducto("arroz", "- Yakimeshi\n Gohan", "- Donburi\n Chirashi", "Arroz", R.drawable.arroz));
                saveProducto(new DummyProducto("rollos", "- Queso\n- Carrusel\n- Kiuri\n- Avocado\n- Filadelfia", "- California\n- Manchego\n- Ebi \n- Green\n- Spicy", "Rollos", R.drawable.comida_china));
                saveProducto(new DummyProducto("postres", "- Banana Maki\n- Banana Ice\n- Matcha Cake", "- Coco Cream\n- Camelado\n- Tempura Helado", "Postres", R.drawable.helado_frito));
                saveProducto(new DummyProducto("bebidas", "- Limonada\n- Naranjada\n- Refresco Embotellado", "- Cerveza Nacional\n- Cerveza Importada", "Bebidas", R.drawable.limonada));

                break;
            case 6:
                saveProducto(new DummyProducto("pasteles", "- Cajeta\n- Nuez\n- Tres Leches\n- Fresa\n - Zarzamora", "- Durazno\n- Chocolate\n- Vainilla\n- Combinado\n - Fondant","Pasteles", R.drawable.pastel));
                saveProducto(new DummyProducto("pan","- Bolillo\n- Oreja\n- Galletas\n- Trenzas\n- Milhojas","- Empanadas\n- Bagguette\n- Mini Pasteles\n- Telera", "Pan", R.drawable.pan));
                saveProducto(new DummyProducto("bebidas","- Café Americano\n- Café Late","- Café Capuccino\n- Chocolate", "Bebidas", R.drawable.cafe));
                break;
            case 7:
                saveProducto(new DummyProducto("hamburguesas", "- Hawaiana\n- Pollo", "- Res\n- Especial", "Hamburguesas", R.drawable.hamburguesa));
                saveProducto(new DummyProducto("comlplementos", "- Papas a la francesa", "- Refrescos", "Complementos", R.drawable.francesas));
                break;
            case 9:
                saveProducto(new DummyProducto("hamburguesas", "- BBQ\n- Parmesano\n- Mango\n- Tamarindo","- Fresa\n- Habanero\n- Cajun\n- Spicy", "Alitas", R.drawable.alitas));
                saveProducto(new DummyProducto("comlplementos", "- Papas a la francesa\n- Costillas", "- Hot Dogs\n- Refrescos", "Complementos", R.drawable.costillitas));
                break;
            case 10:
                saveProducto(new DummyProducto("pizzas", "- Carnes Frias\n- Canadiense\n- Mexicana\n- Florentina\n- Hawaiana\n- Marinera","- Peperonni\n- Cuibana\n- Vegetariana\n- Al Pastor\n- Azteca", "Pizzas", R.drawable.pizzas));
                saveProducto(new DummyProducto("comlplementos", "- Papas a la francesa\n- Espagueti", "- Empanadas\n- Refrescos", "Complementos", R.drawable.pasta));
                break;
            case 14:
                saveProducto(new DummyProducto("helados", "- Zarzamora\n- Vainilla\n- Cajeta\n- Fresa","- Chocomenta\n- Chocolate\n- Nuez\n- Limon", "Helados", R.drawable.helados));
                saveProducto(new DummyProducto("paletas", "- Zarzamora\n- Mango\n- Choco Nuez\n- Frutas","- Enchilada\n- Sandia\n- Vainilla\n- Limon", "Paletas", R.drawable.paletas));
                saveProducto(new DummyProducto("aguas", "- Horchata\n- Limon\n- Melon","- Naranja\n- Sandia\n- Frutas", "Aguas Frescas", R.drawable.aguas_frescas));
                saveProducto(new DummyProducto("especiales", "- Banana Split\n - Frappes\n- Canasta de Helado","- Copa imperial\n- Cheese Cake\"", "Especiales", R.drawable.banana_split));
                break;
        }

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
