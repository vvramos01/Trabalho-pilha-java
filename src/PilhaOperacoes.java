public interface PilhaOperacoes {

    void empilhar(String elemento);
    String desempilhar();
    String topo();

    boolean estaVazia();
    boolean estaCheia();

    int tamanho();
    void limpar();

    void exibir();
    boolean buscar(String elemento);
}
