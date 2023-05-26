public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.raiz = new Node(1);
        arvore.raiz.esquerda = new Node(2);
        arvore.raiz.direita = new Node(3);
        arvore.raiz.esquerda.direita = new Node(4);
        arvore.raiz.direita.esquerda = new Node(5);
        arvore.raiz.direita.direita = new Node(6);
        arvore.raiz.direita.esquerda.esquerda = new Node(7);
        arvore.raiz.direita.esquerda.direita = new Node(8);

        if (arvore.estaBalanceada())
            System.out.println("A árvore está balanceada.");
        else
            System.out.println("A árvore não está balanceada.");
    }
}
