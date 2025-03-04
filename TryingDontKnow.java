import java.util.Scanner;
public class TryingDontKnow {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number ");
	int n = sc.nextInt();
	for(int i=1;i<=n;i++) {
		if(i%1==0 && i%i==0) {
			System.out.println("Prime num: "+i);
		}
	}
}
}
