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
            topo++;
            elementos[topo] = valor;
        }
    }

    public int pop() {
        if (estaVazia()) {
            System.out.println("Erro: pilha vazia!");
            return -1;
        } else {
            int valor = elementos[topo];
            topo--;
            return valor;
        }
    }

    public int peek() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        return elementos[topo];
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia!");
            return;
        }

        System.out.println("Conteúdo da pilha:");
        for (int i = topo; i >= 0; i--) {
            System.out.println(elementos[i]);
        }
    }
}