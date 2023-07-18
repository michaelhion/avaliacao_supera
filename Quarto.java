import java.util.Scanner;

public class Quarto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número de casos de teste

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            String desembaralhada = desembaralharLinha(linha);
            System.out.println(desembaralhada);
        }
    }

    public static String desembaralharLinha(String linha) {
        int tam = linha.length();
        StringBuilder sb = new StringBuilder(tam);

        for (int i = tam / 2 - 1; i >= 0; i--) {
            sb.append(linha.charAt(i));
        }

        for (int i = tam - 1; i >= tam / 2; i--) {
            sb.append(linha.charAt(i));
        }

        return sb.toString();
    }
}
