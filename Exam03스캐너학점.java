import java.util.Scanner;

public class Exam03��ĳ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����, ����, ���������� �Է¹޾�
		//��� 90�� �̻��̸� A����
		//80~90 B����
		//70~80 C����
		//�׿� F����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int score1 = sc.nextInt();
		System.out.print("�������� : ");
		int score2 = sc.nextInt();
		System.out.print("�������� : ");
		int score3 = sc.nextInt();
		
		//double total = (score1 + score2 + score3)/3.0;
		double total = (double)(score1 + score2 + score3)/3;
		int change1 = (int)(total * 100);
		double result = change1 * 0.01;
		
		System.out.print("��� : " + result);			
				
							
		if (total >=90) {
			
			System.out.println("�� A�����Դϴ�.");
			
		}
		else if (total >=80) {
			System.out.println("�� B�����Դϴ�.");
		}
		else if (total >=70) {
			System.out.println("�� C�����Դϴ�.");
		}
		else {
			System.out.println("�� F�����Դϴ�.");
		}
		
		sc.close();
	}
	

}
