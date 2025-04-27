package negocio;

import java.util.List;
import java.util.Objects;

public class Equipo {
    private int idEquipo;
    private String nombreEquipo;
    private List<Futbolista> futbolistas;
    

	public Equipo() {
		super();
	}
	
	
	
	public Equipo(int idEquipo, String nombreEquipo, List<Futbolista> futbolistas) {
		super();
		this.idEquipo = idEquipo;
		this.nombreEquipo = nombreEquipo;
		this.futbolistas = futbolistas;
	}

	public int getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}
	public List<Futbolista> getFutbolistas() {
		return futbolistas;
	}
	public void setFutbolistas(List<Futbolista> futbolistas) {
		this.futbolistas = futbolistas;
	}

	
	
	
	@Override
	public String toString() {
		return "Equipo [idEquipo=" + idEquipo + ", nombreEquipo=" + nombreEquipo + ", futbolistas=" + futbolistas + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(idEquipo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Equipo))
			return false;
		Equipo other = (Equipo) obj;
		return idEquipo == other.idEquipo;
	}



	public void registrarFutbolista(Futbolista futbolista) {
        futbolistas.add(futbolista);
    }

    public String getnombreEquipo() {
        return nombreEquipo;
    }

    public List<Futbolista> getFutbolista() {
        return futbolistas;
    }
    
    

}
