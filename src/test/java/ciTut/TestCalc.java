package ciTut;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalc {

	@Test
	void test() {
		Calc calc = new Calc();
		int expected = 4;
		int actual = calc.add(2, 2);
		assertEquals(expected, actual);
	}

}
