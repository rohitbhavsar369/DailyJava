import java.util.Scanner;
public class IndianCurrencePerNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Amount");
		int a = sc.nextInt();
		System.out.println("500:"+a/500);
		a = a%500;
		System.out.println("200:"+a/200);
		a = a%200;
		System.out.println("100:"+a/100);
		a = a%100;
		System.out.println("50:"+a/50);
		a = a%50;
		System.out.println("20:"+a/20);
		a = a%20;
		System.out.println("10:"+a/10);
		a = a%10;
		System.out.println("5:"+a/5);
		a = a%5;
		System.out.println("2:"+a/2);
		a = a%2;
		System.out.println("1:"+a/1);
		a = a%1;
	}

}
