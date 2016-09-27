package Aula1;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wesley A.V Método de ordenação - Bubble Sort
 */
public class Bubble_Sort {

    public static void main(String[] args) {
        //declaração de variáveis
        int i, tam;
        //Passo 1
        //entrada de dados
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

        for (int j = 0; j < tam; j++) {
            aux = VetA[j];
            i = j + 1;
            if (VetA[j] > VetA[i]) {
                VetA[j] = VetA[i];
                VetA[i] = aux;
            }
        }

        // Passo 5
        System.out.println("Imprimindo o Vetor ordenado...");
        for (i = 0; i < tam; i++) {
            System.out.println(VetA[i] + "\t");
        }

    }

}
