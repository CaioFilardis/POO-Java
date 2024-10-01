package academy.devdojo.maratonajava.javacore.Csobrecargametodos.exerciciosobrecarga.dominio;

public class Livro {

    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean detalhar;

    public void imprimir() {
        System.out.println(this.titulo);
    }

    public void imprimir(boolean detalhar) {
        if (detalhar == true) {
            System.out.println("Nome do livro: "+this.titulo);
            System.out.println("Autor do livro: "+this.autor);
            System.out.println("Numeros de páginas: "+this.numeroPaginas);
            return;
        }
        System.out.println("Nome do titulo: "+this.titulo);
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void setDetalhar(boolean detalhar) {
        this.detalhar = detalhar;
    }

    public boolean getDetalhar() {
        return this.detalhar;
    }
}
