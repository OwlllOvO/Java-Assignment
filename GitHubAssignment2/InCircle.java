package GitHubAssignment2;
import java.util.Scanner;

public class InCircle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入"); 
		Scanner input=new Scanner(System.in); 
		double x=input.nextDouble(); 
		double y=input.nextDouble(); 
		if(x*x+y*y<100)
			System.out.println("In"); 
		else 
			System.out.println("Out");
		input.close();
	}
}
