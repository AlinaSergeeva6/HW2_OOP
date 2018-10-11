package com.gmail.ps.allllll;

public class Quadrilateral extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Quadrilateral(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Quadrilateral() {
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Quadrilateral [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

	public double Perimetr() {
		return Point.lengthOfSegment(a, b) + Point.lengthOfSegment(b, c) + Point.lengthOfSegment(c, d)
				+ Point.lengthOfSegment(d, a);
	}

	public double Area() {
		return Point.lengthOfSegment(a, b) * Point.lengthOfSegment(b, c);
	}
}
