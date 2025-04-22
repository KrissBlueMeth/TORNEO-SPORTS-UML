package entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Jugador {
	
	private String id;
	private String idEquipo;
	private String nombre;
	private String apellidos;
	private LocalDate fNaci;
	private String email;
	private String direccion;
	private String nombreUsuario;
	
	
	public Jugador() {
		super();
	}


	public String getIdEquipo() {
		return idEquipo;
	}


	public void setIdEquipo(String idEquipo) {
		this.idEquipo = idEquipo;
	}


	public Jugador(String id, String idEquipo, String nombre, String apellidos, LocalDate fNaci, String email, String direccion,
			String nombreUsuario) {
		super();
		this.id = id;
		this.idEquipo = idEquipo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fNaci = fNaci;
		this.email = email;
		this.direccion = direccion;
		this.nombreUsuario = nombreUsuario;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public LocalDate getfNaci() {
		return fNaci;
	}


	public void setfNaci(LocalDate fNaci) {
		this.fNaci = fNaci;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "Jugador [id=" + id + ", idEquipo=" +idEquipo + " nombre=" + nombre + ", apellidos=" + apellidos + ", fNaci=" + fNaci + ", email="
				+ email + ", direccion=" + direccion + ", nombreUsuario=" + nombreUsuario + "]";
	}	

	
}


