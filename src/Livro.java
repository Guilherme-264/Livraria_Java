public class Livro {
    public String titulo;
    public String autor;
    public int numeroPaginas;
    public boolean disponibilidade;

    public Livro(String titulo, String autor,int numeroPaginas)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponibilidade = true;
    }

    public void exibirDetalhes()
    {
        System.out.println("Titulo do livro:"+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Número de páginas: "+ numeroPaginas);
        if (disponibilidade) {
            System.out.println("O livro está disponível para retirada");
        }else
        {
            System.out.println("O livro não está disponível para retirada");
        }
    }

    public void reservar()
    {
        if (disponibilidade) {
            System.out.println("Empréstimo realizado.ºuº");
            disponibilidade = false;
        }else {
            System.out.println("Livro não disponivel;-;");
        }
    }

    public void devolver()
    {
        disponibilidade = true;
        System.out.println("Livro devolvido :)");
    }

}
