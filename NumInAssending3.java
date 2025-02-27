import java.util.Scanner;
public class NumInAssending3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Three Number ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int big=0;
	int small=0;
	
	if (a>=b && a>=c) {
		big = a;
	}else if(b>=a && b>=c) {
		big = b;
	}else if(c>=a && c>=b) {
		big = c;
	}
	if(a<=b && a<=c) {
		small = a;
	}else if(b<=a && b<=c) {
		small = b;
	}else if(c<=a && c<=b) {
		small = c;
	}
	int mid=(a+b+c) - (big+small);
	
	System.out.println("In Assending Order:"+small+" "+mid+" "+big);
	
}
}
