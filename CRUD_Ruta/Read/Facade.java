import java.util.ArrayList;

public class Facade {
	
	 private ArrayList<Rutas> rutas;
	 
	 

	    public Facade() {
	      
	        this.rutas = new ArrayList<Rutas>();
	    }

	    public void postRuta(String idRuta, String idConductor,String distancia,String tiempo, Punto puntoSalida, Punto puntoLlegada, Vehiculo carro) {
	        this.rutas.add(new Rutas(idRuta, idConductor,distancia,tiempo, puntoSalida, puntoLlegada,carro));
	    }

	    public String getRuta(String idRuta) {
	        String response = "Ruta no encontrada";
	        for (Rutas r : rutas) {
	            if (r.getidRuta() == null ? idRuta == null : r.getidRuta().equals(idRuta)) {
	                response = r.toString();
	            }
	        }
	        return response;
	    }
	    
	    
}
