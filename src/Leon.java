public class Leon extends Felino{
    private String habitad;

    public Leon(String nombre, int edad, double peso, String habitad) {
        super(nombre, edad, peso);
        this.habitad = habitad;
    }

    public void imprimirLeon(){
        System.out.println("\n\t *** DATOS REGISTRADOS LEON ***\n");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Peso: " + this.peso);
        System.out.println("Habitad: " + this.habitad);
    }
}
