package unsis.edu.mx.entity;

import java.io.Serializable;



public class AlimentoNutrienteAux implements Serializable {
    private static final long serialVersionUID = 1L;
    private float cantidad;
   
    private Nutrientes nutrientes;

    public AlimentoNutrienteAux() {
    }
   
    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Nutrientes getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(Nutrientes nutrientes) {
        this.nutrientes = nutrientes;
    }
}
