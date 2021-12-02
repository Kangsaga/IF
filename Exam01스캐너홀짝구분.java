import java.util.Scanner;
// import는 외부 라이브러리에서 가져온다
//jre system library에서 가져온다
public class Exam01스캐너홀짝구분 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//노란줄은 왜 사용 안하는지에 대해 나타내는 것 
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		//어떠한 값을 "판별"할때 조건문을 사용한다.
		
		
		if (num % 2 == 0) {
			System.out.println(num + "는(은) 짝수 입니다 ");
		}
		else {
			System.out.println(num + "는(은) 홀수 입니다 ");
		}
		sc.close();
		//스트림을 쓰고 있기 때문에 노란줄이 나옴 그래서 닫으면 사라짐
		
		
	}

}
