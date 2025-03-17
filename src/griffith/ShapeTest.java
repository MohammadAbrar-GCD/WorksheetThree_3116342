package griffith;

import static org.junit.jupiter.api.Assertions.*;

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
	   
}
