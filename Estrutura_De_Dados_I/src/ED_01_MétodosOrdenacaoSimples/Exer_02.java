package ED_01_MétodosOrdenacaoSimples;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int i, aux, pos = 0, posicaoMenor;
        int VetA[] = new int[100];

        for (i = 0; i < VetA.length; i++) //Passo 1
        {
            int rnd = (int) (Math.random() * 100);
            VetA[i] = rnd;
            System.out.println("Vetor na posição [" + i + "] =" + VetA[i]);
        }

        //=====================================
        //METODO INSERTION
        long tempoInicial = System.currentTimeMillis();// contador de tempo

        for (i = 0; i < VetA.length; i++) {
            posicaoMenor = i;
            //percorrer todos os elementos a direita de j
            for (int j = (i + 1); j < VetA.length; j++) {
                if (VetA[j] < VetA[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            aux = VetA[i];
            VetA[i] = VetA[posicaoMenor];
            VetA[posicaoMenor] = aux;
        }

        System.out.println("\nImprimindo Vetor Ordenado - Método Insertion:");
        for (i = 0; i < VetA.length; ++i) {
            System.out.print(VetA[i] + ", ");
        }
        System.out.println("\n");
        long tempoFinal = System.currentTimeMillis();
        System.out.printf("%.2f ms%n", (tempoFinal - tempoInicial) / 1000d);
        //=====================================

        //METODO SELECTION
        long tempoInicial2 = System.currentTimeMillis();// contador de tempo
        //Passo 2 - Selection Sort

        for (i = 0; i < VetA.length - 1; i++) {
            posicaoMenor = i;
            //percorrer todos os elementos a direita de j
            for (int j = (i + 1); j < VetA.length; j++) {
                if (VetA[j] < VetA[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            aux = VetA[i];
            VetA[i] = VetA[posicaoMenor];
            VetA[posicaoMenor] = aux;
        }

        System.out.println("\nImprimindo Vetor Ordenado - Método Selection:");
        for (i = 0; i < VetA.length; ++i) {
            System.out.print(VetA[i] + ", ");
        }
        System.out.println("\n");
        long tempoFinal2 = System.currentTimeMillis();
        System.out.printf("%.2f ms%n", (tempoFinal - tempoInicial) / 1000d);
        //=====================================

        //METODO BUBBLE
        long tempoInicial3 = System.currentTimeMillis();// contador de tempo
        //Passo 2 - Bubble

        for (i = VetA.length; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                if (VetA[j - 1] > VetA[j]) {
                    aux = VetA[j];
                    VetA[j] = VetA[j - 1];
                    VetA[j - 1] = aux;
                }
            }
        }

        System.out.println("\nImprimindo Vetor Ordenado - Método Bubble:");
        for (i = 0; i < VetA.length; ++i) {
            System.out.print(VetA[i] + ", ");
        }
        System.out.println("\n");
        long tempoFinal3 = System.currentTimeMillis();
        System.out.printf("%.2f ms%n", (tempoFinal - tempoInicial) / 1000d);
        //=====================================
    }
}
