package ED_02_Recursividade;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer_05 {

    public static int Soma(int n) {

        if (n == 1) {
            return 1;
        } else {
            return (n + Soma(n - 1));
        }
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("\nDigite um número: ");
        int num = ler.nextInt();

        System.out.println("A soma dos primeiros números inteiros de " + num + " é de: " + Soma(num));
    }
}
