package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
    private String colorPlumas;
    private static ArrayList<Ave> listado = new ArrayList<>();
    private static int halcones;
    private static int aguilas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave() {
        listado.add(this);
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        return new Ave(nombre, edad, "montañas", genero, "café glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        aguilas++;
        return new Ave(nombre, edad, "montañas", genero, "blanco y amarillo");
    }

    public static int cantidadAves() {
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "volar";
    }
}
