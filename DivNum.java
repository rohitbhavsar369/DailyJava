import java.util.Scanner;
class DivNum
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int a = sc.nextInt();
	int r = a/2;
	int q = a%2;
	System.out.println(r);
	System.out.println(q);	
	}
}