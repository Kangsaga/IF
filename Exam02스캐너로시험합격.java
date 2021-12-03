import java.util.Scanner;

public class Exam02스캐너로시험합격 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("DB : ");
		int num1 = sc.nextInt();
		System.out.print("전자계산기 구조 : ");
		int num2 = sc.nextInt();
		System.out.print("Os : ");
		int num3 = sc.nextInt();
		System.out.print("데이터 통신 : ");
		int num4 = sc.nextInt();
		System.out.print("소프트웨어 공학 : ");
		int num5 = sc.nextInt();
		
		// total = num1 + num2 + num3 + num4 + num5;
		//boolean isCheck1 = num1>=8 && num2>=8 && num3>=8 && num4>=8 && num5>=8;
		//boolean isCheck2 = total >=60;
		//boolean result = isCheck1 && isCheck2;
		
		//if(result){
		//System.out.println("합격입니다!");
		//}
		//else{
		//System.out.println("합격입니다!");
		//}
		
		if(num1>=8 && num2>=8 && num3>=8 && num4>=8 && num5>=8 && num1 + num2 + num3 + num4 + num5 >=60) {
			System.out.println("합격입니다!");
		}
		else {
			System.out.println("합격입니다!");
		
		}
		sc.close();
		
	}

}
