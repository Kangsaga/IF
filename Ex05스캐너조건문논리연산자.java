package ���ǹ�;

import java.util.Scanner;

public class Ex05��ĳ�����ǹ��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		if (age <10) {
			System.out.println("10�� �̸��Դϴ�.");
		}
		else if (age >=10 && age <20) {
			System.out.println("10�� �Դϴ�.");
		}
		else if (age >=20 && age <30) {
			System.out.println("20�� �Դϴ�.");
		}
		else if (age >=30 && age < 40) {
			System.out.println("30�� �Դϴ�.");
		}
		else {
			System.out.println("40�� �̻��Դϴ�.");
		}
		
		
		
	}

}
