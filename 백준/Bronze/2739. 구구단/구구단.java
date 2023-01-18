import java.util.*;

class Main {
	public static void main(String[] args) {
		int dan;
		
		Scanner sc = new Scanner(System.in);
		dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
	}
}