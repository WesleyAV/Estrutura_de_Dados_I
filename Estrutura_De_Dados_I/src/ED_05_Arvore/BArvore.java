package ED_05_Arvore;

/**
 *
 * @author Wesley A.V
 */
public class BArvore {

    private BIntNo Raiz;

    private BIntNo inserir(BIntNo arvore, int novoNo) {
        if (arvore == null) {
            return new BIntNo(novoNo);
        } else if (novoNo < arvore.valor) {
            arvore.esq = inserir(arvore.esq, novoNo);
        } else {
            arvore.dir = inserir(arvore.dir, novoNo);
        }
        return arvore;
    }

    public void inserirNo(int novoValor) {
        Raiz = inserir(Raiz, novoValor);
    }

    private void exibir_esquerdo(BIntNo arv) {
        if (arv != null) {
            exibir_esquerdo(arv.esq);
            System.out.println(arv.valor);
        }
    }

    private void exibir_direito(BIntNo arv) {
        if (arv != null) {
            exibir_direito(arv.dir);
            System.out.println(arv.valor);
        }
    }

    public void exibir_raiz() {
        System.out.println("Raiz " + Raiz.valor);
    }

    public void exibirNo_esq() {
        exibir_esquerdo(Raiz);
    }

    public void exibirNo_dir() {
        exibir_direito(Raiz);
    }

    void exibirNo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
