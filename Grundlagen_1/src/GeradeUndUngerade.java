import java.util.Scanner;

public class GeradeUndUngerade {

	    public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	        System.out.print("Nummer eingeben: ");
	        int zahl = scan.nextInt();

	        if(zahl % 2 == 0)
	            System.out.println(zahl + " gerade Zahl");
	        else
	            System.out.println(zahl + " ungerade Zahl");
	    }
	
	
	
}
