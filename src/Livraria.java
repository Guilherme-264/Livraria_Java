public class Livraria
{
    int posicaoAtual = 0;
    Livro[] livros;

    public Livraria(int numLivros)
    {
        livros = new Livro[numLivros];
    }

    public void inserirLivro(Livro livro)
    {
        livros[posicaoAtual] = livro;
        posicaoAtual++;
    }

    public void listarLivros()
    {
        System.out.println("Livros da biblioteca:");
        for (int i = 0; i < posicaoAtual; i++) {
            System.out.println("Livro " +(i+1) + ": "+ livros[i].titulo);
        }
    }

    public void listarDisponiveis()
    {
        System.out.println("Livros disponiveis:");
        for (int i = 0; i < posicaoAtual; i++) {
            if (livros[i].disponibilidade)
            {
                System.out.println("Livro " +(i+1) + ": "+ livros[i].titulo);
            }
        }
    }
}
