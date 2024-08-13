public class EstruturaDeRepeticao {

	public static void main(String[] args) {
		int count = 0;
		
		System.out.println("While");
		while (count < 10) {
			System.out.printf("%d%n", count);
			count++;
		}
		System.out.println("Do-While");
		count = 0;
		
		do {
			System.out.println(count);
			count++;
		}while (count < 10);
		
		System.out.println("For");
		
		for (count = 0; count < 10; count++) {
			System.out.println(count);
		}
	}
	
}