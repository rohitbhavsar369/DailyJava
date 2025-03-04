import java.util.Scanner;
public class EvenOddCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum=0;
		int od = 0;
		for(int i=1;i<=n;i++) {
		if(i%2==0) {
			sum=sum+i;
		}else {
			od=od+i;
		}
		}System.out.println(sum+"   "+od);
	}
}

