import java.util.Scanner;
public class PassOrFail {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter marks of 4 Subjects");
	int p = sc.nextInt();
	int c = sc.nextInt();
	int b = sc.nextInt();
	int m = sc.nextInt();
	
	if( p>=35 && c>=35 && b>=35 && m>=35) {
		System.out.println("You are pass");
	}else {
		System.out.println("You are fail");
	}
}
}
