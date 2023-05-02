import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int A;
		int B;
		
		for (int x = 1; x<=T; x++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println("Case #"+x+": "+(A+B));
		}
	}

}
