import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        String nombre, habitad, comida, habilidad;
        int edad;
        double peso;

        do {
            System.out.println("\n\t\t *** MENU PRINCIPAL ***");
            System.out.println("1. Leon");
            System.out.println("2. Tigre");
            System.out.println("3. Leopardo");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("0. SALIR");
            System.out.print("Opcion: ");
            op = sc.nextInt();

            switch (op){
                case 1: {
                    System.out.println("\n\t\t *** LEON ***\n");
                    System.out.print("Nombre: ");
                    nombre = sc.next();
                    System.out.print("Edad: ");
                    edad = sc.nextInt();
                    System.out.print("Peso: ");
                    peso = sc.nextDouble();
                    System.out.print("Habitad: ");
                    habitad = sc.next();
                    Leon leon = new Leon(nombre,edad,peso,habitad);
                    leon.imprimirLeon();
                    break;
                }
                case 2: {
                    System.out.println("\n\t\t *** TIGRE ***\n");
                    System.out.print("Nombre: ");
                    nombre = sc.next();
                    System.out.print("Edad: ");
                    edad = sc.nextInt();
                    System.out.print("Peso: ");
                    peso = sc.nextDouble();
                    System.out.print("Base alimenticia: ");
                    comida = sc.next();
                    Tigre tigre = new Tigre(nombre,edad,peso,comida);
                    tigre.imprimirTigre();
                    break;
                }
                case 3: {
                    System.out.println("\n\t\t *** LEOPARDO ***\n");
                    System.out.print("Nombre: ");
                    nombre = sc.next();
                    System.out.print("Edad: ");
                    edad = sc.nextInt();
                    System.out.print("Peso: ");
                    peso = sc.nextDouble();
                    System.out.print("Habilidad: ");
                    habilidad = sc.next();
                    Leopardo leopardo = new Leopardo(nombre,edad,peso,habilidad);
                    leopardo.imprimirLeopardo();
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    break;
                }
                case 0: {
                    System.out.println("\n\t\t GRACIAS POR USAR");
                    break;
                }
                default:{
                    System.out.println("\n\t\t OPCION INCORRECTA\n");
                }
            }
        }while (op != 0);
    }
}
