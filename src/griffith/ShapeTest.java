package griffith;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ShapeTest {

	 @Test
	    public void testCircle() {
		 Circle circle = new Circle("Circle", 5.0);
	        
	        assertEquals(100.0, circle.area(), 0.0001);
	 }

}
