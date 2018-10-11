package com.gmail.ps.allllll;

public class Main {

	public static void main(String[] args) {
		Triangle tr = new Triangle(new Point(0, 2), new Point(3, 1), new Point(4, 0));
		System.out.println(tr);
		System.out.println(tr.Area());
		System.out.println(tr.Perimetr());

		Quadrilateral ou = new Quadrilateral(new Point(0, 5), new Point(10, 0), new Point(0, 5), new Point(10, 0));
		System.out.println(ou);
		System.out.println(ou.Area());
		System.out.println(ou.Perimetr());
		
		Circle ci = new Circle(new Point(0,0), new Point(0,5));
		System.out.println(ci);
		System.out.println(ci.Area());
		System.out.println(ci.Perimetr());

	}

}
