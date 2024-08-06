package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carr {
    private String name;
    private double maxSpeed;
    public static double limitedSpeed = 250;

    /* construtor */
   public Carr(String name, double maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed ;
   }

   /* método*/
    public void imprime() {
       System.out.println("------------------");
       System.out.println("Name: "+this.name);
       System.out.println("Max speed: "+this.maxSpeed);
       System.out.println("Limeted speed: "+Carr.limitedSpeed);
   }

   /* Getters e Setters*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public static void setLimitedSpeed(double limitedSpeed) {
        Carr.limitedSpeed = limitedSpeed;
    }

    public static double getLimitedSpeed() {
        return limitedSpeed;
    }

}
