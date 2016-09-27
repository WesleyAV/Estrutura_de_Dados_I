/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula1;

/**
 *
 * @author Wesley A.V
 */
public class Selection {

    public static void main(String[] args) {
        char[] vet = {'O', 'R', 'D', 'E', 'N', 'A'};
        char aux;
        int posicaoMenor;

        for (int i = 0; i < vet.length - 1; i++) {
            posicaoMenor = i;
            //percorre os elementos a direita de i
            for (int j = i + 1; j < vet.length; j++) {
                //verifica se a posição em teste possui valor inferior ao elemento da posição "i"
                if (vet[j] < vet[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            //troca os valores de posição
            aux = vet[posicaoMenor];
            vet[posicaoMenor] = vet[i];
            vet[i] = aux;
        }
    }
}
