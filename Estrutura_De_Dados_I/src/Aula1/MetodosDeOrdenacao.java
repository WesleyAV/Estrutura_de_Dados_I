package Aula1;


import java.util.Scanner;


/**
 *
 * @author Wesley A.V
 */
public class MetodosDeOrdenacao {

    public static void main(String[] args) {
        int i = 0, tam = 0;

        InsertionSort(i, tam);
    }

    static void InsertionSort(int i, int tam) {
        //Insertion Sort
        //Passo 1
        //int i, tam;
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o tamanho do Vetor...");
        tam = ler.nextInt();

        int VetA[] = new int[tam];

        //Passo 2
        System.out.println("Entrada de dados no Vetor");
        for (i = 0; i < tam; i++) {
            System.out.print("Posição [" + i + "] = ");
            VetA[i] = ler.nextInt();
        }

        //Passo 3
        System.out.println("Imprimindo o Vetor desordenado...");
        for (i = 0; i < tam; i++) {
            System.out.println(VetA[i] + "\t");
        }

        //Passo 4 - Método de Inserção
        int aux;
        for (int j = 1; j < tam; j++) {
            aux = VetA[j];
            i = j - 1;
            while (i >= 0 && VetA[i] > aux) {
                VetA[i + 1] = VetA[i];
                i = i - 1;
            }
            VetA[i + 1] = aux;
        }

        // Passo 5
        System.out.println("Imprimindo o Vetor ordenado...");
        for (i = 0; i < tam; i++) {
            System.out.println(VetA[i] + "\t");
        }
    }

}
