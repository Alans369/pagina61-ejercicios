import java.util.Scanner;

public class ejer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine().trim();

        int ultimoEspacio = frase.lastIndexOf(' ');
        String resultado;
        if (ultimoEspacio == -1) {
            resultado = ""; // Solo había una palabra o estaba vacío
        } else {
            resultado = frase.substring(0, ultimoEspacio);
        }

        System.out.println("Frase sin la última palabra: " + resultado);
        scanner.close();
    }
}