package main.subtask03;

public class Triangle {

	double catheusA;
	double catheusB;
	double hipothenuse ;

	public Triangle(double catheusA, double catheusB) {
		this.catheusA = catheusA;
		this.catheusB = catheusB;		
	}

	public double calculateHypotenuse() {
		this.hipothenuse = Math.sqrt(catheusA * catheusA + catheusB * catheusB);
		return this.hipothenuse;
	}
	
	public double calculateArea() {
		return (catheusA * catheusB) / 2;
	}

	public double calculatePerimeter() {
		return (catheusA + catheusB + hipothenuse);
	}
}
