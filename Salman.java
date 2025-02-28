import java.util.Scanner;
public class Salman {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No:");
		int a = sc.nextInt();
		if(a%3==0) {
			System.out.println("Salman ");
		}else if(a%5==0) {
			System.out.println("Aishwarya");
		}else if(a%3==0 && a%5==0) {
			System.out.println("Salman love's Aishwarya");
		}else {
			System.out.println("Vivek Oberoi");
		}
	}
}
