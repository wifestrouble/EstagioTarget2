import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, insira um número inteiro: ");
        int value = scanner.nextInt();

        int a = 0;
        int b = 1;

        if (value < 0) {
            System.out.println("Número inválido, insira um número inteiro positivo.");
        } else if (value == a || value == b) {
            System.out.println("O número " + value + " faz parte da sequência de Fibonacci!");
        } else {
            int proximo = a + b;
            while (proximo <= value) {
                if (proximo == value) {
                    System.out.println("O número " + value + " faz parte da sequência de Fibonacci.");
                    return;
                }
                a = b;
                b = proximo;
                proximo = a + b;
            }
            System.out.println("O número " + value + " não faz parte da sequência de Fibonacci.");
        }
    }
}