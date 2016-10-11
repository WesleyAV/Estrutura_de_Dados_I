package ED_04_Pilha;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer_01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String string = ler.next();

        String inversao = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            inversao += string.charAt(i);
        }
        System.out.println("\nPalavra Invertida: " + inversao);
    }
}
