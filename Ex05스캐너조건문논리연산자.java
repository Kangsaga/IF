package 조건문;

import java.util.Scanner;

public class Ex05스캐너조건문논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if (age <10) {
			System.out.println("10살 미만입니다.");
		}
		else if (age >=10 && age <20) {
			System.out.println("10대 입니다.");
		}
		else if (age >=20 && age <30) {
			System.out.println("20대 입니다.");
		}
		else if (age >=30 && age < 40) {
			System.out.println("30대 입니다.");
		}
		else {
			System.out.println("40살 이상입니다.");
		}
		
		
		
	}

}
