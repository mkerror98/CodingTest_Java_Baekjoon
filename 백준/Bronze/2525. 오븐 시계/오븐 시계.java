import java.util.*;

class Main {
	public static void main(String[] args) {
		int now_hour, now_minute, cook_minute, total;
		
		Scanner sc = new Scanner(System.in);
		
		now_hour = sc.nextInt();
		now_minute = sc.nextInt();
		cook_minute = sc.nextInt();
		
		int now_hourToMinute = now_hour * 60;
		total = now_hourToMinute + now_minute + cook_minute;
		
		// 총 24시간이 넘어가면 0시부터로 다시 출발해야함.
		// 더한 시간이 정각이면 끝에 분 표시가 00으로 되어야함. 
		if(total > 1440) {
			total-=1440;
			System.out.println((total/60) + " " + (total%60));
		} else if (total == 1440) {
			total = 0;	
			System.out.println((total/60) + " " + (total%60));
		} else {
			System.out.println((total/60) + " " + (total%60));
		}
		

		
		
	}
}