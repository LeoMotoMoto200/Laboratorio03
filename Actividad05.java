import java.util.*;
public class Actividad05 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 5) + 1;
        int random2 = (int) (Math.random() * 5) + 1;
        Soldado[] ejercito1 = new Soldado[random];
        Soldado[] ejercito2 = new Soldado[random2];
        InicializarEjercito(ejercito1);
        InicializarEjercito(ejercito2);
        System.out.println("Ejército 1:");
        MostrarEjercito(ejercito1);
        System.out.println("\nEjército 2:");
        MostrarEjercito(ejercito2);
        mostrarEjercitoGanador(ejercito1, ejercito2);
    }

    public static void InicializarEjercito(Soldado[] ejercito) {
        Scanner nay = new Scanner(System.in);
        for (int i = 0; i < ejercito.length; i++) {
            System.out.print("Ingrese el nombre del soldado " + (i + 1) + ": ");
            String nombre = nay.nextLine();
            ejercito[i] = new Soldado(nombre, (int) (Math.random() * 100) + 1);
        }
    }
    public static void MostrarEjercito(Soldado[] ejercito) {
        for (int i = 0; i < ejercito.length; i++) {
            System.out.println("Soldado " + (i + 1) + ": " + ejercito[i].getNombre());
        }
    }
    public static void mostrarEjercitoGanador(Soldado[] ejercito1, Soldado[] ejercito2) {
        if (ejercito1.length < ejercito2.length) {
            System.out.println("\nEl ejército ganador es el Ejército 2:");
            MostrarEjercito(ejercito2);
        } else if (ejercito1.length > ejercito2.length) {
            System.out.println("\nEl ejército ganador es el Ejército 1:");
            MostrarEjercito(ejercito1);
        } else {
            System.out.println("\nEmpate");
        }
    }
}