package griffith;

public class Rhombus extends Shape{

	private double diagonal1;
    private double diagonal2;

    
    public Rhombus(String name, double diagonal1, double diagonal2) {
    	super(name); 
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    // Getter methods for diagonals
    public double getDiagonal1() {
        return diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    // Setter methods for diagonals
    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }
    
    // Overriding the area method for Rhombus
    @Override
    public double area() {
        return 0.5 * diagonal1 * diagonal2; // Area of a rhombus 
    }

    // Overriding the perimeter method for Rhombus
    @Override
    public double perimeter() {
        double side = Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2)); // Pythagoras theorem to find side length
        return 4 * side; // Perimeter is 4 * side
    }

    // Overriding toString to include diagonals
    @Override
    public String toString() {
        return super.toString() + ", Diagonal 1: " + diagonal1 + ", Diagonal 2: " + diagonal2;
    }
    
	
}
