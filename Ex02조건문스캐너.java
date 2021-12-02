package 조건문;

import java.util.Scanner;

public class Ex02조건문스캐너 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if (age >=20) {
			System.out.println("성인입니다.");
		}
		//아니라면 (20보다 작다면)
		//"미성년자 입니다" 가 출력되게끔
		
		else {
			System.out.println("미성년자 입니다.");
		}
		
	}

}
