package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private final ArrayList<Animal> animales = new ArrayList<>();

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public void agregarAnimales(Animal animal) {
        animales.add(animal);
        animal.setZona(this);
    }

    public int cantidadAnimales() {
        return animales.size();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Zoologico getZoo() { return zoo; }
    public void setZoo(Zoologico zoo) { this.zoo = zoo; }
}
