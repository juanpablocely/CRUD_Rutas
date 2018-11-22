package Pruebas;



import Logica.FacadeRutas;
import Logica.Punto;
import Logica.Vehiculo;
import junit.framework.TestCase;


public class TestCrearRuta extends TestCase{
	
		public void testCrearruras(){
			try {
			 FacadeRutas fachada = new FacadeRutas() ;
			 String nombre ="Ruta sabana a exito zipaquira";
			 String tiempo ="1 hora 20 minutos";
			 String distancia ="25 kilometros";
			 Punto puntoinicial = new  Punto("Universidad de la sabana",4.863257,-74.034489 );
			 Punto puntofinal = new  Punto("Exito Zipaquira",5.018012, -74.004013 );
			 Vehiculo carro = new Vehiculo("BUS","GHA-555");
			 
			 
			 
			 fachada.crearutas(nombre, distancia, tiempo, puntoinicial, puntofinal, carro);
			 
			
			} catch (Exception e) {
			
				System.out.println(e+" Erro al crear la Ruta");
			}
			
		}
		
		
	
		
	
					
}

