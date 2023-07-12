/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase se modelan los nutrientes, así como: peso bruto    *
 *              redondeado, peso neto, agua, etc.                             *
 *****************************************************************************/

package unsis.edu.mx.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nutrientes")
public class Nutrientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNutrientes;
 
    @Column(name = "nutriente", length = 20, nullable = false)
    private String nutriente;

    public Nutrientes() {
    }

    public Nutrientes(Integer idNutrientes) {
        this.idNutrientes = idNutrientes;
    }

    public Nutrientes(Integer idNutrientes, String nutriente) {
        this.idNutrientes = idNutrientes;
        this.nutriente = nutriente;
    }

    public Integer getIdNutrientes() {
        return idNutrientes;
    }

    public void setIdNutrientes(Integer idNutrientes) {
        this.idNutrientes = idNutrientes;
    }

    public String getNutriente() {
        return nutriente;
    }

    public void setNutriente(String nutriente) {
        this.nutriente = nutriente;
    }
}
