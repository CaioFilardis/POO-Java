package academy.devdojo.maratonajava.javacore.exercíciosbasicos.estruturarepeticao.rewhile;


import java.util.Scanner;

public class ControlePesoAeronaveWhile {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Peso máximo para aeronave: ");
		float pesoMaximo = sc.nextFloat();
		
		float pesoTotalPassageiros = 0F;
		boolean incluirNovoPassageiro = true;
		
		while (pesoTotalPassageiros < pesoMaximo && incluirNovoPassageiro) {
			System.out.print("peso dos passageiros: ");
			float pesoPassageiros = sc.nextFloat();
			
			pesoTotalPassageiros = pesoTotalPassageiros + pesoPassageiros;
			System.out.print("Deseja incluir novo passageiros?");
			incluirNovoPassageiro = sc.nextBoolean();
		}
		
		System.out.printf("Peso máximo da aeronave: %.2f kg%n", pesoMaximo);
		System.out.printf("Peso total dos passageiro: %.2f kg%n", pesoTotalPassageiros);
	
	}
}