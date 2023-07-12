/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase se modelan las unidades, por ejemplo: Taza (Tza),  *
 *              Pieza (Pza), Gramo (gr), etc.                                 *
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
@Table(name = "unidad")
public class Unidad implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUnidad;
    
    @Column(name = "tipo", length = 30, nullable = false)
    private String tipo;
    
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unidad")
//    private Collection<Alimento> alimentoCollection;

    public Unidad() {
    }

    public Unidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public Unidad(Integer idUnidad, String tipo) {
        this.idUnidad = idUnidad;
        this.tipo = tipo;
    }

    public Integer getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

//    public Collection<Alimento> getAlimentoCollection() {
//        return alimentoCollection;
//    }
//
//    public void setAlimentoCollection(Collection<Alimento> alimentoCollection) {
//        this.alimentoCollection = alimentoCollection;
//    }
}
