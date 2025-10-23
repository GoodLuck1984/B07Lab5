import java.awt.Point;

public class Quadrilateral {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Quadrilateral(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	// Calculate the perimeter
	public double perimeter() {
		double sum = A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
		return sum;
	}
	
	// Check if the quadrangle is a square.
	public boolean isSquare() {
		boolean isSquare = true;
		double AB = A.distance(B);
		double BC = B.distance(C);
		double CD = C.distance(D);
		double DA = D.distance(A);
		
		isSquare = Math.abs(AB - BC) < 1e-9 &&
                Math.abs(BC - CD) < 1e-9 &&
                Math.abs(CD - DA) < 1e-9;
		
		Point AB = new Point(B.x - A.x, B.y - A.y);
		Point BC = new Point(C.x - B.x, C.y - B.y);
		Point CD = new Point(D.x - C.x, D.y - C.y);
		Point DA = new Point(A.x - D.x, A.y - D.y);
		
		isSquare = Math.abs(AB.x * BC.x + AB.y * BC.y) < 1e-9 &&
			    Math.abs(BC.x * CD.x + BC.y * CD.y) < 1e-9 &&
			    Math.abs(CD.x * DA.x + CD.y * DA.y) < 1e-9 &&
			    Math.abs(DA.x * AB.x + DA.y * AB.y) < 1e-9;
		
		return isSquare;
	}
	
	// Calculate the area 
	public double area() {
		double area = Math.abs((A.x * B.y + B.x * C.y + C.x * D.y + D.x * A.y)
				- (A.y * B.x + B.y * C.x + C.y * D.x + D.y * A.x))/2;
				
		return area;
	}

}
