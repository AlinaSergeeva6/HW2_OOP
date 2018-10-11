package com.gmail.ps.allllll;

public class Circle extends Shape {
	private Point a;
	private Point b;
	public Circle(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Circle() {
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
	@Override
	public String toString() {
		return "Circle [a=" + a + ", b=" + b + "]";
	}
	public double Perimetr() {
		return 2*Math.PI*Point.lengthOfSegment(a, b);
	}
	public double Area() {
		return 2*Math.PI*Math.pow(Point.lengthOfSegment(a, b),2);
	}
	}