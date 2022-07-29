package lab2p2_wilmerzuniga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_WilmerZuniga {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        Object[] Datos = {"admin", "admin1234"};

        ArrayList<Object> Empleadoss = new ArrayList();
        ArrayList<Object> Clientes = new ArrayList();
        ArrayList<Object> VRAAAAM = new ArrayList();

        System.out.println("---------------------------------");
        System.out.println("Ingrese el Usuario: ");
        String usser = lea.nextLine();
        System.out.println("Ingrese la contraseña: ");
        lea = new Scanner(System.in);
        String contra = lea.nextLine();
        System.out.println("---------------------------------");
        System.out.println("");

        boolean opcioncita = true;

        while (opcioncita == true) {
            if (Datos[0].equals(usser) && Datos[1].equals(contra)) {
                System.out.println("---------------------------------------");
                System.out.println("1 - Empleados");
                System.out.println("2 - Clientes");
                System.out.println("3 - Carros");
                System.out.println("4 - Salir");
                System.out.println("---------------------------------------");
                System.out.println("Ingrese la opcion que desea: ");
                lea = new Scanner(System.in);
                int opcion = lea.nextInt();
                System.out.println("");

                switch (opcion) {
                    case 1: {
                        boolean empleados = true;
                        while (empleados == true) {
                            System.out.println("-------------------Empleados-------------------");
                            System.out.println("1 - Crear Empleado");
                            System.out.println("2 - Modificar estado de horario");
                            System.out.println("3 - Listar Empleados");
                            System.out.println("4 - Eliminar empleado");
                            System.out.println("5 - Salir de el submenu");
                            System.out.println("-----------------------------------------------");
                            System.out.println("Ingrese la opcion que desea: ");
                            lea = new Scanner(System.in);
                            int opciempl = lea.nextInt();
                            System.out.println("");
                            
                            switch (opciempl) {
                                case 1: {
                                    System.out.println("Ingrese el nombre de el empleado: ");
                                    lea = new Scanner(System.in);
                                    String nombre = lea.nextLine();
                                    System.out.println("");

                                    System.out.println("Ingrese la edad de el empleado: ");
                                    lea = new Scanner(System.in);
                                    int edad = lea.nextInt();
                                    System.out.println("");

                                    System.out.println("Ingrese el sueldo de el empleado: ");
                                    lea = new Scanner(System.in);
                                    int sueldo = lea.nextInt();
                                    System.out.println("");

                                    System.out.println("Ingrese su numero de Recursos Humanos: ");
                                    lea = new Scanner(System.in);
                                    int NHR = lea.nextInt();
                                    System.out.println("");

                                    boolean horario = false;

                                    Empleadoss.add(new Empleados(nombre, edad, horario, sueldo, nombre));

                                }
                                break;

                                case 2: {
                                    boolean chamba=false;
                                    System.out.println("Ingrese el indice de el empleado: ");
                                    int ind = lea.nextInt();
                                    System.out.println("");
                                           System.out.println("Ingrese 0 para iniciar su turno y 1 para terminarlo: ");
                                           lea = new Scanner(System.in);
                                           int opci = lea.nextInt();
                                        ((Empleados) Empleadoss.get(ind)).Chambeando(opci);

                                }
                                break;

                                case 3: {
                                    for (Object Empleado : Empleadoss) {
                                        System.out.println("");
                                        System.out.println("Empleado " + (Empleadoss.indexOf(Empleado)));
                                        System.out.println(Empleado);
                                        System.out.println("");
                                    }

                                }
                                break;

                                case 4: {
                                    System.out.println("Posicion de el Empleado: ");
                                    int eli = lea.nextInt();
                                    System.out.println("");
                                    
                                    if(eli <= Empleadoss.size()){
                                        Empleadoss.remove(eli);
                                    }
                                    
                                    System.out.println("El empleado fue eliminado exitosamente");
                                }
                                break;

                                case 5: {
                                    empleados = false;
                                }
                                break;

                                default: {
                                    System.out.println("Ingrese una opcion valida");
                                }
                            }
                        }

                    }
                    break;

                    case 2: {
                        System.out.println("");
                    }
                    break;

                    case 3: {

                    }
                    break;

                    case 4: {
                        System.out.println("Gracias por utilizar el programa ");
                        opcioncita = false;
                    }
                    break;

                    default: {
                        System.out.println("Opcion incorrecta");
                    }

                }
            } else {
                System.out.println("Ingrese los datos correctamente");
                System.out.println("");
                System.out.println("---------------------------------");
                System.out.println("Ingrese el Usuario: ");
                usser = lea.nextLine();
                System.out.println("Ingrese la contraseña: ");
                lea = new Scanner(System.in);
                contra = lea.nextLine();
                System.out.println("---------------------------------");
                System.out.println("");
            }
        }
    }

}
