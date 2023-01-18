import java.util.*;

class Main {
	public static void main(String[] args) {
		int input_total=0, kind=0, price=0, number=0, real_total=0;
		
		Scanner sc = new Scanner(System.in);
		input_total = sc.nextInt();
		kind = sc.nextInt();
		
		for(int i=1; i<=kind; i++) {
			price = sc.nextInt();
			number = sc.nextInt();
			real_total += price * number;
		}
		
		if(input_total == real_total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}