package com.dgd.pizzas.domain.models;

public class Carbonara extends Pizza{
    private Boolean queso_azul;
    private Boolean queso_cabra;

    public Boolean getQueso_azul() {
        return queso_azul;
    }

    public void setQueso_azul(Boolean queso_azul) {
        this.queso_azul = queso_azul;
    }

    public Boolean getQueso_cabra() {
        return queso_cabra;
    }

    public void setQueso_cabra(Boolean queso_cabra) {
        this.queso_cabra = queso_cabra;
    }
}
