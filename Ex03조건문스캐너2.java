package ���ǹ�;

import java.util.Scanner;

public class Ex03���ǹ���ĳ��2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = sc.nextInt();
		
		//���� �����ڸ� ���ڰ� 5���� ũ�ų� ���ٸ�
		//�ø�
		//���� �ڸ����ڰ� 5���� �۴ٸ� 
		//����
		
		if (num % 10 <5) {
			System.out.println("�ݿø� �� : " + num /10 * 10);
			//System.out.println((num + 10)- num % 10);
		}
		else {
			System.out.println("�ݿø� �� : " + (num/10*10+10));
			//System.out.println(num - num % 10);
		}
		
		
		
		
	}

}
