package com.diegusweb.mediform.models;

/**
 * Created by diego.rueda on 12/3/2015.
 */
public class Formula {
    private double status;
    private String nombre;
    private String descripcion;
    private int idDrawable;

    public Formula(double status, String nombre, String descripcion, int idDrawable) {
        this.status = status;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idDrawable = idDrawable;
    }

    public double getStatus() {
        return status;
    }

    public void setStatus(double status) {
        this.status = status;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public void setIdDrawable(int idDrawable) {
        this.idDrawable = idDrawable;
    }
}
