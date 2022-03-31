package week1.day2;

public class Calculator {
	private int add(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	private int sub(int num1, int num2) {
		return num1 - num2;
	}
	private double mul(double num1, double num2) {
		return num1 * num2;
	}
	private float div(float num1, float num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		System.out.println(cal.add(5, 10, 70));
		System.out.println(cal.sub(5, 10));
		System.out.println(cal.mul(12, 13));
		System.out.println(cal.div(8F, 10F));

	}

}
