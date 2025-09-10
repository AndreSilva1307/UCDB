package modelo;

public class LivroM {
    private String titulo;
    private AutorM autorm;
    private int isbn;
    private String anoPublicacao;

    public LivroM(String titulo, AutorM autorm, int isbn, String anoPublicacao) {
        this.titulo = titulo;
        this.autorm = autorm;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public AutorM getAutorm() {
        return autorm;
    }

    public void setAutorm(AutorM autorm) {
        this.autorm = autorm;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
