package Logica;

public class Punto {
	String direccion;
	Double longitud;
	Double latitud;
	public Punto(String direccion, Double longitud, Double latitud) {
		super();
		this.direccion = direccion;
		this.longitud = longitud;
		this.latitud = latitud;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	public Double getLatitud() {
		return latitud;
	}
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	
	

}
