public class Main {
    public static void main(String[] args)
    {
        Livro l1 = new Livro("papai é pop", "Marcos Piangers", 112);
        Livro l2 = new Livro("titulo bunito", "autor bunitu", 213);
        l1.exibirDetalhes();

        Livraria Saraiva = new Livraria(10);
        Saraiva.inserirLivro(l1);
        Saraiva.inserirLivro(l2);

        Saraiva.listarLivros();

        l1.reservar();
        Saraiva.listarDisponiveis();

        l1.devolver();
        Saraiva.listarDisponiveis();
    }

}