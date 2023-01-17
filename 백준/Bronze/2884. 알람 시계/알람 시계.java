import java.util.*;

class Main {
	public static void main(String[] args) {
		int hour, minute;
		
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		minute = sc.nextInt();
		
		int hourToMinute = hour * 60;
		
		int total = hourToMinute + minute;
		
		if(total<45) {
			total+=1440-45;
		} else {
			total-=45;
		}
				
		System.out.println((total/60) + " " + (total%60));
	}
}