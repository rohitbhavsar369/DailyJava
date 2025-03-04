import java.util.Scanner;
public class NTo1Print {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	for(int i=n;n>=1;n--) {
		System.out.println(n);
	}
}
}
