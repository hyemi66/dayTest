package team;

import java.util.Scanner;

class Triangle {
	private int line, high;
	public void setLine(int line) { this.line = line; }
	public int getLine() { return line; }
	public void setHigh(int high) { this.high = high; }
	public int getHigh() { return high; }
	
	public int valueTri() {
		int value;
		value = (line * high) / 2;
		return value;
	}
}

class OP01_TestClass01 {
	int n1, n2;
	public void setN1(int n1) { this.n1 = n1; }
	public int getN1() { return n1; }
	public void setN2(int n2) { this.n2 = n2; }
	public int getN2() { return n2; }
	public void sumFunc() {
		int sum = n1 + n2;
		System.out.println("합은 " + sum + "입니다");
	}
}

public class Team02 {
	public static void main(String[] args) {
		// 문제01
		Triangle tri = new Triangle();
		Scanner sc = new Scanner(System.in);
		int line, high;
		System.out.print("삼각형의 밑변 : ");
		line = sc.nextInt();
		System.out.print("삼각형의 높이 : ");
		high = sc.nextInt();
		tri.setLine(line);
		tri.setHigh(high);
		System.out.println("삼각형의 밑변 : " + line + "cm");
		System.out.println("삼각형의 높이 : " + high + "cm");
		System.out.println("삼각형의 넓이 : " + tri.valueTri() + "cm");
		
		// 문제02
		OP01_TestClass01 test = new OP01_TestClass01();
		
	}
}
