package negocio;

import java.sql.Date;
import java.util.Objects;


public class Partido {
    private int idPartido;
    private String resultado;
    private Date fecha;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    
	public Partido() {
		super();
	}

	public Partido(int idPartido, String resultado, Date fecha, Equipo equipoLocal, Equipo equipoVisitante) {
		super();
		this.idPartido = idPartido;
		this.resultado = resultado;
		this.fecha = fecha;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
	}

	public int getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPartido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Partido))
			return false;
		Partido other = (Partido) obj;
		return idPartido == other.idPartido;
	}

	@Override
	public String toString() {
		return "Partido [idPartido=" + idPartido + ", resultado=" + resultado + ", fecha=" + fecha + ", equipoLocal="
				+ equipoLocal + ", equipoVisitante=" + equipoVisitante + "]";
	}
    
	public void asignarResultado(String resultado) {
        this.resultado = resultado;
    }

    public void generarSorteo() {
        System.out.println("Generando sorteo del partido entre " + equipoLocal.getNombreEquipo() + " y " + equipoVisitante.getNombreEquipo());
    }

    public void mostrarPartido() {
        System.out.println(equipoLocal.getNombreEquipo() + " vs " + equipoVisitante.getNombreEquipo() + " - Resultado: " + resultado);
    }
    

}
