package lab2p2_wilmerzuniga;

import java.util.ArrayList;

public class Empleados {
    //Atributos

    private int Edad;
    private String Nombre;
    private boolean Horario;
    private int Sueldo;
    private String NHR;
    private boolean Chambeando;

    private int x;

    //Constructores
    public Empleados() {

    }

    public Empleados(String Nombre, int Edad, boolean Horario, int Sueldo, String NHR) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Horario = Horario;
        this.Sueldo = Sueldo;
        this.NHR = NHR;
    }
    
    public Empleados(String Nombre, int Edad, int Sueldo, String NHR) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Sueldo = Sueldo;
        this.NHR = NHR;
    }

    //Mutadores
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setHorario(boolean Horario) {
        this.Horario = Horario;
    }

    public boolean getHorario() {
        return Horario;
    }

    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setNHR(String NHR) {
        this.NHR = NHR;
    }

    public String getNHR() {
        return NHR;
    }
    
    //coso de administrador
    
    public void Chambeando(int x){
        if (x==0) {
            this.Chambeando = true;
        }else{
            this.Chambeando = false;
        }
    }
    
    public String toString() {
        return "Empleado -> "+ Nombre +"\n#RRHH -> " + NHR + "\nEdad -> " + Edad + "\nSueldo -> " + Sueldo + "\nTrabajando ->" + Chambeando ;
    }

}
