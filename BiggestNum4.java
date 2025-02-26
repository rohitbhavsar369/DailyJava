import java.util.Scanner;
class BiggestNum4
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 4 Numebr ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();

	int r = (a>b)? a : b;
	    r = (r>c)? r : c;
	    r = (r>d)? r : d;
	System.out.println("Biggest number is: "+r);
	}
}