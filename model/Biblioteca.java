import java.util.ArrayList;

public class Biblioteca {
    // Criar array
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Livro> livrosEmprestados = new ArrayList<>();


    // Metodos
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void removerLivro(Livro livro){
        livros.remove(livro);
    }

    public boolean emprestarLivro(String titulo){
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isDisponivel()){
                if (livro.emprestar()) {
                    livrosEmprestados.add(livro);
                    System.out.println("Livro emprestado " + livro.getTitulo());
                    return true;
                }
            }
        }
        System.out.println("Livro nao disponivel para empréstimo. ");
        return false;
    }

    public boolean devolverLivro(String titulo){
        for (Livro livro : livrosEmprestados) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                if (livro.devolver()) {

                    livrosEmprestados.remove(livro);
                    System.out.println("Livro devolvido: " + livro.getTitulo());
                    return true;
                }
            }
        }

        System.out.println("Este livro nao foi emprestado.  ");
        return false;
    }


    // Adicionar livros
    // Remover livro
    // Buscar por titulo
    // Salvar em arquivo
    // carregar de arquivo [talvez]

}
