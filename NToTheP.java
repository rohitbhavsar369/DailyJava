import java.util.Scanner;
public class NToTheP {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter n Number: ");
	int n = sc.nextInt();
	System.out.print("Enter a P number");
	int p =  sc.nextInt();
	int pro=1; 
	for (int i = 1;i<=p;i++) {
		pro=pro*n;
	}
	System.out.print("Product of Number is: "+pro);
}
}
