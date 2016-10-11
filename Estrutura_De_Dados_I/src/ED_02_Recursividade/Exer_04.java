package ED_02_Recursividade;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer_04 {

    public static void main(String[] args) {
        Scanner base = new Scanner(System.in);
        System.out.println("\n Digite o número da Base: ");
        int base1 = base.nextInt();

        Scanner expo = new Scanner(System.in);
        System.out.println("\n Digite o núumero do expoente: ");
        int expoente = expo.nextInt();

        //Imprimindo resultado da Potência
        System.out.println("O resultado da Potência é de: " + Potencia(base1, expoente));

    }

    public static int Potencia(int y, int k) {

        if (k == 0) {
            return 1;
        } else {
            return Potencia(y, k - 1) * y;
        }
    }
}
