/*
 * Questão 1 - Aplicar o método InsertionSort  para classificar o vetor   
 * [25   48   37   12   57   86   33   92]  na ordem crescente.  
 * Apresente auantas iterações e quantas trocas foram necessárias para ordenar o vetor ?
 */
package Ed_1;

/**
 *
 * @author Wesley A.V
 */
public class Exer1 {

    public static void main(String[] args) {
        //declaração de variáveis
        int vetor[] = {25, 48, 37, 12, 57, 86, 33, 92};
        int aux;
        boolean controle;

        for (int i = 0; i < vetor.length; ++i) {
            controle = true;
            for (int j = 0; j < (vetor.length - 1); ++j) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    controle = false;
                }

            }
            if (controle) {
                break;
            }
        }

        for (int i = 0; i < vetor.length; ++i) {
            System.out.println(vetor[i] + "");
        }

    }
}
