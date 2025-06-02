import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        // Eliminar espacios al inicio y final, luego dividir por uno o más espacios
        String[] palabras = frase.trim().split("\\s+");
        int cantidad = (frase.trim().isEmpty()) ? 0 : palabras.length;
        System.out.println("La cantidad de palabras es: " + cantidad);
        scanner.close();
    }
}
