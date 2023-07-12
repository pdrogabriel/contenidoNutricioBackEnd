/******************************************************************************
 * @Directora del proyecto: Sabina López Toledo                               *
 * @Coordinadora y Desarrolladora: Silviana Juárez Chalini                    *
 * @Desarrollador: Rolando Pedro Gabriel                                      *
 * Fecha de Creación: 22/04/2022                                              *
 * Fecha de Actualización: 11/07/2023                                         *
 * Descripción: Esta clase se toma tal cual del siguiente repositorio:        *
 *              https://www.bezkoder.com/spring-boot-jwt-authentication/      *
 *                                                                            *
 *                                                                            *
 *              Además se le agregan los campos de nombre, apellidoPaterno,   *
 *              apellidoMaterno, institucion y acceso. Los cambios también se *
 *              realizan en la base de datos.                                 *
 *****************************************************************************/

package unsis.edu.mx.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "users",
uniqueConstraints = {
    @UniqueConstraint(columnNames = "username"),
    @UniqueConstraint(columnNames = "email")
})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;

    @Column(name = "apellidoPaterno", length = 45, nullable = true)
    private String apellidoPaterno;

    @Column(name = "apellidoMaterno", length = 45, nullable = true)
    private String apellidoMaterno;
    
    @Column(name = "institucion", length = 100, nullable = true)
    private String institucion;
    
    @Column(name = "acceso", nullable = false)
    private int acceso;
    
    @Column(name = "username", length = 50, nullable = true)
    private String username;

    @Column(name = "email", length = 50, nullable = true)
    private String email;

    @Column(name = "password", length = 35, nullable = true)
    private String password;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles", 
               joinColumns = @JoinColumn(name = "user_id"),
               inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User(String username, String email, String password) {        
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
    public User(String nombre, String apellidoPaterno, String apellidoMaterno, String institucion, int acceso,
			String username, String email, String password) {
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.institucion = institucion;
		this.acceso = acceso;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getInstitucion() {
		return institucion;
	}

	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}

	public int getAcceso() {
		return acceso;
	}

	public void setAcceso(int acceso) {
		this.acceso = acceso;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
