package negocio;

import java.util.Objects;

public class Arbitro {
    private int idArbitro;
    private String nombre;
    
	public Arbitro(int idArbitro, String nombre) {
		super();
		this.idArbitro = idArbitro;
		this.nombre = nombre;
	}

	public Arbitro() {
		super();
	}

	public int getIdArbitro() {
		return idArbitro;
	}

	public void setIdArbitro(int idArbitro) {
		this.idArbitro = idArbitro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Arbitro [idArbitro=" + idArbitro + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idArbitro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Arbitro))
			return false;
		Arbitro other = (Arbitro) obj;
		return idArbitro == other.idArbitro;
	}
    
	public void asignarPartido() {
        System.out.println("Árbitro " + nombre + " asignado a un partido.");
    }

}
