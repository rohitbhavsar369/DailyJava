import java.util.Scanner;
class BiggestNum3
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 3 Numebr ");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int r = (a>b)? a : b;
	    r = (r>c)? r : c;
	
	System.out.println("Biggest number is: "+r);
	}
}