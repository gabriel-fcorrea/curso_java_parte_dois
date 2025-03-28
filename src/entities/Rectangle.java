package entities;

public class Rectangle {

	public double width;
	public double height;
	public double p;

	public double areaRectangle() {
		return width * height;
	}

	public double perimeterRectangle() {
		return (width * 2) + (height * 2);
	}

	public double diagonalRectangle() {
		p = (Math.pow(width, 2.0)) + (Math.pow(height, 2.0));
		return Math.sqrt(p);
	}

	public String toString() {
		return "Informações do Retângulo: \nLargura: " + width + "\nAltura: " + height;
	}

}
