package 조건문;

import java.util.Scanner;

public class Ex03조건문스캐너2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int num = sc.nextInt();
		
		//만약 일의자리 숫자가 5보다 크거나 같다면
		//올림
		//일의 자리숫자가 5보다 작다면 
		//내림
		
		if (num % 10 <5) {
			System.out.println("반올림 수 : " + num /10 * 10);
			//System.out.println((num + 10)- num % 10);
		}
		else {
			System.out.println("반올림 수 : " + (num/10*10+10));
			//System.out.println(num - num % 10);
		}
		
		
		
		
	}

}
