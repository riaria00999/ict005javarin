import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String s = sc.next(); //
		int sum = 0;
		
		for (int i = 0; i<N; i++) {
			sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
		
		}
		
		System.out.print(sum);
	}

}
//
//(String.valueOf(str.charAt(i))
//
//여기 부분에서 valueOf 함수 뜻이 뭐야
//
//valueOf() 메소드는 매개변수로 전달된 값을 문자열로 변환합니다. 
//여기서는 charAt() 메소드를 통해 반환된 문자 값을 String 타입의 객체로 변환하기 위해
//사용되었습니다.
//
//즉, (String.valueOf(str.charAt(i))는 str 문자열의 
//		i번째 인덱스에 해당하는 문자를 String 타입으로 변환하여 반환합니다.
