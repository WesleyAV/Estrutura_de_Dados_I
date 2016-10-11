package ED_02_Recursividade;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("\nDigite o número da Base: ");
        int num = ler.nextInt();

        System.out.println("Harmônico (Hn) de " + num + " é: " + Harmonicos(num));

    }

    public static double Harmonicos(int n) {

        if (n <= 1) {
            return 1;
        } else {
            return 1.0 / n + Harmonicos(n - 1);
        }
    }
}
