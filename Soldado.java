import java.util.Scanner;
public class Soldado {
    private String nombre;
    private int vida;
    public Soldado(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public String toString() {
        return "Soldado [Nombre: " + nombre + ", Vida: " + vida + "]";
    }
    public static void main(String[] args) {
        Soldado[] misSoldados = new Soldado[5];
        Scanner nay = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el nombre del soldado " + (i + 1) + ": ");
            String nombre = nay.nextLine();  
            System.out.print("Ingrese su nivel de vida: ");
            int vida = nay.nextInt();        
            nay.nextLine();  
            misSoldados[i] = new Soldado(nombre, vida);
        }
        Imprimir(misSoldados);
    }
    public static void Imprimir(Soldado[] misSoldados) {
        for (int n = 0; n < misSoldados.length; n++) {
            System.out.println("Soldado " + (n + 1));
            System.out.println("Nombre: " + misSoldados[n].getNombre());
            System.out.println("Nivel de vida = " + misSoldados[n].getVida());
        }
    }
}
