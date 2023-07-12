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

package unsis.edu.mx.payload.request;

import java.util.Set;
import javax.validation.constraints.*;
 
public class SignupRequest {
	@NotBlank
    @Size(min = 3, max = 45)
    private String nombre;

	@NotBlank
    @Size(min = 3, max = 45)
    private String apellidoPaterno;

	@NotBlank
    @Size(min = 3, max = 45)
    private String apellidoMaterno;
    
	@NotBlank
    @Size(min = 3, max = 50)
    private String institucion;
    
    private int acceso;
	
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;
 
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;
    
    private Set<String> role;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
    
    
  
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
    
    public Set<String> getRole() {
      return this.role;
    }
    
    public void setRole(Set<String> role) {
      this.role = role;
    }
}
