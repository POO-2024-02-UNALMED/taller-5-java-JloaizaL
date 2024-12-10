package zooAnimales;

public class Reptil extends Animal {
    private String colorEscamas;
    private int largoCola;
    public static int iguanas;
    public static int serpientes;

    public Reptil() {incrementarReptiles();}

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        incrementarReptiles();
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        iguanas++;
        return new Reptil(nombre, edad, "selvas", genero, "verde", 5);
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        serpientes++;
        return new Reptil(nombre, edad, "desiertos", genero, "marron", 3);
    }

    public static int cantidadReptiles() {
        return iguanas + serpientes;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    @Override
    public String movimiento() {
        return "reptar";
    }
}
