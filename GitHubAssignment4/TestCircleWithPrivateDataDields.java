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
