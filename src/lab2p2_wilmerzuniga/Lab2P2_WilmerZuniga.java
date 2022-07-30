package lab2p2_wilmerzuniga;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_WilmerZuniga {

    static Scanner lea = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Object[] Datos = {"admin", "admin1234"};

            ArrayList<Object> Empleadoss = new ArrayList();
            ArrayList<Object> Clientess = new ArrayList();
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
                                        boolean chamba = false;
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

                                        if (eli <= Empleadoss.size()) {
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
                            boolean Clientesss = true;
                            while (Clientesss == true) {
                                System.out.println("-------------------Clientes-------------------");
                                System.out.println("1 - Crear Clientes");
                                System.out.println("2 - Modificar Cliente");
                                System.out.println("3 - Listar Clientes");
                                System.out.println("4 - Listar carros por Cliente");//!!!!!!!!!!!!!!!!
                                System.out.println("5 - Eliminar Cliente");
                                System.out.println("6 - Salir de el submenu");
                                System.out.println("----------------------------------------------");
                                System.out.println("Ingrese la opcion que desea: ");
                                lea = new Scanner(System.in);
                                int opciempl = lea.nextInt();
                                System.out.println("");

                                switch (opciempl) {
                                    case 1: {
                                        System.out.println("Ingrese el nombre de el cliente: ");
                                        lea = new Scanner(System.in);
                                        String nombre = lea.nextLine();
                                        System.out.println("");

                                        System.out.println("Ingrese la edad de el cliente: ");
                                        lea = new Scanner(System.in);
                                        int edad = lea.nextInt();
                                        System.out.println("");

//                                    System.out.println("Ingrese el Saldo de el cliente: ");
//                                    lea = new Scanner(System.in);
                                        double Saldo = 0;
//                                    System.out.println("");

                                        System.out.println("Ingrese el numero de identidad de el cliente: ");
                                        lea = new Scanner(System.in);
                                        String ID = lea.nextLine();
                                        System.out.println("");

                                        Clientess.add(new Clientes(nombre, edad, Saldo, ID));

                                    }
                                    break;

                                    case 2: {
                                        boolean chamba = false;
                                        System.out.println("-------------------Clientes-------------------");
                                        System.out.println("1 - Nombre");
                                        System.out.println("2 - Edad");
                                        System.out.println("3 - ID");
                                        System.out.println("4 - Saldo");
                                        System.out.println("----------------------------------------------");
                                        System.out.println("Ingrese la opcion que desea: ");
                                        lea = new Scanner(System.in);
                                        int coso = lea.nextInt();
                                        System.out.println("");
                                        System.out.println("Ingrese el indice de el cliente: ");
                                        int ind = lea.nextInt();
                                        System.out.println("");

                                        switch (coso) {
                                            case 1: {
                                                System.out.println("Ingrese el nombre de el cliente: ");
                                                lea = new Scanner(System.in);
                                                String nombre = lea.nextLine();
                                                System.out.println("");
                                                ((Clientes) Clientess.get(ind)).setNombre(nombre);
                                            }
                                            break;

                                            case 2: {
                                                System.out.println("Ingrese la edad de el cliente: ");
                                                lea = new Scanner(System.in);
                                                int edad = lea.nextInt();
                                                System.out.println("");
                                                ((Clientes) Clientess.get(ind)).setEdad(edad);

                                            }
                                            break;

                                            case 3: {
                                                System.out.println("Ingrese el numero de identidad de el cliente: ");
                                                lea = new Scanner(System.in);
                                                String ID = lea.nextLine();
                                                System.out.println("");
                                                ((Clientes) Clientess.get(ind)).setID(ID);

                                            }
                                            break;

                                            case 4: {
                                                System.out.println("Ingrese el sueldo de el cliente: ");
                                                lea = new Scanner(System.in);
                                                double Saldo = lea.nextDouble();
                                                System.out.println("");
                                                ((Clientes) Clientess.get(ind)).setSaldo(Saldo);

                                            }
                                            break;

                                            default: {
                                                System.out.println("Opcion Incorrecta");
                                            }
                                        }

                                    }
                                    break;

                                    case 3: {
                                        for (Object Clientes : Clientess) {
                                            System.out.println("");
                                            System.out.println("Cliente " + (Clientess.indexOf(Clientes)));
                                            System.out.println(Clientes);
                                            System.out.println("");
                                        }

                                    }
                                    break;

                                    case 5: {
                                        System.out.println("Posicion de el cliente: ");
                                        int eli = lea.nextInt();
                                        System.out.println("");

                                        if (eli <= Empleadoss.size()) {
                                            Clientess.remove(eli);
                                        }

                                        System.out.println("El cliente fue eliminado exitosamente");
                                    }
                                    break;

                                    case 6: {
                                        Clientesss = false;
                                    }
                                    break;

                                    default: {
                                        System.out.println("Ingrese una opcion valida");
                                    }
                                }
                            }

                        }
                        break;

                        case 3: {
                            boolean Carros = true;
                            while (Carros == true) {
                                System.out.println("-------------------Carros-------------------");
                                System.out.println("1 - Crear Carro");
                                System.out.println("2 - Modificar estado de Carro");
                                System.out.println("3 - Listar Carros");
                                System.out.println("4 - Salir de el submenu");
                                System.out.println("---------------------------------------------");
                                System.out.println("Ingrese la opcion que desea: ");
                                lea = new Scanner(System.in);
                                int opciempl = lea.nextInt();
                                System.out.println("");

                                switch (opciempl) {
                                    case 1: {
                                        System.out.println("Ingrese la marca de el carro: ");
                                        lea = new Scanner(System.in);
                                        String Marca = lea.nextLine();
                                        System.out.println("");

                                        System.out.println("Ingrese el modelo de el carro: ");
                                        lea = new Scanner(System.in);
                                        String Modelo = lea.nextLine();
                                        System.out.println("");

                                        System.out.println("Ingrese el año de fabricacion de el carro: ");
                                        lea = new Scanner(System.in);
                                        int AñoFab = lea.nextInt();
                                        System.out.println("");

                                        System.out.println("Ingrese el total a pagar por las reparaciones: ");
                                        lea = new Scanner(System.in);
                                        double Saldo = lea.nextInt();
                                        System.out.println("");

                                        System.out.println("Ingrese la fecha de ingreso de el carro: ");
                                        lea = new Scanner(System.in);
                                        String Fechain = lea.nextLine();
                                        System.out.println("");

                                        System.out.println("Ingrese el Id de el dueño: ");
                                        lea = new Scanner(System.in);
                                        String ID = lea.nextLine();
                                        System.out.println("");

                                        for (int i = 0; i < VRAAAAM.size(); i++) {
                                            if (ID.equals(((Clientes) Clientess.get(i)).getID())) {
                                                VRAAAAM.add(new Carros(Marca, AñoFab, Saldo, ID, Modelo, Fechain));
                                                ((Carros) VRAAAAM.get(i)).setEstado("en espera de entrar a reparación");

                                            } else {
                                                if (i == (VRAAAAM.size() - 1)) {
                                                    System.out.println("Ingrese un dato valido");
                                                }
                                            }

                                        }

                                    }
                                    break;

                                    case 2: {
                                        System.out.println("");
                                        System.out.println("Ingrese el indice de el carro: ");
                                        lea = new Scanner(System.in);
                                        int eli = lea.nextInt();
                                        System.out.println("Desea avanzar al siguiente estado?(0=si, 1=no): ");
                                        lea = new Scanner(System.in);
                                        int av = lea.nextInt();

                                        String Coso = ((Carros) VRAAAAM.get(eli)).getEstado();

                                        if (av == 1) {
                                            switch (Coso) {
                                                case "en espera de entrar a reparación": {
                                                    ((Carros) VRAAAAM.get(eli)).setEstado("en reparacion");

                                                }
                                                break;

                                                case "en reparacion": {
                                                    ((Carros) VRAAAAM.get(eli)).setEstado("en espera de pago de reparacion");

                                                }
                                                break;

                                                case "en espera de pago de reparacion": {
                                                    System.out.println("El auto fue pagado en el taller(0) o en el banco(1): ");
                                                    lea = new Scanner(System.in);
                                                    int taller = lea.nextInt();
                                                    System.out.println("");
                                                    if(taller==0){
                                                        int coso = Clientess.indexOf(((Carros) VRAAAAM.get(eli)).getIDDUEÑO());
                                                        ((Clientes) Clientess.get(coso)).setSaldo(0);
                                                        ((Carros) VRAAAAM.get(eli)).setEstado("Entregado");
                                                        
                                                    } else {
                                                        ((Carros) VRAAAAM.get(eli)).setEstado("En espera de entrega");
                                                        int coso = Clientess.indexOf(((Carros) VRAAAAM.get(eli)).getIDDUEÑO());
                                                        ((Clientes) Clientess.get(coso)).setSaldo(0);
                                                    }

                                                }break;
                                                
                                                case "En espera de entrega": {
                                                    ((Carros) VRAAAAM.get(eli)).setEstado("Entregado");

                                                }
                                                break;
                                                
                                                default:{
                                                    System.out.println("Ha finalizado el proceso");
                                                }
                                                
                                            }
                                        }
                                        System.out.println("");
                                    }
                                    break;

                                    case 3: {
                                        System.out.println("");
                                        
                                        for (int i = 0; i < VRAAAAM.size(); i++) {
                                            
                                        }
                                        for (Object vram : VRAAAAM) {
                                            System.out.println("");
                                            System.out.println("Carro " + (VRAAAAM.indexOf(vram)));
                                            System.out.println(VRAAAAM);
                                            System.out.println("");
                                        }

                                    }
                                    break;

                                    case 4 : {
                                        Carros = false;
                                    }
                                    break;

                                    default: {
                                        System.out.println("Ingrese una opcion valida");
                                    }
                                }
                            }

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
        } catch (Exception e) {
            System.out.println("Aldo salio terriblemente mal.");
            System.out.println("Intentalo mas tarde");
        }
    }

}
