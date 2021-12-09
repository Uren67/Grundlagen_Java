
public class Umkehr {
	
		  public static void main(String[] args) {

		    int nummer = 987654321, umkehr = 0;

		    while(nummer != 0) {
		    
		      int ziffer = nummer % 10;
		      umkehr = umkehr * 10 + ziffer;
		      nummer = nummer/10;
		    }

		    System.out.println("Ergebnis: " + umkehr);
		  }
		}