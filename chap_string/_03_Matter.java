import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		String s;
		for (int i = 0; i<T; i++) {
			s = sc.next();
		System.out.print(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
	}

}
}
