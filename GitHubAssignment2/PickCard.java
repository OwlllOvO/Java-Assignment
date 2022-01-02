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
