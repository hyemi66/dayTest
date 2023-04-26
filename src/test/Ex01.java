package test;

import java.util.ArrayList;
import java.util.Scanner;

class Exam {
	private String name;
	private int age;
	private double weight, height;
	
	public ArrayList<String> inputName() {
		ArrayList<String> nameList = new ArrayList<>();
		nameList.add(name);
		return nameList;
	}
	public ArrayList<Integer> inputAge() {
		ArrayList<Integer> ageList = new ArrayList<>();
		ageList.add(age);
		return ageList;
	}
	public ArrayList<Double> inputWeight() {
		ArrayList<Double> weightList = new ArrayList<>();
		weightList.add(weight);
		return weightList;
	}
	public ArrayList<Double> inputHeight() {
		ArrayList<Double> heightList = new ArrayList<>();
		heightList.add(height);
		return heightList;
	}
	
	public double bmi(double weight, double height) {
		double valueBmi;
		valueBmi = weight / (height * height) + weight % (height * height);
		return valueBmi;
	}
	
	public String gradeBmi(double valueBmi) {
		String grade;
		if(0<=valueBmi && valueBmi<=18.5) { return grade = "저체중"; }
		else if(18.5<valueBmi && valueBmi<=23) { return grade = "정상"; }
		else if(23<valueBmi && valueBmi<=25) { return grade = "과체중"; }
		else { return grade = "비만"; }
	}
	
	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	public void setAge(int age) { this.age = age; }
	public int getAge() { return age; }
	public void setWeight(double weight) { this.weight = weight; }
	public double getWeight() { return weight; }
	public void setHeight(double height) { this.height = height; }
	public double getHeight() { return height; }
}

public class Ex01 {
	public static void main(String[] args) {
		Exam ex = new Exam();
		Scanner sc = new Scanner(System.in);
		String name;
		int num, age, index;
		double weight, height;
		ArrayList<String> nameList = new ArrayList<>();
		ArrayList<Integer> ageList = new ArrayList<>();
		ArrayList<Double> heightList = new ArrayList<>();
		ArrayList<Double> weightList = new ArrayList<>();
		while(true) {
			System.out.println("1. 회원정보입력");
			System.out.println("2. 회원정보보기");
			System.out.println("3. BMI 측정");
			System.out.println("4. 나가기");
			System.out.print(">>> ");
			num = sc.nextInt();
			if(num==1) {
				System.out.print("이름 : ");
				name = sc.next();
				System.out.print("나이 : ");
				age = sc.nextInt();
				System.out.print("키 : ");
				height = sc.nextDouble();
				System.out.print("몸무게 : ");
				weight = sc.nextDouble();
				ex.setName(name);
				ex.setAge(age);
				ex.setHeight(height);
				ex.setWeight(weight);
				nameList = ex.inputName();
				ageList = ex.inputAge();
				heightList = ex.inputHeight();
				weightList = ex.inputWeight();
				System.out.println("정보입력완료");
				System.out.println("회원정보입력");
			}
			else if(num==2) {
				if(nameList.size()==0) {
					System.out.println("회원정보입력부터 해주세요");
					continue;
				}
				System.out.print("이름 : ");
				name = sc.next();
				boolean bool01 = nameList.contains(name);
				if(!bool01) { System.out.println("정보가 없습니다."); }
				else {
					index = nameList.indexOf(name);
					System.out.println("==== 회원정보 ====");
					System.out.println("이름 : " + nameList.get(index));
					System.out.println("나이 : " + ageList.get(index) + "(살)");
					System.out.printf("키 : %.1f(cm)\n",heightList.get(index));
					System.out.printf("몸무게 : %.1f(kg)\n",weightList.get(index));
					}
				System.out.println("회원정보보기");
			}
			else if(num==3) {
				System.out.print("이름 : ");
				name = sc.next();
				boolean bool02 = nameList.contains(name);
				if(!bool02) { System.out.println("정보가 없습니다"); }
				else {
					index = nameList.indexOf(name);
					height = heightList.get(index)/100;
					weight = weightList.get(index);
					double valueBmi = ex.bmi(weight, height);
					String grade = ex.gradeBmi(valueBmi);
					System.out.println("==== BMI ====");
					System.out.println("이름 : " + name);
					System.out.printf("BMI수치 : %.1f\n",valueBmi);
					System.out.println("BMI결과 : " + grade);
				}
				System.out.println("BMI측정");
			}
			else if(num==4) { System.out.println("종료합니다"); break; }
			else { System.out.println("다시선택"); }
		}
		
	}
}
