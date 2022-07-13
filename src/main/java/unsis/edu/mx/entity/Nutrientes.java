package unsis.edu.mx.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "nutrientes")
public class Nutrientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNutrientes;
 
    @Column(name = "nutriente", length = 20, nullable = false)
    private String nutriente;
    
   // @JsonIgnore
   /* @OneToMany(cascade = CascadeType.ALL, mappedBy = "nutrientes")
    private Collection<AlimentoNutriente> alimentoNutrienteCollection;*/

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

   /* public Collection<AlimentoNutriente> getAlimentoNutrienteCollection() {
        return alimentoNutrienteCollection;
    }

    public void setAlimentoNutrienteCollection(Collection<AlimentoNutriente> alimentoNutrienteCollection) {
        this.alimentoNutrienteCollection = alimentoNutrienteCollection;
    }*/
}
