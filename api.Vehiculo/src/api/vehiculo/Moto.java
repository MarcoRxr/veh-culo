public class Moto {
    private String marca;
    private String modelo;
    private int cilindrada;
    private String color;

    public Moto(String marca, String modelo, int cilindrada, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada=" + cilindrada +
                ", color='" + color + '\'' +
                '}';
    }
}