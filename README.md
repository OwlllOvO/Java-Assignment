# JAVA 平时作业

- GitHub Repo: https://github.com/OwlllOvO/Java-Assignment



## GitHub Assignment1

`Welcome.java`

```java
package GitHubAssignment1;

public class Welcome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to Java!");

	}
}

```



`WelcomeWithThreeMessages.java`

```java
package GitHubAssignment1;

public class WelcomeWithThreeMessages {
	public static void main(String[] args) {
		System.out.println("Programming is fun!");
		System.out.println("Fundamentals First");
		System.out.println("Problem Driven");
	}
}

```



`ComputeExpression.java`

```java
package GitHubAssignment1;

public class ComputeExpression {
	public static void main(String[] args) {
		System.out.print("(10.5 + 2 * 3) / (45 - 3.5) = ");
		System.out.println((10.5 + 2 * 3) / (45 - 3.5));

	}
}

```



`ShowSyntaxErrors.java`

```java
package GitHubAssignment1;

public class ShowSyntaxErrors {
	public static main(String[] args) {
		System.out.println("Welcome to Java);
	}
}

```



`ShowRuntimeerrors.java`

```
package GitHubAssignment1;

public class ShowRuntimeErrors {
 public static void main(String[] args) {
	 System.out.println(1/0);
 }
}

```



`ShowLogicErrors.java`

```java
package GitHubAssignment1;

public class ShowLogicErrors {
	public static void main(String[] args) {
		System.out.print("Celsius 35 is Fahrenheit degree ");
		System.out.println((9 / 5) * 35 + 32);

	}
}

```



`ComputeArea.java`

```java
package GitHubAssignment1;

public class ComputeArea {
	public static void main(String[] args) {
		double radius;
		double area;
		
		radius = 20;
		area = radius * radius * 3.14159;
		
		System.out.println("The area is the circle of radius " + radius + "is " + area);

	}
}

```



`ComputeAreaWithConsoleInput.txt`

```java
package GitHubAssignment1;
import java.util.Scanner; 

public class ComputeAreaWithConsoleInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		double area = radius * radius * 3.14159;
		System.out.println("The area is the circle of radius " + radius + "is " + area);

	}
}

```



`ComputeAverage.java`

```java
package GitHubAssignment1;
import java.util.Scanner; 

public class ComputeAverage {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double average = (number1 + number2 + number3) / 3;
		
		System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " is " + average);
	}
}

```



`ComputeAreaWithConstant.java`

```java
package GitHubAssignment1;
import java.util.Scanner; 

public class ComputeAreaWithConstant {
	public static void main(String[] args) {
		final double PI = 3.14159;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number for radius: ");
		double radius = input.nextDouble();
		double area = radius * radius*PI;
		
		System.out.println("The area is the circle of radius "+radius+"is "+area);

	}
}

```



`DisplayTime.java`

```java
package GitHubAssignment1;
import java.util.Scanner; 

public class DisplayTime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for seconds: ");
		int seconds = input.nextInt();
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + "seconds is " + minutes+"minutes and " + remainingSeconds + "seconds ");

	}
}

```



`FahrenheitToCelsius.java`

```java
package GitHubAssignment1;
import java.util.Scanner; 

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a degree in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
	
	}
}

```



`ShowCurrentTime.java`

```java
package GitHubAssignment1;

public class ShowCurrentTime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHours = totalHours % 24;
		
		System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");

	}
}

```



`SalesTax.java`

```java
package GitHubAssignment1;
import java.util.Scanner; 

public class SalesTax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter purchase amount: ");
		double purchaseAmount = input.nextDouble();
		
		double tax = purchaseAmount*0.06;
		System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
		
	}
}

```



`ComputeLoan.java`

```java
package GitHubAssignment1;

import java.util.Scanner;
public class ComputeLoan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter annual interest rate,e.g.,7.25: ");
		double annualInterestRate = input.nextDouble();
		double monthlyInterestRate = annualInterestRate / 1200;
		System.out.print("Enter number of years as an integer,e.g.,5: ");
		int numberOfYears = input.nextInt();
		
		System.out.print("Enter loan amount,e.g.,120000.95: ");
		double loanAmount = input.nextDouble();
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println("The monthly payment is $" + (int)(monthlyPayment) * 100 / 100.0);
	
		System.out.println("The total payment is $" + (int)(totalPayment) * 100 / 100.0);
	}

}

```





## GitHub Assignment2

3.4 `RandomMonth.java`

```java
//**3.4

package GitHubAssignment2;

public class RandomMonth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = (int)(Math.random()*12+1);
		String a[][]= new String [][]{{"s","d"},{"d","d"}};
		String s[]= new String []{"January","February","March","April","May","June","July","August","September","October","November","December"};
		System.out.println(s[i]);
	}
}

```



3.9 `ISBN.java`

```java
//**3.9

package GitHubAssignment2;
import java.util.Scanner;

public class ISBN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the first 9digits of an ISBN as integer: ");
		Scanner input =new Scanner(System.in);
		int i=0,sum=0;
		String k;
		k=input.next();
		System.out.print("The ISBN-10 number is "+k);
		for(i=0;i<9;i++)
		    sum+=((int)k.charAt(i)-48)*(i+1);
		sum%=11;
		if(sum!=10)
			System.out.print(+sum);
		else
		    System.out.print("X");
	}
}

```



3.15 `Ticket.java`

```java
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

```



3.19 `ComputeTriAngleCircumference`

```java
package GitHubAssignment2;
import java.util.Scanner;

public class ComputeTriAngleCircumference {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入"); 
		Scanner input=new Scanner(System.in); 
		double a=input.nextDouble(); 
		double b=input.nextDouble(); 
		double c=input.nextDouble(); 
		if(a<b+c&&b<a+c&&c<a+b) 
			System.out.println("legal");
		else
			System.out.println("illegal");
		input.close();
	}
}

```



3.21 `DayInWeek.java`

```java
package GitHubAssignment2;
import java.util.Scanner;

public class DayInWeek {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("输入"); 
		Scanner input=new Scanner(System.in); 
		int year=input.nextInt(); 
		int month=input.nextInt(); 
		int day=input.nextInt(); 
		int q=day; 
		int m=month; 
		if(m<=2) 
		{ 
			m+=12; 
			year--; 
		}
		int j=year/100; 
		int k=year%100; 
		int h=(q+(int)(26*(m+1)/10)+k+(int)(k/4)+(int)(j/4)+5*j)%7; 
		if(h==0) 
			System.out.println("Saturday"); 
		else if(h==1) 
			System.out.println("Sunday");
		else if(h==2) 
			System.out.println("Monday");
		else if(h==3) 
			System.out.println("Tuesday"); 
		else if(h==4) 
			System.out.println("Wednesday");
		else if(h==5) 
			System.out.println("Thusday"); 
		else if(h==6) 
			System.out.println("Friday");
		input.close();
	}
}

```



3.22 `InCircle.java`

```java
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

```



3.23 `InRect`

```java
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

```



3.24 `PickCard.java`

```java
package GitHubAssignment2;

public class PickCard {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Card=(int)(Math.random()*13)+1;
		if(Card==1)
			System.out.print("The card your picked is Ace of ");
		else if(Card==11)
			System.out.print("The card your picked is Jack of ");
		else if(Card==12)
			System.out.print("The card your picked is Queen of ");
		else if(Card==13)
			System.out.print("The card your picked is King of ");
		else
			System.out.print("The card your picked is "+Card+ " of ");
		int Suit=(int)(Math.random()*4);
		if(Suit==0)
			System.out.print("Clubs");
		else if(Suit==1)
			System.out.print("Diamonds");
		else if(Suit==2)
			System.out.print("Hearts");
		else if(Suit==3)
			System.out.print("Spades");
	}
}

```



3.27 `InTriAngle.java`

```java
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

```



3.28 `IsInSquare.java`

```java
package GitHubAssignment2;
import java.util.Scanner;

public class IsInSquare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter two numbers:");
		int x=input.nextInt();
		int y=input.nextInt();
		if(x<=5&&x>=-5&&y<=2.5&&x>=-2.5)
			System.out.println("It's in square");
		else
			System.out.println("It's not in square");
		
	}
}

```



3.29 `TwoCircles.java`

```java
package GitHubAssignment2;
import java.util.Scanner;

public class TwoCircles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the first x,y,r:");
		Double x1=input.nextDouble();
		Double y1=input.nextDouble();
		Double r1=input.nextDouble();
		System.out.print("Enter the second x,y,r:");
		Double x2=input.nextDouble();
		Double y2=input.nextDouble();
		Double r2=input.nextDouble();
		Double gl=Math.abs(x1-x2)*Math.abs(x1-x2)+Math.abs(y1-y2)*Math.abs(y1-y2);
		Double rgl=Math.abs(r1-r2);
		if(gl<=rgl*rgl)
			System.out.println("circle2 is inside circle1");
		else if(gl>=(r1+r2)*(r1+r2))
			System.out.println("r2 does not overlaps r1");
		else
			System.out.println("circle2 overlaps circle1");
	}
}

```



5.7 `CalculateMoney.java`

```java
package GitHubAssignment2;

public class CalculateMoney {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=10000;
		int i;
		for(i=1;i<=10;i++)
			a*=1.05;
		double sum=0;
		for(i=1;i<=4;i++) {
			sum+=a;
			a*=1.05;
		}
		System.out.print("money is"+sum);
	}
}

```



5.17 `NumberPyramid.java`

```java
package GitHubAssignment2;
import java.util.Scanner;

public class NumberPyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the number of lines:");
		int h=input.nextInt();
		int i,j,k;
		for(i=1;i<=h;i++) {
			for(j=1;j<=h-i;j++)
				System.out.print("  ");
			for(j=1;j<=i*2-1;j++) {
				k=1+Math.abs(j-i);
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
```



5.19 `PascalsTriangle.java`

```java
package GitHubAssignment2;

import java.util.Scanner;

public class PascalsTriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		int h=8;
		int i,j,k;
		int[] a=new int [8];
		a[0]=1;
		for(i=1;i<h;i++) {
			a[i]=a[i-1]*2;
		}
		for(i=1;i<=h;i++) {
			for(j=1;j<=h-i;j++)
				System.out.print("  ");
			for(j=1;j<=i*2-1;j++) {
				k=a[i-Math.abs(j-i)-1];
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}
}

```



5.21 `Compare.java`

```java
package GitHubAssignment2;
import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Loan Amout: ");
        double loan = input.nextDouble();
        System.out.print("Number of Year: ");
        double year = input.nextDouble();
        double up = 0.00125;
        System.out.println("Interest Rate\tMonthly Payment\tTotal Payment\n");
        for (double i = 0.05; i <= 0.081; i += up) 
        {
            System.out.printf("%.3f%%\t\t", i * 100);
            double mon_loan = loan * (i / 12.0) / (1.0 - 1.0 / Math.pow((1.0 + i / 12.0), year * 12.0));
            System.out.printf("%.2f\t\t", mon_loan);
            System.out.printf("%.2f\n", mon_loan * year * 12);
        }
        input.close();
	}
}

```



5.22 `RepaymentTime.java`

```java
package GitHubAssignment2;
import java.util.Scanner;

public class RepaymentTime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loan = input.nextDouble();
        System.out.print("Number of Year: ");
        int year = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double rate = input.nextDouble();
        rate /= 100.0;
        System.out.println("");
        double mon_loan = loan * (rate / 12.0) / (1.0 - 1.0 / Math.pow((1.0 + rate / 12.0), year * 12.0));
        System.out.printf("Monthly Payment: %.2f\n", mon_loan);
        System.out.printf("Total Payment: %.2f\n", mon_loan * 12.0 * year);
        double Balance = loan;
        double Principal, interest;
        System.out.println("Patment#\tInterest\tPrincipal\tBalance\n");
        for (int i = 1; i <= year * 12; i++) 
        {
            interest = rate / 12.0 * Balance;
            Principal = mon_loan - interest;
            Balance = Balance - Principal;
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i, interest, Principal, Balance);
        }
        input.close();
	}
}

```



5.25 `PI.java`

```java
package GitHubAssignment2;
import java.util.Scanner;

public class PI {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int i;
		double pai=0;
		for(i=1;i<=n;i++) {
			if(i%2==0)
				pai-=1/(double)(2*i-1);
			else
				pai+=1/(double)(2*i-1);
		}
		System.out.print("pai="+4*pai);
	}
}

```



5.26 `e.java`

```java
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

```



5.27 `LeapYear.java`

```java
package GitHubAssignment2;

public class LeapYear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=0,sum=0;
		for(i=101;i<=2100;i++) {
			if(i%4==0&&i%100!=0||i%400==0) {
				k++;
				sum++;
				System.out.print(i+" ");
				if(k==10) {
					k=0;
					System.out.println();
				}
			}
		}
		System.out.print("Sum is:"+sum);
	}
}

```



5.28 `DayOfWeek.java`

```java
package GitHubAssignment2;
import java.util.Scanner;

public class DayOfWeek {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter year:");
		int k=input.nextInt();
		k%=100;
		int j=k/100;
		System.out.println("Enter month 1-12:");
		int m=input.nextInt();
		if(m==1||m==2)
			m+=12;
		System.out.println("Enter the day of the month:");
		int q=input.nextInt();
		int h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		System.out.println("Day of the week is: "+h );
		
	}
}

```



5.29 `Calendar.java`

```java
package GitHubAssignment2;


import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter year and xingqiji:");
		int n=input.nextInt();
		int x=input.nextInt();
		int i,j,k,f=1;
		String[] yue=new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
		String[] xq=new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		int s[]=new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		if(x==7) x=0;
		if(n%4==0&&n%100!=0||n%400==0) s[1]++;
		for(i=0;i<12;i++) {
			System.out.println("      "+yue[i]+" "+n);
			System.out.println("Sun Mon Tue Wes Thu Fri Sat");
			for(k=0;f<=s[i];k++) {
				if(k%7==0)
					System.out.println();
				if(k<x) 
					System.out.print("    ");
				else {
					System.out.print("  "+f+" ");
					f++;
				}
				
			}
			System.out.println();
			f=1;
			x=k%7;
		}
	}
}

```



5.32 `GenerateTwoNumbers.java`

```java
package GitHubAssignment2;

public class GenerateTwoNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*10);
		int b=(int)(Math.random()*10);
		while(b==a)
			b=(int)(Math.random()*10);
		System.out.print(a);
		System.out.print(b);
	}
}

```



5.33 `CompleteNumber.java`

```java
package GitHubAssignment2;

public class CompleteNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,n,sum;
		for(i=1;i<=10000;i++) {
			sum=1;
			n=i/2;
			j=2;
			while(j<n) {
				if(i%j==0) {
					sum+=j;
					sum+=i/j;
					n=i/j;
				}
				j++;
			}
			if(sum==i&&i!=1)
				System.out.print(i+" ");
		}
	}
}

```



5.36 `ISBN2.java`

```java
package GitHubAssignment2;
import java.util.Scanner;

public class ISBN2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter the first 9 digits of an ISBN as integer: "); 
		String str = input.next(); 
		int ans = 0;
		for (int i = 0; i < 9; i++) 
		{ 
			int temp = (int) (str.charAt(i) - '0'); 
			ans += temp * (i + 1); 
		}
		ans %= 11; 
		if (ans == 10) 
			str += "X";
		else 
			str += ans; 
		System.out.println("The ISBN-10 number is " + str);
		input.close();
	}
}

```



5.37 `DToB.java`

```java
package GitHubAssignment2;

import java.util.Scanner;

public class DToB {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number:");
		int h=input.nextInt();
		htob(h);

	}
	public static void htob(int h) {
		if(h>=2)
		   htob(h/2);
		System.out.print(h%2);
	}
}

```



5.38 `DToO.java`

```java
package GitHubAssignment2;

import java.util.Scanner;

public class DToO {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number:");
		int h=input.nextInt();
		htob(h);

	}
	public static void htob(int h) {
		if(h>=8)
		   htob(h/8);
		System.out.print(h%8);
	}
}

```



5.45 `AverageAndDeviation.java`

```java
package GitHubAssignment2;
import java.util.Scanner;

public class AverageAndDeviation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter ten number:");
		double n,sum=0,ans=0;
		int i;
		for(i=1;i<=10;i++) {
			n=input.nextDouble();
			sum+=n;
			ans+=n*n;
		}
		System.out.println("The mean is "+(double)sum/10);
		System.out.print("The standard deviation is "+Math.sqrt((ans-sum*sum/10)/9));

	}
}

```







## GitHub Assignment3

7.3 `CountNumbers.java`

```java
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

```



7.34 `SortString.java`

```java
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

```





## GitHub Assignment4

9-1 `TestCircle.java`

```java
package GitHubAssignment4;

public class TestCircle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle();
		System.out.println("The area of the circle of radius "+circle1.radius+" is "+circle1.getArea());
		Circle circle2=new Circle(25);
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
		Circle circle3=new Circle(125);
		System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getArea());
		circle2.radius=100;
		System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
	}
}

class Circle {

	double radius;
	Circle(){
		radius=1;
	}
	Circle(double newRadius){
		radius = newRadius;
	}
	double getArea(){
		return radius*radius*Math.PI;
	}
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	void setRadius(double newRadius) {
		radius = newRadius;
	}
}

```



9-2 `Circle.java`

```java
package GitHubAssignment4;

public class Circle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1=new Circle(); 
		System.out.println("the area of the circle of radius "+circle1.radius+" is "+circle1.getArea()); 
		Circle circle2=new Circle(25); 
		System.out.println("the area of the circle of radius "+circle2.radius+" is "+circle2.getArea()); 
		Circle circle3=new Circle(125); 
		System.out.println("the area of the circle of radius "+circle3.radius+" is "+circle3.getArea()); 
		circle2.radius=100; 
		System.out.println("the area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
	}
}

```



9-3 `TV.java`

```java
package GitHubAssignment4;

public class TV {
	int channel=1; 
	int volumeLevel=1; 
	boolean on=false; 
	public TV() 
	{ 
		on=true; 
	}
	public void turnOn() 
	{ 
		on=true; 
	}
	public void turnOff() 
	{ 
		on=false;
	}
	public void setChannel(int newChannel) 
	{ 
		if(on && newChannel >=1 && newChannel<=120) 
			channel=newChannel; 
	}
	public void setVolume(int newVolumelevel) 
	{ 
		if(on && newVolumelevel>=1&& newVolumelevel<=7) 
			volumeLevel=newVolumelevel; 
	}
	public void channelUp() 
	{ 
		if(on && channel<120) 
			channel++; 
	}
	public void channelDown() 
	{ 
		if(on && channel<120) 
			channel++; 
	}
	public void volumeUp() 
	{ 
		if(on && volumeLevel<7) 
			volumeLevel++; 
	}
	public void volumeDown() 
	{ 
		if(on && volumeLevel>1) 
			volumeLevel--; 
	}
}

```



9-4 `TestTV.java`

```java
package GitHubAssignment4;

public class TestTV {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1=new TV(); 
		tv1.turnOn(); 
		tv1.setChannel(30); 
		tv1.setVolume(3); 
		TV tv2=new TV(); 
		tv2.turnOn(); 
		tv2.channelUp(); 
		tv2.channelUp(); 
		tv2.volumeUp(); 
		System.out.println("tvl's channel is "+tv1.channel+"and volume level is "+tv1.volumeLevel); 
		System.out.println("tv2's channel is "+tv2.channel+"and volume level is "+tv2.volumeLevel);
	}
}

```



9-5 `TestPoint2D.java`

```java
package GitHubAssignment4;
import java.util.Scanner;
import javafx.geometry.Point2D;

public class TestPoint2D {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter point1's x-,y-coordinates: "); 
		double x1=input.nextDouble(); 
		double y1=input.nextDouble(); 
		System.out.print("Enter point2's x-,y-coordinates: "); 
		double x2=input.nextDouble(); 
		double y2=input.nextDouble(); 
		Point2D p1=new Point2D(x1,y1); 
		Point2D p2=new Point2D(x2,y2); 
		System.out.println("p1 is "+p1.toString()); 
		System.out.println("p2 is "+p2.toString());
		System.out.println("The distance between p1 and p2 is"+p1.Dist(p2)); 
		System.out.println("The distance between p1 and p2 is"+p1.mid(p2).toString());
		input.close();
	}

```



9-6 `Circle2.java`

```java
package GitHubAssignment4;

public class Circle2 {

	double radius;
	Circle(){
		radius=1;
	}
	Circle(double newRadius){
		radius = newRadius;
	}
	double getArea(){
		return radius*radius*Math.PI;
	}
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	void setRadius(double newRadius) {
		radius = newRadius;
	}
}

```



9-7 `TestCircleWithStaticMembers.java`

```java
package GitHubAssignment4;

public class TestCircleWithStaticMembers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("numberOfObjects is "+Circle_1.numberOfObjects); 
		Circle_1 c1=new Circle_1();
		System.out.println("c1 r is"+c1.r+" numberOfObjects is "+c1.numberOfObjects); 
		Circle_1 c2=new Circle_1(5); 
		c1.r=9; 
		System.out.println("c1 r is"+c1.r+" numberOfObjects is "+c1.numberOfObjects); 
		System.out.println("c2 r is"+c2.r+" numberOfObjects is "+c2.numberOfObjects);
	}
}

```



9-8 `Circle3.java`

```java
package GitHubAssignment4;

public class Circle3 {
	private double radius;
	private static int numberOfObjects=0; 
	public Circle3()
	{
		numberOfObjects++; 
	}
	public Circle3(double newRadius)
	{ 
		radius=newRadius;
		numberOfObjects++; 
	}
	public double getRadius()
	{ 
		return radius;
	}
	public void setRadius(double newRadius) 
	{ 
		radius=(newRadius>=0)?newRadius:0; 
	}
	public static int getNumberOfObjects() 
	{ 
		return numberOfObjects;
	}
	public double getArea() 
	{
		return radius*radius*Math.PI; 
	}

}

```



9-9 `TestCircleWithPrivateDataDields.java`

```java
package GitHubAssignment4;

public class TestCircleWithPrivateDataDields {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle3 myCircle=new Circle3(5.0); 
		System.out.println("The area of the circle of radius " +myCircle.getRadius()+" is "+myCircle.getArea()); 
		myCircle.setRadius(myCircle.getRadius()*1.1); 
		System.out.println("The area of the circle of radius " +myCircle.getRadius()+" is "+myCircle.getArea());
	}
}

```



9-10 `TestPassObject.java`

```java
package GitHubAssignment4;

public class TestPassObject {
	public static void main(String[] args) 
	{ 
		Circle3 myCircle=new Circle3(1); 
		int n=5;
		System.out.println("\n"+"Radius is "+myCircle.getRadius()); 
		System.out.println("n is "+n); }
	public static void printAreas( Circle3 c,int times)
	{ 
		System.out.println("Radius \t\tArea");
		while(times>=1) 
		{
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			times--; 
		}
	}
}

```





## GitHub Assignment5

9.3 `UseDataClass.java`

```java
package GitHubAssignment5;
import java.util.Date;

public class UseDataClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		for(long i=10000;i<=1e10;i*=10)
		{
			date.setTime(i);
			System.out.println(date.toString());
		}
	}
}

```



9.4 `UseRandomClass.java`

```java
package GitHubAssignment5;

public class UseRandomClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Random random=new java.util.Random(1000);
		for(int i=0;i<50;i++) 
		{
			System.out.print(random.nextInt(100)+" ");
		}
		System.out.print("\n");
	}
}

```



9.5 `UseGregorianCalendarClass.java`

```java
package GitHubAssignment5;
import java.util.GregorianCalendar;

public class UseGregorianCalendarClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar date=new GregorianCalendar();
		System.out.println(date.get(GregorianCalendar.YEAR)+"."+date.get(GregorianCalendar.MONTH)+"."+date.get(GregorianCalendar.DAY_OF_MONTH));
		date.setTimeInMillis(1234567898765L);
		System.out.println(date.get(GregorianCalendar.YEAR)+"."+date.get(GregorianCalendar.MONTH)+"."+date.get(GregorianCalendar.DAY_OF_MONTH));
	}
}

```



9.6 `Timer.java`

```java
package GitHubAssignment5;
import java.util.Arrays;
import java.util.Random;
public class Timer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100000];
        Random rd = new Random();
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = rd.nextInt(100000);
        }
        StopWatch sw = new StopWatch();
        Arrays.sort(arr);
        sw.stop();
        System.out.println(sw.getElaspsedTime() + "ms");
	}
}
class StopWatch {
	private long startTime;
	private long endTime;
	StopWatch(){
		startTime=System.currentTimeMillis();
	}
	public void start() {
		startTime=System.currentTimeMillis();
	}
	public void stop() {
		endTime=System.currentTimeMillis();
	}
	public long getElaspsedTime() {
		return endTime-startTime;
	}
}

```



9.10 `Equation.java`

```java
package GitHubAssignment5;
import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a,b,c:");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		QuadraticEquation x=new QuadraticEquation(a,b,c);
		if(1==x.getDiscriminant()) 
		{
			System.out.println("the root1 is "+ x.getRoot1());
	        System.out.println("the root2 is "+ x.getRoot2());
		}
		else if(0==x.getDiscriminant()) 
		{
			System.out.println("the root1 is "+ x.getRoot1());
		}
		else
            System.out.println("the equation has no roots");
		input.close();
	}

}

class QuadraticEquation
{
	private int a,b,c;
	public QuadraticEquation(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public int getDiscriminant() {
		if(b*b-4*a*c>0)return 1;
		else if(b*b-4*a*c==0)return 0;
		else return -1;
	}
	public double getRoot1(){
	       return (-b+Math.sqrt(b*b-4*a*c))/(2*a);
	   }
   public double getRoot2(){
      return (-b-Math.sqrt(b*b-4*a*c))/(2*a); 
   }
}

```



9.11 `LinearEquation.java`

```java
package GitHubAssignment5;

public class LinearEquation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearEquationn expr1 = new LinearEquationn(9.0,4.0,3.0,-5.0,-6.0,-21.0);
        LinearEquationn expr2 = new LinearEquationn(1.0,2.0,2.0,4.0,4.0,5.0);

        if(expr1.isSolvable())
        {
            System.out.println("x:" + expr1.getX() + "  " + "y:" + expr1.getY());
        }
        else
            System.out.println("The equation has no solution");

        if(expr2.isSolvable())
        {
            System.out.println("x:" + expr2.getX() + "  " + "y:" + expr2.getY());
        }
        else
            System.out.println("The equation has no solution");
	}
}


class LinearEquationn 
{
    private double a, b, c, d, e, f;

    public LinearEquationn(double v1, double v2, double v3, double v4, double v5, double v6) 
    {
        a = v1;
        b = v2;
        c = v3;
        d = v4;
        e = v5;
        f = v6;
    }

    public double getA() 
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public double getC()
    {
        return c;
    }

    public double getD() 
    {
        return d;
    }

    public double getE() 
    {
        return e;
    }

    public double getF()
    {
        return f;
    }

    public boolean isSolvable() 
    {
        if ((a * d - b * c) != 0)
            return true;
        else
            return false;
    }

    public double getX() 
    {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() 
    {
        return (a * f - e * c) / (a * d - b * c);
    }
}
```





## GitHub Assignment6

11-1 `GeometricObject.java`

```java
package GitHubAssignment6;

public class GeometricObject {
	private String color="white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject(){
		dateCreated = new java.util.Date();
	}
	public GeometricObject(String color,boolean filled) {
		dateCreated=new java.util.Date();
		this.color=color;
		this.filled=filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled=filled;
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	public String toString() {
		return "created on "+dateCreated+"\ncolor: "+color+" and filled: "+filled;
	}
}


```



11-2 `Circle.java`

```java
package GitHubAssignment6;

public class Circle extends GeometricObject{
	private double radius;
	public Circle(){
		
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled) {
		this.radius=radius;
		setColor(color);
		setFilled(filled);
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getDiameter() {
		return 2*radius;
	}
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	public void printCircle() {
		System.out.println("the circle is created "+getDateCreated()+" and the radius is "+radius);
	}
}

```



11-3 `Rectangle.java`

```java
package GitHubAssignment6;

public class Rectangle extends GeometricObject{
	private double width;
	private double height;
	public Rectangle() {
		
	}
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	public Rectangle(double width,double height,String color,boolean filled) {
		this.width=width;
		this.height=height;
		setColor(color);
		setFilled(filled);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width+height);
	}
}

```



11-4 `TestCircleRectangle.java`

```java
package GitHubAssignment6;

public class TestCircleRectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle(1);
		System.out.println("A circle "+circle.toString());
		System.out.println("The color is "+circle.getColor());
		System.out.println("The radius is "+circle.getRadius());
		System.out.println("The area is "+circle.getArea());
		System.out.println("The diameter is "+circle.getDiameter());
		Rectangle rectangle=new Rectangle(2,4);
		System.out.println("\nA rectangle "+rectangle.toString());
		System.out.println("Thr area is"+rectangle.getArea());
		System.out.println("The perimeter is "+rectangle.getPerimeter());
	}
}

```



11-5 `PolymorphismDemo.java`

```java
package GitHubAssignment6;

public class PolymorphismDemo {
	public static void main(String[] args) {
		displayObject(new Circle(1,"red",false));
		displayObject(new Rectangle(1,1,"black",true));
	}
	public static void displayObject(GeometricObject object) {
		System.out.println("Created on "+object.getDateCreated()+" Color is "+object.getColor());
	}
}

```



11-6 `DynamicBindingDemo.java`

```java
package GitHubAssignment6;


public class DynamicBindingDemo {
	public static void main(String[] args) {
		m(new GraduateStudent());
		m(new Student());
		m(new Person());
		m(new Object());
	}
	public static void m(Object x) {
		System.out.println(x.toString());
	}
}
class GraduateStudent extends Student{
	
}
class Student extends Person{
	@Override
	public String toString() {
		return "Student";
	}
}
class Person extends Object{
	@Override
	public String toString() {
		return "Person";
	}
}

```



11-7 `CastingDemo.java`

```java
package GitHubAssignment6;

public class CastingDemo {
	public static void main(String[] args) {
		Object object1=new Circle(1);
		Object object2=new Rectangle(1,1);
		displayObject(object1);
		displayObject(object2);
	}
	public static void displayObject(Object object) {
		if(object instanceof Circle) 
		{
			System.out.println("The circle area is "+((Circle)object).getArea());
			System.out.println("The circle diameter is "+((Circle)object).getDiameter());	
		}
		else if(object instanceof Rectangle) 
		{
			System.out.println("The rectangle area is "+((Rectangle)object).getArea());
		}
	}
}

```



11-8 `TestArrayList.java`

```java
package GitHubAssignment6;
import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String> cityList=new ArrayList<>();
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		System.out.println("List size? "+cityList.size());
		System.out.println("Is Miami in the list?"+cityList.contains("Miami"));
		System.out.println("The location of Denver in the list?"+cityList.indexOf("Denver"));
		System.out.println("Is the list empty?"+cityList.isEmpty());
		cityList.add(2,"Xian");
		cityList.remove("Miami");
		cityList.remove(1);
		System.out.println(cityList.toString());
		for(int i=cityList.size()-1;i>=0;i--) {
			System.out.print(cityList.get(i)+" ");
		}
		System.out.println();
		ArrayList<Circle> list=new ArrayList<>();
		list.add(new Circle(2));
		list.add(new Circle(3));
		System.out.println("The area of the circle?"+list.get(0).getArea());
	}
}

```



11-9 `DistinctNumbers.java`

```java
package GitHubAssignment6;
import java.util.ArrayList;
import java.util.Scanner;
public class DistinctNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>list=new ArrayList<>();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter intgers (input ends with 0): ");
		int value;
		do 
		{
			value=input.nextInt();
			if(!list.contains(value)&&value!=0)
				list.add(value);
		}while(value!=0);
		for(int i=0;i<list.size();i++)System.out.print(list.get(i)+" ");
		input.close();
	}
}

```



11-10 `MyStack.java`

```java
package GitHubAssignment6;
import java.util.ArrayList;

public class MyStack {

	private ArrayList<Object> list=new ArrayList<>(); 
	public boolean isEmpty() 
	{ 
		return list.isEmpty(); 
	}
	public int getSize() 
	{ 
		return list.size(); 
	}
	public Object peek() 
	{ 
		return list.get(getSize()-1);
	}
	public Object pop() 
	{
		Object o=list.get(getSize()-1);
		list.remove(getSize()-1); 
		return o; 
	}
	public void push(Object o) 
	{ 
		list.add(o); 
	}
	@Override 
	public String toString()
	{ 
		return "Stack: "+list.toString();
	}
}

```





## GitHub Assignment7

11.8 `NewAccountClass.java`

```java
package GitHubAssignment7;

import java.util.ArrayList;
import java.util.Date;
public class NewAccountClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account1.setAnnualInterestRate(5.5);
		Account1 account=new Account1("George",1122,1000);
		account.deposit(30);
		account.deposit(50);
		account.deposit(50);
		account.deposit(5);
		account.deposit(4);
		account.deposit(2);
		System.out.println("账户姓名："+account.getName());
		System.out.println("年利率："+Account1.getAnnualInterestRate());
		System.out.println("余额："+account.getBalance());
		java.util.ArrayList<Transaction> list=account.getTransactions();
		System.out.printf("%-30s%-14s%-14s%-15s\n","交易时间", "交易类型", "交易金额", "账户余额");
		for(int i=0;i<list.size();i++) {
			Transaction transaction = (Transaction) (list.get(i));
			System.out.printf("%-35s%-14s%-16s%-15s\n",transaction.getDate(),transaction.getType(),
					transaction.getAmount(), transaction.getBalance());
		}
	}
	
}
class Transaction{
	private java.util.Date date;
	private String type;
	private double amount;
	private double balance;
	private String description;
	public Transaction(String type, double amount, double balance, String description) {
		date=new java.util.Date();
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
	}
	public java.util.Date getDate(){
		return date;
	}
	public String getType() {
		return type;
	}
	public double getAmount() {
		return amount;
	}
	public double getBalance() {
		return balance;
	}
	public String getDescription() {
		return description;
	}
}
class Account1{
	private int id;
	private String name;
	private double balance;
	private static double annualInterestRate;
	private java.util.Date dateCreated;
	private java.util.ArrayList<Transaction> transactions = new java.util.ArrayList<>();
	public Account1() {
		dateCreated = new java.util.Date();
	}
	public Account1(String name, int id, double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
		dateCreated=new java.util.Date();
	}
	public int getId() {
		return this.id;
	}
	public double getBalance() {
		return balance;
	}
	public java.util.ArrayList<Transaction> getTransactions(){
		return transactions;
	}
	public String getName() {
		return name;
	}
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public static void setAnnualInterestRate(double annualInterestRate) {
		Account1.annualInterestRate=annualInterestRate;
	}
	public double getMonthlyInterest() {
		return balance*(annualInterestRate/1200);
	}
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	public void withdraw(double amount) {
		balance-=amount;
		transactions.add(new Transaction("取款",amount,balance,""));
	}
	public void deposit(double amount) {
		balance+=amount;
		transactions.add(new Transaction("存款",amount,balance,""));
	}
}


```



11.16 `Add.java`

```java
package GitHubAssignment7;
import java.util.ArrayList;
import java.util.Scanner;
public class Add {
	public static void main(String[] args) {
		long a=(int)(Math.random()*10);
		long b=(int)(Math.random()*10);
		Scanner input=new Scanner(System.in);
		ArrayList<Long> se=new ArrayList<>();
		System.out.println("What is "+a+" + "+b+" ?");
		long ans=input.nextInt();
		while(a+b!=ans) {
			boolean flag=true;
			for(int i=0;i<se.size();i++) {
				if(ans==se.get(i)) {
					flag=false;
					break;
				}
			}
			if(flag) {
				se.add(ans);
				System.out.println("Wrong answer. Try again. What is "+a+" + "+b+" ? "+ans);
			}else {
				System.out.println("You already entered"+ans);
			}
			ans=input.nextInt();
		}
		System.out.println("You got it!");
	}
}

```



11.17 `PerfectSquareTrinomial.java`

```java
package GitHubAssignment7;
import java.util.Scanner;
import java.util.ArrayList;

public class PerfectSquareTrinomial {
	public static void main(String[] args) {
		long a=(int)(Math.random()*10);
		long b=(int)(Math.random()*10);
		Scanner input=new Scanner(System.in);
		ArrayList<Long> se=new ArrayList<>();
		System.out.println("What is "+a+" + "+b+" ?");
		long ans=input.nextInt();
		while(a+b!=ans) {
			boolean flag=true;
			for(int i=0;i<se.size();i++) {
				if(ans==se.get(i)) {
					flag=false;
					break;
				}
			}
			if(flag) {
				se.add(ans);
				System.out.println("Wrong answer. Try again. What is "+a+" + "+b+" ? "+ans);
			}else {
				System.out.println("You already entered"+ans);
			}
			ans=input.nextInt();
		}
		System.out.println("You got it!");
	}
}

```



11.19 `Encase.java`

```java
package GitHubAssignment7;
import java.util.Scanner;

public class Encase {
	static int []a=new int[100];
	static int []vis=new int[100];
	static int ans=0;
	static int []Ans=new int[100];
	static int []k=new int[100];
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=1;i<=n;i++)a[i]=input.nextInt();
		ans=n;
		dfs(1,n,1);
		System.out.println(ans);
		for(int i=1;i<=ans;i++) {
			System.out.print("Container "+i+" contains with");
			for(int j=1;j<=n;j++) {
				if(Ans[j]==i)System.out.print(" "+a[j]);
			}
			System.out.println();
		}
	}
	public static void dfs(int now, int n,int sum) {
		if(sum>=ans)return;
		if(now>n) {
			if(sum<ans) {
				ans=sum;
				for(int i=1;i<=n;i++) {
					Ans[i]=vis[i];
				}
			}
			return;
		}
		for(int i=1;i<=sum;i++) {
			if(k[i]+a[now]<=10) {
				vis[now]=i;
				k[i]+=a[now];
				dfs(now+1,n,sum);
				vis[now]=0;
				k[i]-=a[now];
			}
		}
		vis[now]=sum+1;
		k[sum+1]=a[now];
		dfs(now+1,n,sum+1);
	}
}

```





## GitHub Assignment8

`Book.java`

```java
package GitHubAssignment8;

public class Book {
	private String name;
	private double price;
	private String press;
	public Book(String name,double price,String press) {
		this.name=name;
		this.price=price;
		this.press=press;
	}
	public String To_String() {
		return "and the name of the book is:"+name+" and the press of the book is:"+press+" and the price of the book is:"+price;
	}
}
```



`NewBook.java`

```java
package GitHubAssignment8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NewBook {
	static Map<String,Book>mp=new HashMap<String,Book>();
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String s,name,press;
		double price;
		for(int i=0;i<n;i++) {
			System.out.println("书籍编号:");
			s=input.next();
			System.out.println("书籍名称:");
			name=input.next();
			System.out.println("书籍出版社:");
			press=input.next();
			System.out.println("书籍价格:");
			price=input.nextDouble();
			mp.put(s, new Book(name,price,press));
		}
		for(String key:mp.keySet()) {
			System.out.println("The id of the book is "+key+" "+mp.get(key).To_String());
		}
	}
}
```



`NewStudent.java`

```java
package GitHubAssignment8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class NewStudent {
	static Set<Student>st=new TreeSet<Student>();
	public static void main(String[] args)throws java.io.IOException {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		String id,name;
		int age;
		for(int i=0;i<n;i++) {
			System.out.println("学号:");
			id=input.next();
			System.out.println("姓名:");
			name=input.next();
			System.out.println("年龄:");
			age=input.nextInt();
			st.add(new Student(id,name,age));
		}
		for(Student key:st) {
			System.out.println(key.To_String());
		}
		write();
	}
	public static void write()throws java.io.IOException {
		java.io.File file=new java.io.File("studentinfo.txt");
		java.io.PrintWriter output=new java.io.PrintWriter(file);
		output.println(st.size());
		for(Student key:st) {
			output.println(key.To_String());
		}
		output.close();
	}
}
```



`Student.java`

```java
package GitHubAssignment8;

public class Student implements Comparable<Student> {
	private String id;
	private String name;
	private int age;
	public Student(String id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public int compareTo(Student r) {
		int flag=0;
		if(age>r.getAge())flag = 1;
		else if(age==r.getAge())flag = 0;
		else if(age<r.getAge())flag = -1;
		return flag;
	}
	public String To_String() {
		return "The name of the student is "+name+" and his/her age is "+age+" and his/her student id is "+id;
	}
}
```

