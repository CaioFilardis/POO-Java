package dominio;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public void finalNote() {
		double finalNote = nota1 + nota2 + nota3; 
		if (finalNote < 60.0) {
			System.out.printf("FINAL NOTE = %.2f\nFAILED\nMISSING %.2f points", 
					finalNote, (60 - finalNote)); return;
		}
		System.out.printf("FINAL NOTE = %.2f", finalNote);
	}
}
