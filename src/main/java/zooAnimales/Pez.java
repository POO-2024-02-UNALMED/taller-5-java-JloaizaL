package zooAnimales;

public class Pez extends Animal {
    private String colorEscamas;
    private int cantidadAletas;
    public static int salmones;
    public static int bacalaos;

    public Pez() {incrementarPeces();}

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        incrementarPeces();
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        salmones++;
        return new Pez(nombre, edad, "océanos", genero, "rosado", 2);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        bacalaos++;
        return new Pez(nombre, edad, "mares", genero, "blanco", 3);
    }

    public static int cantidadPeces() {
        return salmones + bacalaos;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    @Override
    public String movimiento() {
        return "nadar";
    }
}
