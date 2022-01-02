package GitHubAssignment3;
import java.util.Arrays;
import java.util.Scanner;
public class SortString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in); 
		String a=input.next(); 
		char[] arrayCh=a.toCharArray(); 
		Arrays.sort(arrayCh); 
		String sortedStr=new String(arrayCh); 
		System.out.println(sortedStr);
		input.close();
	}
}
