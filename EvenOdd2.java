import java.util.Scanner;
class EvenOdd2
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter  Numebr ");
	int a = sc.nextInt();
	
	
	if((a/2)*2==a)
	{
	System.out.println("Even");
	}else{
	System.out.println("Odd");
	}
	}
}