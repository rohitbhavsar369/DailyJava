import java.util.Scanner;
public class MonthDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Month");
		int m = sc.nextInt();
		if(m<=0 || m>=13) {
			System.out.println("Are u mad ");
		}else if(m==1|| m==3 || m==5 || m==7 || m==9 || m==11){
			System.out.println("31 Days");
		}else if(m==2) {
			System.out.println("28 or 29 Days");
		}else {
			System.out.println("30 Days");
		}
	}

}
