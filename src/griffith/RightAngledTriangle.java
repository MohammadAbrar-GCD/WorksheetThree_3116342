package griffith;

public class RightAngledTriangle extends Shape {
	
	 private double base;
	 private double height;
	    
	 
	 public RightAngledTriangle(String name, double base, double height) {
	        super(name); 
	        this.base = base;
	        this.height = height;
	    }
	 //Getter method for base and height
	 public double getBase() {
	        return base;
	    }

	    public double getHeight() {
	        return height;
	    }
	    
	    // Setter methods for base and height
	    public void setBase(double base) {
	        this.base = base;
	    }

	    public void setHeight(double height) {
	        this.height = height;
	    }

	    // Overriding the area method for RightAngledTriangle
	    @Override
	    public double area() {
	        return 0.5 * base * height; // Area of a right-angled triangle formula
	    }

	    // Overriding the perimeter method for RightAngledTriangle
	    @Override
	    public double perimeter() {
	        double hypotenuse = Math.sqrt(base * base + height * height); // Using Pythagoras theorem to find hypotenuse
	        return base + height + hypotenuse; // Perimeter is the sum of the three sides
	    }

	    // Overriding toString to include base and height
	    @Override
	    public String toString() {
	        return super.toString() + ", Base: " + base + ", Height: " + height;
	    }
	    

}
