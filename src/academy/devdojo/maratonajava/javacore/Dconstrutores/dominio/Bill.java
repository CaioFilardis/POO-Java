package dominio;

public class Bill {
		
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		double cover = (this.beer * 5) + (this.barbecue * 7) + (this.softDrink * 3);
		return cover;
	}
	
	public double feeding() {
		if (cover() < 30) {
			return 4.0;
		} 
		return 0;	
	}
	
	public double ticket() {
		if (this.gender == 'F') {
			return 8.00;
		}
		return 10.00;
	}
	
	public double total() {
		return cover() + feeding() + ticket();
	}
}
