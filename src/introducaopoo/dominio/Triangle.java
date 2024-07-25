package Aintroducaopoo.dominio;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void result(double areaX, double areaY) {
        if (areaX > areaY) {
            System.out.println("Triangle X");
        }
        else {
            System.out.println("Triangle Y");
        }
    }
}
