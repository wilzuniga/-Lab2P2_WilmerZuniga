package lab2p2_wilmerzuniga;

public class Carros {

    private int AñoFab;
    private String Marca;
    private String Fechain;
    private String Modelo;
    private double Saldo;
    private String IDDUEÑO;
    private String Estado;

    //Constructores
    public Carros() {

    }

    public Carros(String Marca, int AñoFab, double Saldo, String IDDUEÑO, String Modelo, String Fechain) {
        this.AñoFab = AñoFab;
        this.Marca = Marca;
        this.Saldo = Saldo;
        this.IDDUEÑO = IDDUEÑO;
        this.Modelo = Modelo;
        this.Fechain = Fechain;
        this.Estado = Estado;


    }

    //Mutadores
    public void setAñoFab(int AñoFab) {
        this.AñoFab = AñoFab;
    }

    public int getAñoFab() {
        return AñoFab;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getMarca() {
        return Marca;
    }
    
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getModelo() {
        return Modelo;
    }
    
    public void setFechain(String Fechain) {
        this.Fechain = Fechain;
    }

    public String getFechain() {
        return Fechain;
    }
    
    
    
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getEstado() {
        return Estado;
    }
    

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setIDDUEÑO(String IDDUEÑO) {
        this.IDDUEÑO = IDDUEÑO;
    }

    public String getIDDUEÑO() {
        return IDDUEÑO;
    }

    public String toString() {
        return "Marca -> " + Marca + "\n#ID Dueño -> " + IDDUEÑO + "\nAño Fabricacion -> " + AñoFab + "\nSaldo -> " + Saldo;
    }
}
