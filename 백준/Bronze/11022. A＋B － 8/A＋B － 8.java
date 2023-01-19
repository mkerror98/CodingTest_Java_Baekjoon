import java.util.*;

class Main{
	public static void main(String[] args) {
		int testCase=0;
		
		Scanner sc = new Scanner(System.in);
		
		testCase = sc.nextInt();
		
		for(int i=1; i<=testCase; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d\n", i, num1, num2, num1+num2);
		}
	}
}