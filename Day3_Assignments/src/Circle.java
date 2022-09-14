

public class Circle {
	int radius;
	double area;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		area = Math.PI * radius * radius;
		return area;
	}

	public static void main(String[] args) {

		Circle c = new Circle(6);
		System.out.println("Area of circle is : " + c.calculateArea());
	}

}