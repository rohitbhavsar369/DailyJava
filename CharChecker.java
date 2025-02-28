import java.util.Scanner;
public class CharChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Char:");
		char c = sc.next().charAt(0);
		if (c>='A' && c<='Z' || c>='a' && c<='z') {
			System.out.println("Its an Alphabate.");
		}else if(c>='0' && c<='9') {
			System.out.println("Its an Digits");
		}else {
			System.out.println("Its an Special Char");
		}
		
	}

}
