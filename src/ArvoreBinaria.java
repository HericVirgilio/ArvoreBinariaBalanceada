public class ArvoreBinaria {
    Node raiz;

    boolean estaBalanceada() {
        return verificarBalanceamento(raiz) != -1;
    }

    int verificarBalanceamento(Node no) {
        if (no == null)
            return 0;

        int alturaEsquerda = verificarBalanceamento(no.esquerda);
        if (alturaEsquerda == -1)
            return -1;

        int alturaDireita = verificarBalanceamento(no.direita);
        if (alturaDireita == -1)
            return -1;

        int diferenca = Math.abs(alturaEsquerda - alturaDireita);
        if (diferenca > 1)
            return -1;

        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }
}
