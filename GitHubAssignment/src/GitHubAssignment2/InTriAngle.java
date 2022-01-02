package GitHubAssignment2;
import java.util.Scanner;

public class InTriAngle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入"); 
		Scanner input=new Scanner(System.in); 
		double x=input.nextDouble(); 
		double y=input.nextDouble(); 
		if(x>0&&y>0&&y<-0.5*x+100) 
			System.out.println("in"); 
		else
			System.out.println("out");
		input.close();
	}
}
