package ���ǹ�;

import java.util.Scanner;

public class Ex04���ǹ���ĳ�ʰ�������ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ð��� �Է����ּ��� : ");
		int time = sc.nextInt();
		if (time >8) {
			//System.out.println("�ñ��� : " + (8*5000+ (time -8)*7500));
			System.out.println(8*5000 + (int)((time-8)*5000*1.5));
		}
		else {
			System.out.println("�ñ��� :" + time * 5000);
		}
		
		
	}

}
