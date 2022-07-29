package lab2p2_wilmerzuniga;

public class Clientes {
    private int Edad;
    private String Nombre;
    private int Saldo;
    private String ID;
    
    //Constructores
    public Clientes() {

    }

    public Clientes(String Nombre, int Edad, int Saldo, String ID) {
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Saldo = Saldo;
        this.ID = ID;
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


    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }
    
    public String toString() {
        return "Cliente -> " + Nombre + "\n#ID -> " + ID + "\nEdad -> " + Edad + "\nSaldo -> " + Saldo;
    }
}
