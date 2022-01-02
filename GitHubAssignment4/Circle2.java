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
