package chap_loop;
import java.util.Scanner;
public class _10_Matter {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            // 공백 출력
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
          
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}