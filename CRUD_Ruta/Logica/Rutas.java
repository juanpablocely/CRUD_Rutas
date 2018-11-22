package Logica;

import java.util.ArrayList;

public class Rutas {
	String nombre;
	String distancia;
	String tiempo;
	Punto puntoinicial;
	Punto puntofinal;
	Vehiculo carro;
	
	ArrayList<Punto> trayectoria = new ArrayList<Punto>();
	

	public Rutas(String nombre, String distancia, String tiempo, Punto puntoinicial, Punto puntofinal, Vehiculo carro) {
		super();
		this.nombre = nombre;
		this.distancia = distancia;
		this.tiempo = tiempo;
		this.puntoinicial = puntoinicial;
		this.puntofinal = puntofinal;
	
	}
	
	
	
	public Rutas(String nombre, String distancia, String tiempo, Punto puntoinicial, Punto puntofinal, Vehiculo carro,
			ArrayList<Punto> trayectoria) {
		super();
		this.nombre = nombre;
		this.distancia = distancia;
		this.tiempo = tiempo;
		this.puntoinicial = puntoinicial;
		this.puntofinal = puntofinal;
		this.carro = carro;
		this.trayectoria = trayectoria;
	}
	
	public Vehiculo getCarro() {
		return carro;
	}

	public void setCarro(Vehiculo carro) {
		this.carro = carro;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDistancia() {
		return distancia;
	}
	public void setDistancia(String distancia) {
		this.distancia = distancia;
	}
	public String getTiempo() {
		return tiempo;
	}
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	public Punto getPuntoinicial() {
		return puntoinicial;
	}
	public void setPuntoinicial(Punto puntoinicial) {
		this.puntoinicial = puntoinicial;
	}
	public Punto getPuntofinal() {
		return puntofinal;
	}
	public void setPuntofinal(Punto puntofinal) {
		this.puntofinal = puntofinal;
	}
	public ArrayList<Punto> getTrayectoria() {
		return trayectoria;
	}
	public void setTrayectoria(ArrayList<Punto> trayectoria) {
		this.trayectoria = trayectoria;
	}
	
	
	
	
	

}
