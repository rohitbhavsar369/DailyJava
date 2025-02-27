import java.util.Scanner;
public class Driver {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter any number");
	int a = sc.nextInt();
	if (a>=-9 && a<=9) {
		System.out.println("Digits");
	}else {
		System.out.println("Numeber");
	}
}
}
