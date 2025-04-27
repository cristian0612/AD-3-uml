package negocio;


import java.util.Date;
import java.util.Objects;

public class Torneo {
	    private int idTorneo;
	    private String nombre;
	    private Date fechaInicio;
	    private Date fechaFin;


	    public Torneo() {
			super();
		}

		public Torneo(int idTorneo, String nombre, Date date, Date fechaFin) {
	        this.idTorneo = idTorneo;
	        this.nombre = nombre;
	        this.fechaInicio = date;
	        this.fechaFin = fechaFin;
	    }
		
		
		

	    public int getIdTorneo() {
			return idTorneo;
		}

		public void setIdTorneo(int idTorneo) {
			this.idTorneo = idTorneo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Date getFechaInicio() {
			return fechaInicio;
		}

		public void setFechaInicio(Date fechaInicio) {
			this.fechaInicio = fechaInicio;
		}

		public Date getFechaFin() {
			return fechaFin;
		}

		public void setFechaFin(Date fechaFin) {
			this.fechaFin = fechaFin;
		}

		
		
		
		
		@Override
		public int hashCode() {
			return Objects.hash(idTorneo);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof Torneo))
				return false;
			Torneo other = (Torneo) obj;
			return idTorneo == other.idTorneo;
		}
		
		
		
		

		@Override
		public String toString() {
			return "Torneo [idTorneo=" + idTorneo + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio
					+ ", fechaFin=" + fechaFin + "]";
		}

		public void crearTorneo() {
	        System.out.println("Torneo " + nombre + " creado.");
	    }

	    public void cerrarTorneo() {
	        System.out.println("Torneo " + nombre + " cerrado.");
	    }

	    public String getnombre() {
	        return nombre;
	    }
	}


