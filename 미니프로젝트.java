
package practice;
import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		//℃ = (℉ − 32) × 5/9
		System.out.println("1. 화씨->섭씨");
		System.out.println("2. 섭씨->화씨");
		
		System.out.println("번호를 선택하시오: ");
		
		sc.nextInt();
		
		System.out.println("화씨 온도를 입력하시오:");


		float f=sc.nextFloat();
		
		float c = (f - 32) * 5/9;

		
		System.out.println("섭씨 온도는" + c);
		
		System.out.println("번호를 선택하시오: ");
		sc.nextInt();
		System.out.println("섭씨 온도를 입력하시오:");
		
		
		//℉ = (℃ × 1.8) ＋ 32
		float cc =sc.nextFloat();
		
		float cf= (float) ((cc * 1.8) + 32);

		
		System.out.println("화씨온도는"+cf);
		

	}

}
