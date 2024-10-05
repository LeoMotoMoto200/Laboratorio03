import java.util.*;
public class Laboratorio03 {
    public static void main(String args[]) {
        // Arreglo para almacenar 10 objetos de tipo Nave
        Nave[] misNaves = new Nave[10]; 
        Scanner nay = new Scanner(System.in); 
        String nombre, columna;
        int fila, punto;
        boolean estado;
        // Bucle para pedir los datos de 10 naves
        for (int i = 0; i < misNaves.length; i++) {
            System.out.println("Nave " + (i + 1)); 
            // Pedir al usuario el nombre de la nave
            System.out.print("Nombre: ");
            nombre = nay.next(); 
            System.out.print("Fila: ");
            fila = nay.nextInt(); 
            System.out.print("Columna: ");
            columna = nay.next(); 
            System.out.print("Estado (true/false): ");
            estado = nay.nextBoolean(); 
            System.out.print("Puntos: ");
            punto = nay.nextInt(); 
            // Crear una nueva nave con los datos ingresados y guardarla en el array
            misNaves[i] = new Nave(nombre, fila, columna, estado, punto);
        }
        System.out.println("\nNaves creadas:");
        mostrarNaves(misNaves);
        mostrarPorNombre(misNaves);
        mostrarPorPuntos(misNaves);
        mostrarMayorPuntos(misNaves);
    }
    public static void mostrarNaves(Nave[] misNaves) {
        for (int i = 0; i < misNaves.length; i++) {
            System.out.println("Nave " + (i + 1)); 
            System.out.println(misNaves[i].toString()); // Usa el método toString para mostrar la info de la nave
        }
    }
    public static void mostrarPorNombre(Nave[] misNaves) {
        Scanner nay = new Scanner(System.in);
        System.out.println("\nIngrese el nombre de una nave que desea reclutar: ");
        String buscarNombre = nay.next(); 
        boolean encontrada = false; 
        for (int i = 0; i < misNaves.length; i++) {
            if (buscarNombre.equals(misNaves[i].getNombre())) {
                System.out.println("Nave encontrada: " + misNaves[i].toString());
                encontrada = true; 
                break; 
            }
        }
        if (!encontrada) {
            System.out.println("No se encontró una nave con el nombre: " + buscarNombre);
        }
    }
    public static void mostrarPorPuntos(Nave[] misNaves) {
        Scanner nay = new Scanner(System.in);
        System.out.print("\nDigite un número de puntos: ");
        int puntosTeclado = nay.nextInt();
        System.out.println("\nNaves con puntos menores o iguales a " + puntosTeclado + ":");
        boolean hayNaves = false; 
        for (int i = 0; i < misNaves.length; i++) {
            if (misNaves[i].getPuntos() <= puntosTeclado) {
                System.out.println(misNaves[i].toString());
                hayNaves = true; 
            }
        }
        if (!hayNaves) {
            System.out.println("No hay naves con puntos menores o iguales a " + puntosTeclado);
        }
    }
    public static void mostrarMayorPuntos(Nave[] misNaves) {
        int mayor = misNaves[0].getPuntos();
        int mayorIndice = 0; // Asumimos que la primera nave tiene los mayores puntos
    
        // Recorrer el array de naves desde la segunda nave (índice 1)
        for (int i = 1; i < misNaves.length; i++) {
            // Si los puntos de la nave actual son mayores que los puntos almacenados en 'mayor'
            if (misNaves[i].getPuntos() > mayor) {
                mayor = misNaves[i].getPuntos(); // Actualizar el valor de 'mayor'
                mayorIndice = i; // Almacenar el índice de la nave con más puntos
            }
        }
        System.out.println("\nLa nave con mayor número de puntos es: " + misNaves[mayorIndice].toString());
    }
}
    
