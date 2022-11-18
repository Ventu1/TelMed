package ar.edu.unnoba.poo.login.entities;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;

@Entity
@Table(name= "usuarios")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private long dni;
	private String email;
	@Column(name="contrasenia")
	private String password;
	@Column(name="rol")
	private String role;
	@Column(name="nombre")
	private String name;
	@Column(name="bloqueado")
	private Boolean enabled;

	public Boolean getEnabled() {
		return !enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = !enabled;
	}

		
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		this.password = bCryptPasswordEncoder.encode(password);
	}
	public String getName() {
		return name;
	}
	public void setName(String firstName) {
		this.name = firstName;
	}

		
}
