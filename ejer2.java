import java.util.Scanner;

public class ejer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        // Quitar todos los espacios en blanco
        String sinEspacios = cadena.replace(" ", "");
        System.out.println("Cadena sin espacios: " + sinEspacios);
        scanner.close();
    }
}