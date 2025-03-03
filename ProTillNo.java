import java.util.Scanner;
public class ProTillNo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number till u want u sum:");
	int n = sc.nextInt();
	int pro = 1;
	int i=1;
	while(i<=n) {
		pro=pro*i;
		i++;
	}System.out.println(pro);
}
}