package ED_05_Arvore;

/**
 *
 * @author Wesley A.V
 */
public class usaArvore {

    public static void main(String[] args) {
        BArvore arvore1 = new BArvore();
        arvore1.inserirNo(14);
        arvore1.inserirNo(16);
        arvore1.inserirNo(12);
        arvore1.inserirNo(11);
        arvore1.inserirNo(17);
        arvore1.inserirNo(15);
        arvore1.exibirNo();
        arvore1.inserirNo(10);
        arvore1.inserirNo(13);
        System.out.println("Nos a esquerda");
        arvore1.exibirNo_esq();
        System.out.println("Nos a direita");
        arvore1.exibirNo_dir();
    }
}
