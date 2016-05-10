package triangel;

import static org.junit.Assert.*;

import org.junit.Test;

import triangel.triangle;
public class triangleTest {
	private triangle triangle;
	@Test
	public void test() {
		triangle = new triangle();
		assertEquals("It is not a triangel",triangle.triangletype(10,1,2));
		assertEquals("equilateral",triangle.triangletype(5,5,5));
		assertEquals("isosceles",triangle.triangletype(10,10,2));
		assertEquals("scalene",triangle.triangletype(3,4,5));
	}

}