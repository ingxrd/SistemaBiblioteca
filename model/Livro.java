
public class Livro {
    // Atributos
    private String titulo;
    private String autor;
    private int ISBN;
    private boolean disponivel;

    // Construtor
    public Livro(String titulo, String autor, int ISBN, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponivel = true;
    }
    // Métodos
    public boolean emprestar() {
        return disponivel;
    }

    public boolean devolver(){
        if (!disponivel){
            disponivel = true;
            return true;
        }
        return false;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    // Metodos GET

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getISBN(){
        return ISBN;
    }


}

