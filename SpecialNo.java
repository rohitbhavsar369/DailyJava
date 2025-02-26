import java.util.Scanner;
class SpecialNo
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter  Numebr ");
	int a = sc.nextInt();

	int r = a%10;
	int q = a/10;

	int res = (r+q + r*q);

	if(res==a){
	System.out.println("Its a special no ");
	}else{
	System.out.println("Its a not special no ");
	}
	}
}