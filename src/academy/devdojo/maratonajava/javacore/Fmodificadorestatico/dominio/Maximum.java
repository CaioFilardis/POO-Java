package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Maximum {
    public static double number1;
    public static double number2;
    public static double number3;

    public static double maximum(double x, double y, double z) {
        double maximumValue = x;

        if (y > maximumValue) {
            maximumValue = y;
        }
        if (z > maximumValue) {
            maximumValue = z;
        }
        return maximumValue;
    }
}
