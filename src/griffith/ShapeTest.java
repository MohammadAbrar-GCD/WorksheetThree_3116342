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
	 
	 

}
