
import java.util.*;

public class Fase2 {

	public static void main(String[] args) {
		
	
		String s1 = "";
		String s2 = "";
		String s3 = "";
		String s4 = "";
		String s5 = "";
		String s6 = "";
		
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter the name of the 1st city: ");
		s1 = user_input.next( );
		
		System.out.print("Enter the name of the 2nd city: ");
		s2 = user_input.next( );
		
		System.out.print("Enter the name of the 3rd city: ");
		s3 = user_input.next( );
		
		System.out.print("Enter the name of the 4th city: ");
		s4 = user_input.next( );
		
		System.out.print("Enter the name of the 5th city: ");
		s5 = user_input.next( );
		
		System.out.print("Enter the name of the 6th city: ");
		s6 = user_input.next( );
		
		
		String[] arrayCiutats = new String [] { s1, s2, s3, s4, s5, s6 };
		
		Arrays.sort(arrayCiutats);
		 	System.out.println(Arrays.toString(arrayCiutats));
		
		
	}

}


