import java.util.Scanner;

public class Exam02��ĳ�ʷν����հ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int num1 = sc.nextInt();
		System.out.print("���ڰ��� ���� : ");
		int num2 = sc.nextInt();
		System.out.print("Os : ");
		int num3 = sc.nextInt();
		System.out.print("������ ��� : ");
		int num4 = sc.nextInt();
		System.out.print("����Ʈ���� ���� : ");
		int num5 = sc.nextInt();
		
		// total = num1 + num2 + num3 + num4 + num5;
		//boolean isCheck1 = num1>=8 && num2>=8 && num3>=8 && num4>=8 && num5>=8;
		//boolean isCheck2 = total >=60;
		//boolean result = isCheck1 && isCheck2;
		
		//if(result){
		//System.out.println("�հ��Դϴ�!");
		//}
		//else{
		//System.out.println("�հ��Դϴ�!");
		//}
		
		if(num1>=8 && num2>=8 && num3>=8 && num4>=8 && num5>=8 && num1 + num2 + num3 + num4 + num5 >=60) {
			System.out.println("�հ��Դϴ�!");
		}
		else {
			System.out.println("�հ��Դϴ�!");
		
		}
		sc.close();
		
	}

}
