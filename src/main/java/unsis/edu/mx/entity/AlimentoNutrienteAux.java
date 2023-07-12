/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Es una clase auxiliar de la clase Alimento Nutriente, para    * 
 *              reducir las relaciones entre las entidades.                   *
 *****************************************************************************/

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
