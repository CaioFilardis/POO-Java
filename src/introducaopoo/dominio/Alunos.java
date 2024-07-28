package dominio;

public class Alunos {
	
	public String name;
	public double firstNote;
	public double secondNote;
	public double thirdNote;
	
	public double noteFinal() {
		return firstNote + secondNote + thirdNote;
	}
	
	public void resultFinal(double pontosFaltantes) {
		if (pontosFaltantes > 60.0) {
			System.out.println("PASS");
		}
		else {
			pontosFaltantes = 60.0 - pontosFaltantes;
			System.out.println("FAILED\nFALTARAM "+pontosFaltantes+" PONTOS");
		}
	}
	
}
