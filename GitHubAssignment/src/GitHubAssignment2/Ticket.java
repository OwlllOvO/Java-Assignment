package GitHubAssignment2;

import java.util.Scanner;

public class Ticket {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cp = (int)(Math.random()*900+100);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits): ");
		int guess = input.nextInt();
		int n1 = cp/100;
		int n2 = (cp/10)%10;
		int n3 = cp%10;
		int m1 = guess/100;
		int m2 = (guess/10)%10;
		int m3 = guess%10;
		System.out.println("The lottery number is " + cp);
		if(guess == cp)
			System.out.println("Exact match: you win $10,000");
		else if ((m1==n1 && m2==n3 && m3==n2) || (m1==n2 && m2==n1 && m3==n3) || (m1==n2 && m2==n3 && m3==n1) || (m1==n3 && m2==n2 && m3==n1) || (m1==n3 && m2==n1 && m3==n2))
			System.out.println("Exact match: you win $3,000");
		else if((m1==n1 || m1==n2 || m1==n3) || (m2==n1 || m2==n2 || m2==n3) || (m3==n1 || m3==n2 || m3==n3))
			System.out.println("Exact match: you win $1,000");
		input.close();
	}
}
