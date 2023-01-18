import java.util.*;

class Main {
	public static void main(String[] args) {
		int x,y,z,max;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		if(x==y) {  		 // x와 y가 같을 때.
			if(y==z) {		 // y와 z가 같을 때. 셋 다 같을 때.
				System.out.println(10000+(x * 1000));
			}else if(y!=z) { // y와 z가 다를 때.
				System.out.println(1000+(x * 100));
			}
			
		}else if(x!=y) {     // x와 y가 다를 때.
			if(x==z) {		 // x와 z가 같을 때.
				System.out.println(1000+(x * 100));
			}else if(x!=z && y!=z) { // x와 z가 다를 때. 셋 다 다를 때. 셋을 비교해서 출력해야함.
				if (x >= y && x >= z) {
					max = x;
				}else if ( y >= x && y >= z) {
					max = y;
				}else {
					max = z;
				}
				System.out.println(max * 100);
			}else if(y==z) {
				System.out.println(1000+(y * 100));
			}
			
		}else if(x==z) {     // x와 z가 같을 때.
			if(x==y) { 		 // x와 y가 같을 때. 셋 다 같을 때.
				System.out.println(10000+(x * 1000));
			}else if(x!=y) { // x와 z는 같고 y와는 다르다.
				System.out.println(1000+(x * 100));
			}
			
		}else if(x!=z) {     // x와 z가 다를 때.
			if (x==y) {		 // x와 y는 같고 z와는 다르다.
				System.out.println(1000+(x * 100));
			}else if(x!=y) { // 셋 다 다르다.
				if (x >= y && x >= z) {
					max = x;
				}else if ( y >= x && y >= z) {
					max = y;
				}else {
					max = z;
				}
				System.out.println(max * 100);
			}
		}
	}
}


