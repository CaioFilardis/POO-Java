package exerciciosconstrutoresesobrecarga.dominio;

public class Account {

    private String name;
    private double balance;

    public Account(String name) {
        this.name= name;
    }

    public void imprime() {
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }
}
