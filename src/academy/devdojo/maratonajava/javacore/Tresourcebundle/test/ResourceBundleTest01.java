package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {

    public static void main(String[] args) {
        // Localização dentro de um sistema
        System.out.println(Locale.getDefault());
        ResourceBundle bundle =  ResourceBundle.getBundle("messages", new Locale("pt", "BR"));

        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
    }
}
