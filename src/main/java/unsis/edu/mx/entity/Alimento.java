package unsis.edu.mx.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//ALTER TABLE alimento RENAME COLUMN unidadId to unidad_id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "alimento")
public class Alimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlimento;
    
    @Column(name = "nombre", length = 20, nullable = false)
    private String nombre;
    
    @Column(name = "cantidad", nullable = false)
    private float cantidad;
    
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alimento")
    private Collection<AlimentoNutriente> alimentoNutrienteCollection;
    
    @JoinColumn(name = "grupoAlimentoId", referencedColumnName = "id_grupo_alimento")
    @ManyToOne(optional = false)
    private GrupoAlimento grupoAlimento;
    
    @JoinColumn(name = "unidadId", referencedColumnName = "idUnidad")
    @ManyToOne(optional = false)
    private Unidad unidad;
    //private Integer unidad_id;

    public Alimento() {
    }

    public Alimento(Long idAlimento) {
        this.idAlimento = idAlimento;
    }

    public Alimento(Long idAlimento, String nombre, float cantidad) {
        this.idAlimento = idAlimento;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Long getIdAlimento() {
        return idAlimento;
    }

    public void setIdAlimento(Long idAlimento) {
        this.idAlimento = idAlimento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public Collection<AlimentoNutriente> getAlimentoNutrienteCollection() {
        return alimentoNutrienteCollection;
    }

    public void setAlimentoNutrienteCollection(Collection<AlimentoNutriente> alimentoNutrienteCollection) {
        this.alimentoNutrienteCollection = alimentoNutrienteCollection;
    }

    public GrupoAlimento getGrupoAlimento() {
        return grupoAlimento;
    }

    public void setGrupoAlimento(GrupoAlimento grupoAlimento) {
        this.grupoAlimento = grupoAlimento;
    }

    public Unidad getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidad unidad) {
        this.unidad = unidad;
    }

	/*public Integer getUnidad_id() {
		return unidad_id;
	}

	public void setUnidad_id(Integer unidad_id) {
		this.unidad_id = unidad_id;
	}*/
}
