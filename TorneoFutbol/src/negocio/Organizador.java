package negocio;

import java.util.Objects;

public class Organizador {
		
	    private int idOrganizador;
	    private String nombre;

	    
	    
	    public Organizador() {
			super();
		}

		public Organizador(int idOrganizador, String nombre) {
	        this.idOrganizador = idOrganizador;
	        this.nombre = nombre;
	    }
		
		
		

	    public int getIdOrganizador() {
			return idOrganizador;
		}

		public void setIdOrganizador(int idOrganizador) {
			this.idOrganizador = idOrganizador;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		

		@Override
		public int hashCode() {
			return Objects.hash(idOrganizador);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof Organizador))
				return false;
			Organizador other = (Organizador) obj;
			return idOrganizador == other.idOrganizador;
		}
		
		
		

		@Override
		public String toString() {
			return "Organizador [idOrganizador=" + idOrganizador + ", nombre=" + nombre + "]";
		}

		public void organizarPartidos() {
	        System.out.println("Organizando partidos...");
	    }

	    public void gestionarUsuarios() {
	        System.out.println("Gestionando usuarios...");
	    }

	    public String getNombre() {
	        return nombre;
	    }
	}

