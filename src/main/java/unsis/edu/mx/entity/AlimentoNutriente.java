/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase modela una relación etre la entidad alimento y la  *
 *              entidad nutriente.                                            *
 *****************************************************************************/

package unsis.edu.mx.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "alimento_nutriente")
public class AlimentoNutriente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alimento_nutriente", nullable = false)
    private Long idAlimentoNutriente;
 
    @Column(name = "cantidad", nullable = false)
    private float cantidad;
    
    @JsonIgnore
    @JoinColumn(name = "alimento_id", referencedColumnName = "idAlimento")
    @ManyToOne(optional = false)
    private Alimento alimento;
    
    @JsonIgnore
    @JoinColumn(name = "nutriente_id", referencedColumnName = "idNutrientes")
    @ManyToOne(optional = false)
    private Nutrientes nutrientes;

    public AlimentoNutriente() {
    }

    public AlimentoNutriente(Long idAlimentoNutriente) {
        this.idAlimentoNutriente = idAlimentoNutriente;
    }

    public AlimentoNutriente(Long idAlimentoNutriente, float cantidad) {
        this.idAlimentoNutriente = idAlimentoNutriente;
        this.cantidad = cantidad;
    }

    public Long getIdAlimentoNutriente() {
        return idAlimentoNutriente;
    }

    public void setIdAlimentoNutriente(Long idAlimentoNutriente) {
        this.idAlimentoNutriente = idAlimentoNutriente;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public Nutrientes getNutrientes() {
        return nutrientes;
    }

    public void setNutrientes(Nutrientes nutrientes) {
        this.nutrientes = nutrientes;
    }
}
