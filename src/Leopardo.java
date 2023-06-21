public class Leopardo extends Felino{
    private String habilidad;

    public Leopardo(String nombre, int edad, double peso, String habilidad) {
        super(nombre, edad, peso);
        this.habilidad = habilidad;
    }
    public void imprimirLeopardo(){
        System.out.println("\n\t *** DATOS REGISTRADOS LEOPARDO ***\n");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Peso: " + this.peso);
        System.out.println("Habilidad: " + this.habilidad);
    }
}
