
import java.util.*;

public class Fase4 {

	public static void main(String[] args) {
		
		String[] arr = new String[6];
		arr[0] = "Barcelona";
		arr[1] = "Madrid";
		arr[2] = "Valencia";
		arr[3] = "Malaga";
		arr[4] = "Cadis";
		arr[5] = "Santander";
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = Reverse(arr[i]);
        }
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }

    private static String Reverse(String str) {
        StringBuilder result = new StringBuilder();
        StringTokenizer st = new StringTokenizer(str, "");
        while (st.hasMoreTokens()) {
            StringBuilder thisToken = new StringBuilder(st.nextToken());
            result.append(thisToken.reverse() + " ");
        }
        return result.toString();
  				
	}

}
