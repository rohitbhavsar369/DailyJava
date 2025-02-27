import java.util.Scanner;
public class MonthValid {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Mounth");
	int a = sc.nextInt();
	if(a>=1 && a<=12) {
		System.out.println("Valid Number ");
	}else {
		System.out.println("Invalid Number");
	}
	
}
}
