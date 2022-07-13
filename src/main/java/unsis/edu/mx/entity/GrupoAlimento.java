package unsis.edu.mx.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "grupo_alimento")
public class GrupoAlimento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_grupo_alimento", nullable = false)
	private Long idGrupoAlimento;
	
	@Column(name = "tipo", length = 50, nullable = false)
	private String tipo;

	public GrupoAlimento() {
	}

	public Long getIdGrupoAlimento() {
		return idGrupoAlimento;
	}

	public void setIdGrupoAlimento(Long idGrupoAlimento) {
		this.idGrupoAlimento = idGrupoAlimento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
