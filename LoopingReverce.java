import java.util.Scanner;
public class LoopingReverce {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n = sc.nextInt();
		while(n>=1){
			System.out.println(n);
			--n;
		}
	}

}
