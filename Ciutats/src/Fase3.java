import java.util.Arrays;

public class Fase3 {

	public static void main(String[] args) {

		String s1 = "Barcelona";
		String s2 = "Madrid";
		String s3 = "Valencia";
		String s4 = "Malaga";
		String s5 = "Cadis";
		String s6 = "Santander";	
		
		String t1 = s1.replace('a','4');
		String t2 = s2.replace('a','4');
		String t3 = s3.replace('a','4');
		String t4 = s4.replace('a','4');
		String t5 = s5.replace('a','4');
		String t6 = s6.replace('a','4');
		
		String[] arrayCiutatsModificades = new String [] { t1, t2, t3, t4, t5, t6 };		
		
		Arrays.sort(arrayCiutatsModificades);
		
	 	System.out.println(Arrays.toString(arrayCiutatsModificades));

	}

}
