package zooAnimales;

public class Ave extends Animal {
    private String colorPlumas;
    public static int halcones;
    public static int aguilas;
    static int canA;

    public Ave() { canA++;}

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        canA++;
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "cielo", genero, "gris");
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, "montañas", genero, "blanco");
    }

    public static int cantidadAves() {
        return halcones + aguilas + canA;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    @Override
    public String movimiento() {
        return "volar";
    }
}
