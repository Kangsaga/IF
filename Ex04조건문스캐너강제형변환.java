package 조건문;

import java.util.Scanner;

public class Ex04조건문스캐너강제형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력해주세요 : ");
		int time = sc.nextInt();
		if (time >8) {
			//System.out.println("시급은 : " + (8*5000+ (time -8)*7500));
			System.out.println(8*5000 + (int)((time-8)*5000*1.5));
		}
		else {
			System.out.println("시급은 :" + time * 5000);
		}
		
		
	}

}
