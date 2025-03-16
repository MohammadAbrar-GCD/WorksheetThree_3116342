package griffith;

public abstract class Shape {
	
	private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract method to calculate the area of the shape
    public abstract double area();

    // Abstract method to calculate the perimeter of the shape
    public abstract double perimeter();

    // Overridden toString method to print the name of the shape
    @Override
    public String toString() {
        return "Shape: " + name;
        
    }

}
