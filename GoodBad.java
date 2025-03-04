//9265 good    45328   bad
//76486 Good   81563   bad
// 8632 good 
import java.util.Scanner;
public class GoodBad {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number:");
	int n = sc.nextInt();
	int sum = 0;
	while(n!=0) {
		int r = n%10;
		if(r==2 || r==3 || r==5 || r==7) {
			sum = sum + r;
		}
		 n = n/10;
	}if(sum==2 || sum==3 || sum==5 ||  sum==7) {
		System.out.println("Bad");
	}else {
		System.out.println("Good");
	}
}
}
