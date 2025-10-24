package Lab4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab5_JUnitTests {

	@Test
	void test1() {
		//Tests constructor of Class Quadrilateral
		Point a = new Point(0,0);
		Point b = new Point(1,0);
		Point c = new Point(1,1);
		Point d = new Point(0,1);
		
		Quadrilateral e = new Quadrilateral(a,b,c,d);
		Point j = new Point(0,0);
		assertEquals(e.A, j);	
	}
	@Test
	void test2() {
		//Tests constructor of Class Quadrilateral
		Point a = new Point(0,0);
		Point b = new Point(1,0);
		Point c = new Point(1,1);
		Point d = new Point(0,1);
		
		Quadrilateral e = new Quadrilateral(a,b,c,d);
		Point j = new Point(1,0);
		assertEquals(e.B, j);	
	}
	@Test
	void test3() {
		//Tests constructor of Class Quadrilateral
		Point a = new Point(0,0);
		Point b = new Point(1,0);
		Point c = new Point(1,1);
		Point d = new Point(0,1);
		
		Quadrilateral e = new Quadrilateral(a,b,c,d);
		Point j = new Point(1,1);
		assertEquals(e.C, j);	
	}
	@Test
	void test4() {
		//Tests constructor of Class Quadrilateral
		Point a = new Point(0,0);
		Point b = new Point(1,0);
		Point c = new Point(1,1);
		Point d = new Point(0,1);
		
		Quadrilateral e = new Quadrilateral(a,b,c,d);
		Point j = new Point(0,1);
		assertEquals(e.D, j);	
	}
	@Test
	void test5() {
		//Tests perimeter method of class Quadrilateral
		Point a = new Point(0,0);
		Point b = new Point(1,0);
		Point c = new Point(1,1);
		Point d = new Point(0,1);
		
		Quadrilateral e = new Quadrilateral(a,b,c,d);
		double p = e.perimeter();
		assertEquals(p,4);
		
	}
	
	@Test
	void test6() {
		//Tests isSquare method of class Quadrilateral
		Point a = new Point(0,0);
		Point b = new Point(1,0);
		Point c = new Point(1,1);
		Point d = new Point(0,1);
		
		Quadrilateral e = new Quadrilateral(a,b,c,d);
		boolean p = e.isSquare();
		assertTrue(p);
		
	}
	@Test
	void test7() {
		//Tests isSquare method of class Quadrilateral
		Point a = new Point(0,0);
		Point b = new Point(1,0);
		Point c = new Point(1,3);
		Point d = new Point(0,1);
		
		Quadrilateral e = new Quadrilateral(a,b,c,d);
		boolean p = e.isSquare();
		assertFalse(p);
		
	}
	@Test
	void test8() {
		//Tests area method of class Quadrilateral
		Point a = new Point(0,0);
		Point b = new Point(1,0);
		Point c = new Point(1,1);
		Point d = new Point(0,1);
		
		Quadrilateral e = new Quadrilateral(a,b,c,d);
		double p = e.area();
		assertEquals(p,1.0);
		
	}
	

}
