public class Tigre extends Felino{
    private String comida;

    public Tigre(String nombre, int edad, double peso, String comida) {
        super(nombre, edad, peso);
        this.comida = comida;
    }
    public void imprimirTigre(){
        System.out.println("\n\t *** DATOS REGISTRADOS TIGRE ***\n");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Peso: " + this.peso);
        System.out.println("Comida: " + this.comida);
    }
}
