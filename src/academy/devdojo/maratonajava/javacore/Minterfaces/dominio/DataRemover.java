package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataRemover {

    public abstract void remove();

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieve na interface");
    }
}
