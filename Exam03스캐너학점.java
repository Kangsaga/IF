import java.util.Scanner;

public class Exam03스캐너학점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 수학, 영어, 과학점수를 입력받아
		//평균 90점 이상이면 A학점
		//80~90 B학점
		//70~80 C학점
		//그외 F학점
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수학점수 : ");
		int score1 = sc.nextInt();
		System.out.print("영어점수 : ");
		int score2 = sc.nextInt();
		System.out.print("과학점수 : ");
		int score3 = sc.nextInt();
		
		//double total = (score1 + score2 + score3)/3.0;
		double total = (double)(score1 + score2 + score3)/3;
		int change1 = (int)(total * 100);
		double result = change1 * 0.01;
		
		System.out.print("평균 : " + result);			
				
							
		if (total >=90) {
			
			System.out.println("점 A학점입니다.");
			
		}
		else if (total >=80) {
			System.out.println("점 B학점입니다.");
		}
		else if (total >=70) {
			System.out.println("점 C학점입니다.");
		}
		else {
			System.out.println("점 F학점입니다.");
		}
		
		sc.close();
	}
	

}
