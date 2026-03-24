public class PilhaEstatica {

    private int[] elementos;
    private int topo;

    public PilhaEstatica(int tamanho) {
        elementos = new int[tamanho];
        topo = -1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == elementos.length - 1;
    }

    public void push(int valor) {
        if (estaCheia()) {
            System.out.println("Erro: pilha cheia!");
        } else {
            elementos[++topo] = valor; 
            System.out.println("Valor " + valor + " adicionado na pilha.");
        }
    }

    public int pop() {
        if (estaVazia()) {
            System.out.println("Erro: pilha vazia!");
            return Integer.MIN_VALUE; 
        } else {
            int valor = elementos[topo--];
            System.out.println("Valor removido: " + valor);
            return valor;
        }
    }

    public int peek() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return Integer.MIN_VALUE;
        }
        return elementos[topo];
    }

    public int tamanho() {
        return topo + 1;
    }

    public void limpar() {
        topo = -1;
        System.out.println("Pilha limpa!");
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return;
        }

        System.out.println("Conteúdo da pilha (topo -> base):");
        for (int i = topo; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }
}
