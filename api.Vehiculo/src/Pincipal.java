import java.util.Scanner;

public class Pincipal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese los datos de la moto:");
            System.out.print("Marca: ");
            String marcaMoto = scanner.nextLine();
            System.out.print("Modelo: ");
            String modeloMoto = scanner.nextLine();
            System.out.print("Placa: ");
        }

        System.out.print("Velocidad máxima: ");
       @SuppressWarnings("unused")
    int velocidadMaximaMoto;
       velocidadMaximaMoto = 0;
    }

    @Override
    public String toString() {
        return "Pincipal []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
}