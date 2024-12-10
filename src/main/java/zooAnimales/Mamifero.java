package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
    private boolean pelaje;
    private int patas;
    private static ArrayList<Mamifero> listado = new ArrayList<>();
    private static int caballos;
    private static int leones;

    // Constructor
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        agregarAListado();
    }

    public Mamifero() {
        agregarAListado();
    }

    private void agregarAListado() {
        listado.add(this);
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }

    public static int cantidadMamiferos() {
        return listado.size();
    }
}
