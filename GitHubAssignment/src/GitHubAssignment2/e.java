package GitHubAssignment2;

public class e {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ans=1;
		double b=1.0;
		for(int i=1;i<=100000;i++) 
		{
			b=b/(double)i;
			ans=ans+b;
			if(i%10000==0)System.out.println(ans);
		}
	}
}
