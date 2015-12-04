package com.diegusweb.mediform.models;

import com.diegusweb.mediform.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by diego.rueda on 12/3/2015.
 */
public class Formulas {
    private float precio;
    private String nombre;
    private int idDrawable;

    public Formulas(float precio, String nombre, int idDrawable) {
        this.precio = precio;
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public static final List<Formulas> COMIDAS_POPULARES = new ArrayList<Formulas>();
    public static final List<Formulas> BEBIDAS = new ArrayList<>();
    public static final List<Formulas> POSTRES = new ArrayList<>();
    public static final List<Formulas> PLATILLOS = new ArrayList<>();

    static {
        COMIDAS_POPULARES.add(new Formulas(5, "Camarones Tismados", R.drawable.camarones));
        COMIDAS_POPULARES.add(new Formulas(3.2f, "Rosca Herbárea", R.drawable.rosca));
        COMIDAS_POPULARES.add(new Formulas(12f, "Sushi Extremo", R.drawable.sushi));
        COMIDAS_POPULARES.add(new Formulas(9, "Sandwich Deli", R.drawable.sandwich));
        COMIDAS_POPULARES.add(new Formulas(34f, "Lomo De Cerdo Austral", R.drawable.lomo_cerdo));
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }
}