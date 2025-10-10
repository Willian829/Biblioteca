public class Usuario {
    private String nome;
    private int id;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void emprestarLivro(Livro livro) {
        if (livro.emprestar()) {
            IO.println(nome + " emprestou o livro: " + livro.getTitulo());
        } else {
            IO.println("O livro " + livro.getTitulo() + " nao esta disponivel para emprestimo.");
        }
    }

    public void devolverLivro(Livro livro) {
        livro.devolver();
        IO.println(nome + " devolveu o livro: " + livro.getTitulo());
    }

    @Override
    public String toString() {
        return "Usuario{id = " + id + ", nome = '" + nome + "'}";
    }
    
}
