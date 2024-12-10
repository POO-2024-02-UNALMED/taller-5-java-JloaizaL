package zooAnimales;

import gestion.Zona;

public class Animal {
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;
    private static int totalAnimales = 0;

    // Constructor con parámetros
    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    // Constructor vacío
    public Animal() {
        totalAnimales++;
    }

    // Método para el movimiento general de los animales
    public String movimiento() {
        return "desplazarse";
    }

    // Método toString
    @Override
    public String toString() {
        String base = "Mi nombre es " + nombre + ", tengo una edad de " + edad +
                ", habito en " + habitat + " y mi género es " + genero;
        if (zona != null) {
            base += ", la zona en la que me ubico es " + zona.getNombre() + 
                    ", en el " + zona.getZoo().getNombre() + ".";
        }
        return base;
    }

    public String getNombre() { 
        return nombre; }
    public void setNombre(String nombre) {
         this.nombre = nombre; }
    public int getEdad() { 
        return edad; }
    public void setEdad(int edad) { 
        this.edad = edad; }
    public String getHabitat() { 
        return habitat; }
    public void setHabitat(String habitat) { 
        this.habitat = habitat; }
    public String getGenero() { 
        return genero; }
    public void setGenero(String genero) { 
        this.genero = genero; }
    public Zona getZona() { 
        return zona; }
    public void setZona(Zona zona) { 
        this.zona = zona; }
    public static int getTotalAnimales() { 
        return totalAnimales; }

}


