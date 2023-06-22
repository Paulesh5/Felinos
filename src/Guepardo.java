public class Guepardo extends Felino{
    private double velocidad;

    public Guepardo(String nombre, int edad, double peso, double velocidad) {
        super(nombre, edad, peso);
        this.velocidad = velocidad;
    }
    public void imprimirPantera(){
        System.out.println("\n\t *** DATOS REGISTRADOS GUEPARDO ***\n");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Peso: " + this.peso);
        System.out.println("Velocidad: " + this.velocidad);
    }
}
