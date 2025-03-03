import java.util.Scanner;
public class AddTillNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number till u want u sum:");
	int n = sc.nextInt();
	int sum = 0;
	int i=1;
	while(i<=n) {
		sum=sum+i;
		i++;
	}System.out.println(sum);
}
}
