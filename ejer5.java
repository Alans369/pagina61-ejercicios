import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'A' || c == 'a') {
                contador++;
            }
        }

        System.out.println("La vocal 'A' aparece " + contador + " veces en la frase.");
        scanner.close();
    }
}