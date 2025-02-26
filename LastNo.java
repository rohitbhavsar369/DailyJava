import java.util.Scanner;
class LastNo
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter  Numebr ");
	int a = sc.nextInt();
	System.out.println("Last Number is:"+(a%10));
	}
}