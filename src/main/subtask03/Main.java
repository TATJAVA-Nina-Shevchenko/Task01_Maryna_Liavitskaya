package main.subtask03;

import util.DigitUtil;

public class Main {

	public static void main(String[] args) {
		try {
			if (DigitUtil.checkLength(args, 2) && DigitUtil.isDigit(args[0]) && DigitUtil.isDigit(args[1])
					&& DigitUtil.isPositive(args[0]) && DigitUtil.isPositive(args[1]) && DigitUtil.isNotZero(args[0])
					&& DigitUtil.isNotZero(args[1]) && DigitUtil.isNotZeroSequence(args[0])
					&& DigitUtil.isNotZeroSequence(args[1])) {

				Triangle triangle = new Triangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]));

				System.out.println("Area of a triangle : " + triangle.calculateArea());

				System.out.println("Triangle perimeter with cathetus " + triangle.catheusA + " & " + triangle.catheusB
						+ " & hypotenuse " + triangle.calculateHypotenuse() + " is : " + triangle.calculatePerimeter());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
