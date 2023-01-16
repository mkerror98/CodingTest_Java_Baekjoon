import java.util.*;

class Main {
	public static void main(String[] args) {
		int king, queen, look, bishop, knight, pawn;
		
		Scanner sc = new Scanner(System.in);
		
		king = sc.nextInt();
		queen = sc.nextInt();
		look = sc.nextInt();
		bishop = sc.nextInt();
		knight = sc.nextInt();
		pawn = sc.nextInt();
		
		System.out.print(1-king +" ");
		System.out.print(1-queen +" ");
		System.out.print(2-look +" ");
		System.out.print(2-bishop +" ");
		System.out.print(2-knight +" ");
		System.out.print(8-pawn +" ");
	}
}