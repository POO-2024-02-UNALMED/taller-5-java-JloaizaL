package zooAnimales;

public class Anfibio extends Animal {
    private String colorPiel;
    private boolean venenoso;
    public static int ranas;
    public static int salamandras;

    public Anfibio() {incrementarAnfibios();}

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        incrementarAnfibios();
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, "charcos", genero, "verde", false);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, "bosques", genero, "amarillo", true);
    }

    public static int cantidadAnfibios() {
        return ranas + salamandras;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public String movimiento() {
        return "saltar";
    }
}
