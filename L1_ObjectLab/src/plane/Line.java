package plane;

public class Line{
	private Point p1;
	private Point p2;


	public Line() {
		this(0, 0, 1, 1);
	}

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Line(int x1, int y1, int x2, int y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}


// mutators
	
	public void setEndPoints(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public void translate(int dx, int dy) {
		p1.translate(dx, dy); // x1 = x1 + dx
		p2.translate(dx, dy);
	}


// accessors
	
	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	public boolean isCollinear(Point p) {
		double slope1 = (double)(p1.getY() - p.getY() / p1.getX() - p.getX());
		double slope2 = (double)(p2.getY() - p.getY() / p2.getX() - p.getX());
		return Math.abs(slope2 - slope1) < 0.0001;
//return slope1 == slope2;

	}

	public double magnitude() {
		return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
	}

	public double slope() {
		double dx = p2.getX() - p1.getX();
		double dy = p2.getY() - p1.getY();
		if (dx ==0) {
			throw new IllegalArgumentException("undefined, dx = " + dx);
		}

		return dy/dx;
	}

	public String toString() {
		return "[" + "(" + p1.getX() + ", " + p1.getY() + ")" + "," + "(" + p2.getX() + ", " + p2.getY() + ")" + "]";
	}
}