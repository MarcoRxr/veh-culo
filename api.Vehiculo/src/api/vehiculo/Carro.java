package api.vehiculo;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double capacidadMotor;
    private String color;

    public Carro(String marca, String modelo, String color, int ano, String automatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadMotor = capacidadMotor;
        this.color = color;
    }

    public void encenderMotor() {
        System.out.println("El motor del carro se encendió.");
    }

    public void apagarMotor() {
        System.out.println("El motor del carro se apagó.");
    }

    public void acelerar() {
        System.out.println("El carro está acelerando.");
    }

    public void frenar() {
        System.out.println("El carro está frenando.");
    }

    public void mostrarInformacionCarro() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + ano);
        System.out.println("Capacidad del motor: " + capacidadMotor + " cc");
        System.out.println("Color: " + color);
    }

    void estacionar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void girar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}