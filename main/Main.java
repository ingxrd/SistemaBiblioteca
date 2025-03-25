public class Main {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "JK Rowling", 123,true);
        Livro livro2 = new Livro("Harry Potter e a Camara Secreta", "JK Rowling", 212,false);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.removerLivro(livro1);

        biblioteca.emprestarLivro("Harry Potter e a Pedra Filosofal");
        biblioteca.emprestarLivro("Harry Potter e a Camara Secreta");


    }

}
