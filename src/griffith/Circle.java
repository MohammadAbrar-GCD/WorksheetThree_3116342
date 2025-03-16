package griffith;

public class Circle extends Shape{
	private double radius;
	
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

 // Overriding the abstract method to calculate the area of the circle
    @Override
    public double area() {
        return Math.PI * radius * radius; // Area of a circle is π r^2
    }

    // Overriding the abstract method to calculate the perimeter 
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius; // Perimeter  is 2πr
    }

    // Overriding toString to include radius
    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}
