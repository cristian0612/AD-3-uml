package negocio;

import java.util.Objects;

public class Futbolista {
    private int idFutbolista;
    private String nombre;
    private double numero;
    private String posicion;
    private int edad;
    
    
    public Futbolista() {
		super();
	}
    

	public Futbolista(int idFutbolista, String nombre, double numero, String posicion, int edad) {
		super();
		this.idFutbolista = idFutbolista;
		this.nombre = nombre;
		this.numero = numero;
		this.posicion = posicion;
		this.edad = edad;
	}


	public int getIdFutbolista() {
		return idFutbolista;
	}


	public void setIdFutbolista(int idFutbolista) {
		this.idFutbolista = idFutbolista;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getNumero() {
		return numero;
	}


	public void setNumero(double numero) {
		this.numero = numero;
	}


	public String getPosicion() {
		return posicion;
	}


	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	
	
	@Override
	public String toString() {
		return "Futbolista [idFutbolista=" + idFutbolista + ", nombre=" + nombre + ", numero=" + numero + ", posicion="
				+ posicion + ", edad=" + edad + "]";
	}
	
	


	@Override
	public int hashCode() {
		return Objects.hash(idFutbolista);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Futbolista))
			return false;
		Futbolista other = (Futbolista) obj;
		return idFutbolista == other.idFutbolista;
	}


	public void consultarDatos() {
        System.out.println("Nombre: " + nombre + ", Número: " + numero + ", Posición: " + posicion + ", Edad: " + edad);
    }
}
