public class Pantera extends Felino{
    private double tamanio;

    public Pantera(String nombre, int edad, double peso, double tamanio) {
        super(nombre, edad, peso);
        this.tamanio= tamanio;
    }
    public void imprimirPantera(){
        System.out.println("\n\t *** DATOS REGISTRADOS PANTERA ***\n");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Peso: " + this.peso);
        System.out.println("Tamaño: " + this.tamanio);
    }
}
