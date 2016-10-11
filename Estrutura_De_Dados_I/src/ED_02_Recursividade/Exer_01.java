package ED_02_Recursividade;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer_01 {

    int tamanho, contador = 1;
    private String losango = "";

    public void setTamanho() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor de 1 a 9:");
        tamanho = ler.nextInt();
    }

    public int getTamanho() {
        return tamanho;
    }

    public void desenhar(int getTamanho) {
        if (contador <= getTamanho()) {
            for (int a = getTamanho(); a > 0; a--) {
                losango = losango + String.valueOf(contador);
                System.out.println(losango);
            }
            contador = contador + 1;
            desenhar(getTamanho());
        }
    }

    public static void main(String args[]) {
        Exer_01 obj = new Exer_01();
        obj.setTamanho();
        obj.desenhar(obj.getTamanho());
    }
}
