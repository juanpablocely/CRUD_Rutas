package Logica;

public class FacadeRutas {
	
	
	public Rutas crearutas(String nombre,String distancia,String tiempo,Punto puntoinicial, Punto puntofinal,Vehiculo carro) {
		
		Rutas r= new Rutas(nombre, distancia, tiempo, puntoinicial, puntofinal, carro);
		return r;
		
		
		
	}
	
       public Rutas actualizatrutas(String nombre,String distancia,String tiempo,Punto puntoinicial, Punto puntofinal,Vehiculo carro) {
		
	
		return null;
		
		
		
	}
       
       public Rutas consultarrutaspornombre(String nombre) {
   		
    		
   		return null;
   		
   		
   		
   	}
       
       public Rutas consultarrutasporplaca(String placa) {
      		
   		
      		return null;
      		
      		
      		
      	}
       public void eliminarrutaspornombre(String placa) {
     		
      		   
     		
     	}
   	   
	
	

}
