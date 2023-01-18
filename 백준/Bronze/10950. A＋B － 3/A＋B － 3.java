import java.util.*;

class Main {
	public static void main(String[] args) {
		int testCase, num1, num2;
		
		Scanner sc = new Scanner(System.in);
		testCase = sc.nextInt();
		
		
		for(int i=1; i<=testCase; i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println(num1 + num2);
		}
	}
}