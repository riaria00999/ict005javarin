import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//20 입력 시, %4를 하여 5개의 long을 출력한다.
		int loop = n/4;
		for (int i = 0; i<loop; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}

}
