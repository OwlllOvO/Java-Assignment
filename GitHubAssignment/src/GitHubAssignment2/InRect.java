package GitHubAssignment2;
import java.util.Scanner;

public class InRect {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入"); 
		Scanner input=new Scanner(System.in); 
		double x=input.nextDouble(); 
		double y=input.nextDouble(); 
		if(Math.abs(x)<5.0 && Math.abs(y)<2.5) 
			System.out.println("In");
		else 
			System.out.println("Out");
		input.close();
	}
}
