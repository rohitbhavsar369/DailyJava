import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter  Numebr ");
	int a = sc.nextInt();
	
	
	String res = (a%2==0)?"Even " : "Odd ";
	System.out.println(res);
	}
}