package GitHubAssignment3;

import java.util.Scanner;

public class CountNumbers {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int[] a = new int[101];
		int i;
		for(i=1;i<=100;i++)
			a[i]=0;
		int k=input.nextInt();
		while(k!=0) {
			a[k]++;
			k=input.nextInt();
		}
		for(i=1;i<=100;i++) {
			if(a[i]!=0) {
				System.out.print(i+" occurs "+a[i]+" time");
			    if(a[i]>1)
				    System.out.println("s");
			    else
				    System.out.println();
			}
		}
	}
}
