import java.util.Scanner;

class Newthing
{
	public static void main(String[] args)
	{

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Roll No :");
	int rollno = sc.nextInt();
	//int rollno=3;
	String res = (rollno==1) ? Roll1() + "QSpider" : "Roll No: 1" ; 
	System.out.println(res);
	String res2 = (rollno==2) ? Roll2() + "QSpider" : "Roll No: 2" ; 
	System.out.println(res2);
	String res3 = (rollno==3) ? Roll3() + "QSpider" : " Invalid number" ; 
	System.out.println(res2);
	}


	public static String Roll1()
	{
	int rollno1 = 1;
	String name = "Rohit Bhavsar";
	String clas = "BCA";
	String None = "";
	System.out.println("Roll No: 1"+"\n"+"Name: "+name+"\n"+"Std: "+clas);
	return None;
	}
	
	public static String Roll2()
	{
	int rollno1 = 2;
	String name = "AB Devilliers";
	String clas = "BCA";
	String None = "";
	System.out.println("Roll No: 2"+"\n"+"Name: "+name+"\n"+"Std: "+clas);
	return None;
	}

	public static String Roll3()
	{
	int rollno1 = 3;
	String name = "Whyrat Kohli";
	String clas = "BCA";
	String None = "";
	System.out.println("Roll No: 3"+"\n"+"Name: "+name+"\n"+"Std: "+clas);
	return None;
	}

}