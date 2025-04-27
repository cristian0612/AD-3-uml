package negocio;

import java.util.Objects;

public class Entrenador {
    private int idEntrenador;
    private String nombre;
    
	public Entrenador() {
		super();
	}

	public Entrenador(int idEntrenador, String nombre) {
		super();
		this.idEntrenador = idEntrenador;
		this.nombre = nombre;
	}

	public int getIdEntrenador() {
		return idEntrenador;
	}

	public void setIdEntrenador(int idEntrenador) {
		this.idEntrenador = idEntrenador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Entrenador [idEntrenador=" + idEntrenador + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEntrenador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Entrenador))
			return false;
		Entrenador other = (Entrenador) obj;
		return idEntrenador == other.idEntrenador;
	}
    
	public void registrarFutbolista() {
        System.out.println("Registrando futbolista...");
    }

    public void verInfoPartidos() {
        System.out.println("Mostrando información de los partidos...");
    }
    

}
