import java.util.Scanner;
class AddNum
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 2 Numebr ");
	int a = sc.nextInt();
	int b = sc.nextInt();

	String res = (a>b)?"Bigger is "+a : "Bigger is "+b;
	System.out.println(res);
	}
}