import java.util.Scanner;
public class DigitsOfNum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number:");
	int n = sc.nextInt();
	int r = 0;
	int sum = 0;
	while(n!=0) {
		r = n%10;
		sum=sum+r;
		System.out.println(r);
		n = n/10;;
	}System.out.println("Sum of Digits:"+sum);
}
}
