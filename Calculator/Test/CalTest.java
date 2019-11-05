import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.viva.calc.Calculator;

class CalTest {

	@Test
	public void calTest() {
		assertEquals("error in add()", 4, Calculator.add(2,2));
		assertEquals("error in add()", -3, Calculator.add(-1,-2));
		assertEquals("error in add()", 9, Calculator.add(9,0));
		
	}
	
	public void calTestFail() {
		assertEquals("error in add()", 5, Calculator.add(2,2));
		
	}
	
	public void calTestPass() {
		assertEquals("error in sub()", 0, Calculator.sub(2,2));
		assertEquals("error in sub()", 1, Calculator.sub(-1,-2));
		assertEquals("error in sub()", 9, Calculator.sub(9,0));
		
	}
	
	public void calSubFail() {
		assertEquals("error in add()", 5, Calculator.sub(2,2));
		
	}

}
