// n이 주어졌을 때, 1부터 n까지 합을 출력하는 프로그램.
import java.util.*;

class Main{
	public static void main(String[] args) {
		int n;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			total += i;
		}
		System.out.println(total);
	}
}