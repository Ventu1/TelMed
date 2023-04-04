package ar.edu.unnoba.poo.login.entidades;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name= "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Email
	private String email;
	@Column(name="contrasenia")
	private String contrasenia;
	@Column(name="rol")
	private String rol;
	@Column(name="nombre")
	private String nombre;
	@Column(name="bloqueado")
	private Boolean bloqueado;
	@OneToOne(mappedBy="usuario")
	private Medico medico;
	@OneToOne(mappedBy="usuario")
	private Paciente paciente;
	
	public Usuario() {
		super();
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	public String getRol() {
		return rol;
	}
	
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Boolean getBloqueado() {
		return !bloqueado;
	}
	
	public void setBloqueado(Boolean bloqueado) {
		this.bloqueado = !bloqueado;
	}	
}
