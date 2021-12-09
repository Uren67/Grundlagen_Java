
public class Tausch {

	    public static void main(String[] args) {

	        int num1 = 6;
	        int num2 = 8;

	        System.out.println("Vorher");
	        System.out.println("Nummer1 " + num1);
	        System.out.println("Nummer2 " + num2);

	        // speicher in num3 das Wert von num1
	        int num3 = num1;
	        // num3 = 6 und num1 = 6
	        
	        // speicher in num1 das Wert von num2
	        num1 = num2;
	        // num1 = 8 und num2 = 8
	        
	        // speicher in num2 das Wert von num3
	        num2 = num3;
	        // num2 = 6 und num3 = 6

	        System.out.println("Nachher");
	        System.out.println("Nummer1 " + num1);
	        System.out.println("Nummer2 " + num2);
	    }
	}

