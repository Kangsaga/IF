import java.util.Scanner;
// import�� �ܺ� ���̺귯������ �����´�
//jre system library���� �����´�
public class Exam01��ĳ��Ȧ¦���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//������� �� ��� ���ϴ����� ���� ��Ÿ���� �� 
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		//��� ���� "�Ǻ�"�Ҷ� ���ǹ��� ����Ѵ�.
		
		
		if (num % 2 == 0) {
			System.out.println(num + "��(��) ¦�� �Դϴ� ");
		}
		else {
			System.out.println(num + "��(��) Ȧ�� �Դϴ� ");
		}
		sc.close();
		//��Ʈ���� ���� �ֱ� ������ ������� ���� �׷��� ������ �����
		
		
	}

}
