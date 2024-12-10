package zooAnimales;

public class Animal {
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private static int totalAnimales;


    public static int mamiferos = 0;
    public static int aves = 0;
    public static int reptiles = 0;
    public static int peces = 0;
    public static int anfibios = 0;

    public Animal() {
        totalAnimales++;
    }

    public static void incrementarMamiferos() {
        mamiferos++;
    }

    public static void incrementarAves() {
        aves++;
    }

    public static void incrementarReptiles() {
        reptiles++;
    }

    public static void incrementarPeces() {
        peces++;
    }

    public static void incrementarAnfibios() {
        anfibios++;
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public String movimiento() {
        return "desplazarse";
    }

    public static String totalPorTipo() {
        return "Mamiferos: " + mamiferos + "\n" +
               "Aves: " + aves + "\n" +
               "Reptiles: " + reptiles + "\n" +
               "Peces: " + peces + "\n" +
               "Anfibios: " + anfibios;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + 
               ", habito en " + habitat + " y mi genero es " + genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }
}

