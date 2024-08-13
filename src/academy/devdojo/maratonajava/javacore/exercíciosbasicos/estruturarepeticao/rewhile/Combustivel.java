package academy.devdojo.maratonajava.javacore.exercíciosbasicos.estruturarepeticao.rewhile;


import java.util.Scanner;

public class Combustivel{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fim = 4, alcool = 0, gasolina = 0, diesel = 0;
		System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
		int codigo = sc.nextInt();
		
		while (codigo != fim) {
			
			switch (codigo) {
				case 1 -> {
					alcool++;
					break;
				}
				case 2 -> {
					gasolina++;
					break;
				}
				case 3 -> {
					diesel++;
				}
			}
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();
		}
		System.out.println("Muito obrigado\nAlcool: "+alcool+ "\nGasolina: "+gasolina+"\nDiesel: "+diesel);
	}
}