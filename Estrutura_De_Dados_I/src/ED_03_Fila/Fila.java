package ED_03_Fila;

import javax.swing.JOptionPane;

/**
 *
 * @author Wesley A.V
 */
public class Fila {

    int inicio;
    int fim;
    int tamanho;
    int qtdeElementos;
    int f[];

    public Fila() {
        inicio = fim = -1;
        tamanho = 100;
        f = new int[tamanho];
        qtdeElementos = 0;
    }

    public boolean estaVazia() {
        if (qtdeElementos == 0) {
            return true;
        }
        return false;
    }

    public boolean estaCheia() {
        if (qtdeElementos == tamanho - 1) {
            return true;
        }
        return false;
    }

    public void adicionar(int e) {
        if (!estaCheia()) {
            if (inicio == -1) {
                inicio = 0;
            }
            fim++;
            f[fim] = e;
            qtdeElementos++;
        }
    }

    public void remover() {
        if (!estaVazia()) {
            inicio++;
            qtdeElementos--;
            JOptionPane.showMessageDialog(null, "Elemento excluído ");
        } else {
            JOptionPane.showMessageDialog(null, "Todos os elementos foram excluídos");
        }
    }

    public void mostrar() {
        String elementos = "";
        for (int i = inicio; i <= fim; i++) {
            elementos += f[i] + " - ";
        }
        JOptionPane.showMessageDialog(null, elementos);
    }

    public static void main(String[] args) {
        int opcao = 1;
        Fila F = new Fila();

        while (opcao != 4) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção: \n"
                    + "1 - Incluir novos processos na fila \n"
                    + "2 - Retirar da fila o processo com maior tempo de espera \n"
                    + "3 - Exibir os processos da fila \n"
                    + "4 - Sair \n"));
            int valor;
            switch (opcao) {
                case 1:
                    valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Enfileirar elemento \n" + "Digite um valor: "));
                    F.adicionar(valor);
                    break;
                case 2:
                    F.remover();
                    break;
                case 3:
                    F.mostrar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "sair");
            }
        }
    }
}
