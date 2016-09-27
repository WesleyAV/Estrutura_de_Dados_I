package ED_01_MétodosOrdenacaoSimples;

import java.util.Scanner;

/**
 *
 * @author Wesley A.V
 */
public class Exer_01 {

    public static void main(String[] args) {
        // Passo 1
        int i, cont1 = 0, cont2 = 0;
        Scanner ler = new Scanner(System.in);

        int VetA[] = new int[8];
        VetA[0] = 25;
        VetA[1] = 48;
        VetA[2] = 37;
        VetA[3] = 12;
        VetA[4] = 57;
        VetA[5] = 86;
        VetA[6] = 33;
        VetA[7] = 92;

        //Passo 2
        System.out.println(" Dados de entrada...");
        for (i = 0; i < 8; i++) {
            System.out.println(" Posição [" + i + "] = " + VetA[i]);
        }

        //Passo3
        System.out.println("Imprimir Vetor Desordenado...");
        for (i = 0; i < 8; i++) {
            System.out.print(VetA[i] + "\t");
        }

        // Passo4 
        System.out.print("\n Metodo de Ordenação Insertion Sort ...\n\n");
        int aux;
        for (int j = 1; j < 8; j++) {
            aux = VetA[j];
            i = j - 1;
            while (i >= 0 && VetA[i] > aux) {
                VetA[i + 1] = VetA[i];
                i = i - 1;
                cont1 = cont1 + 1;
            }
            VetA[i + 1] = aux;
            cont2 = cont2 + 1;
        }

        //Passo5
        System.out.println("Imprimir Vetor Ordenado...");
        for (i = 0; i < 8; ++i) {
            System.out.print(VetA[i] + "\t");
        }
        System.out.print("\n\n Trocas: " + cont1);
        System.out.print("\n\n Interações: " + cont2 + "\n\n");

    }
}
