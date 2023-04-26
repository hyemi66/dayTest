package test;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {
	int n1, n2;
	public void inPut() {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수 입력 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
	}
	public int funC() {
		int num;
		if (n1>n2) { return num = n1; }
		else { return num = n2; }
	}
	public void print(int num) {
		System.out.println("제일 큰 수 : " + num);
	}
	
	public ArrayList<String> test() {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("hello");
		return arr;
	}
}