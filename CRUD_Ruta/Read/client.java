import java.util.InputMismatchException;
import java.util.Scanner;

public class client {
	   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Facade f = new Facade();
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Ruta");
            System.out.println("2. Salir");

            try {

                System.out.println("Seleccione una opción para crear");
                opcion = sn.nextInt();

                switch (opcion) {

                    case 1:
                        System.out.println("==============================================================");
                        System.out.println("Crea una ruta");
                        Scanner s = new Scanner(System.in);
                        boolean sal = false;
                        int opci; //Guardaremos la opcion del usuario
                        while (!sal) {

                            System.out.println("1. Crear");
                            System.out.println("2. Ver");
                            System.out.println("3. salir");
                           
                            try {

                                System.out.println("Seleccione una opción");
                                opci = s.nextInt();

                                switch (opci) {

                                    case 1:
                                    	Punto p = new Punto("zipaquira",2.0,3.0);
                                    	Vehiculo v = new Vehiculo("camioneta","BHC-234");
                                        System.out.println("==============================================================");
                                        System.out.println("Ruta Creada");
                                        System.out.println("Nueva Ruta:");
                                        f.postRuta("1", "1","25 km", "1 hora",p,p,v);
                                        System.out.println("==============================================================");
                                        break;

                                    case 2:
                                        System.out.println("==============================================================");
                                        System.out.println("Ruta:");
                                        f.getRuta("1");
                                        System.out.println(f.getRuta("1"));
                                        System.out.println("==============================================================");
                                        break;

                                    case 3:
                                        sal = true;
                                        System.out.println("==============================================================");
                                        System.out.println("Ha salido del sistema");
                                        break;

                                    default:
                                        System.out.println("==============================================================");
                                        System.out.println("Solo números entre 1 y 5");
                                }

                            } catch (InputMismatchException e) {

                                System.out.println("==============================================================");
                                System.out.println("Debes insertar un número");
                                sn.next();
                            }
                        }

                        break;

                    case 2:
                        salir = true;
                        System.out.println("Ha salido del sistema");
                        break;

                    default:
                        System.out.println("Sólo opciones 1 y 2");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }

}



