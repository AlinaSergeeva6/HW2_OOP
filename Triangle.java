package com.gmail.ps.allllll;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
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

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public double Perimetr() {
		return Point.lengthOfSegment(a, b) + Point.lengthOfSegment(b, c) + Point.lengthOfSegment(a, c);
	}

	public double Area() {
		double p = Perimetr() / 2.0;
		return Math.sqrt(p * (p - Point.lengthOfSegment(a, b)) * (p - Point.lengthOfSegment(b, c))
				* (Point.lengthOfSegment(a, c)));

	}

}
