package griffith;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ShapeTest {

	 @Test
	    public void testCircle() {
		 Circle circle = new Circle("Circle", 5.0);
	        
		 
		 assertEquals(78.53981633974483, circle.area(), 0.0001);
		 
		 assertEquals(31.41592653589793, circle.perimeter(), 0.0001);
		 
		 assertEquals("Shape: Circle, Radius: 5.0", circle.toString()); 
	 }
	 
	 @Test
	 public void testRhombus() {
		    
		    Rhombus rhombus = new Rhombus("Rhombus", 6.0, 8.0);
		    
		    assertEquals(24.0, rhombus.area(), 0.0001); 
		    
		    assertEquals(20.0, rhombus.perimeter(), 0.0001);
		    
		    assertEquals("Shape: Rhombus, Diagonal 1: 6.0, Diagonal 2: 8.0", rhombus.toString());
		    
	 }

	 @Test
	 public void testRightAngledTriangle() {
		    // Create a RightAngledTriangle object with base 3 and height 4
		    RightAngledTriangle triangle = new RightAngledTriangle("Triangle", 3.0, 4.0);
		    
		    assertEquals(6.0, triangle.area(), 0.0001);
		    
		    assertEquals(12.0, triangle.perimeter(), 0.0001);
		    
		    assertEquals("Shape: Triangle, Base: 3.0, Height: 4.0", triangle.toString()); 
		    
		   
	 }
	 
	 @Test
	    public void testShapeIntegration() {
		 
		 //Create an 2 instances of each sub class
		 List<Shape> shapes = new ArrayList<>();
		 
		 shapes.add(new Circle("Circle1", 3.0));
		 shapes.add(new Circle("Circle2", 5.0));
		 
		 shapes.add(new Rhombus("Rhombus1", 6.0, 8.0)); 
		 shapes.add(new Rhombus("Rhombus2", 10.0, 12.0));
		 
		 shapes.add(new RightAngledTriangle("Triangle1", 3.0, 4.0));
		 shapes.add(new RightAngledTriangle("Triangle2", 6.0, 8.0));
		 
		 //Loop checks area and perimeter
		 
		 for (Shape shape : shapes) {
	            if (shape instanceof Circle) {
	                Circle circle = (Circle) shape;
	                double expectedArea = Math.PI * Math.pow(circle.getRadius(), 2);
	                double expectedPerimeter = 2 * Math.PI * circle.getRadius();
	                assertEquals(expectedArea, shape.area(), 0.0001, "Incorrect area for Circle");
	                assertEquals(expectedPerimeter, shape.perimeter(), 0.0001, "Incorrect perimeter for Circle");
	            } else if (shape instanceof Rhombus) {
	                Rhombus rhombus = (Rhombus) shape;
	                double expectedArea = 0.5 * rhombus.getDiagonal1() * rhombus.getDiagonal2();
	                assertEquals(expectedArea, shape.area(), 0.0001, "Incorrect area for Rhombus");
	            } else if (shape instanceof RightAngledTriangle) {
	                RightAngledTriangle triangle = (RightAngledTriangle) shape;
	                double expectedArea = 0.5 * triangle.getBase() * triangle.getHeight();
	                double expectedPerimeter = triangle.getBase() + triangle.getHeight() + 
	                                           Math.sqrt(Math.pow(triangle.getBase(), 2) + Math.pow(triangle.getHeight(), 2));
	                assertEquals(expectedArea, shape.area(), 0.0001, "Incorrect area for Triangle");
	                assertEquals(expectedPerimeter, shape.perimeter(), 0.0001, "Incorrect perimeter for Triangle");
	            }
	        }
		 
		 
		 
		 
		 
	 }
	   
}
