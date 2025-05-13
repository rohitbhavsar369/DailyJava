import java.util.Scanner;

class Ticket 
{

	static int passengers=1;
	String name;
	String type;
	String des;
	String contact;

	Ticket(){
	this("Guest");
	}
	
	Ticket(String name){
	this(name,"Genral");
	}

	Ticket(String name,String type){
	this(name,type," Not specified "," Not specified ");
	}

	Ticket(String name,String type,String des){
	this(name,type,des," Not specified ");
	}

	Ticket(String name,String type,String des,String contact){
	super();
	this.name=name;
	this.type=type;
	this.des=des;
	this.contact=contact;
	}


	public void displayTicket(){
	System.out.println("-------------------------------------");
	
	System.out.println("Passenger No"+passengers+" Details ");
	System.out.println("\nName: "+name+"\nSeat Type: "+type+"\nDestination: "+des+"\nContact No: "+contact);
	passengers++;

	System.out.println("-------------------------------------");


	}


		
	

	
}
class Display
	{
	static Scanner sc = new Scanner(System.in);


	
	public static int wellcome(){
	System.out.println("-------------------------------------");
	System.out.println("---WellCome to train booking --------");
	System.out.println("-------------------------------------");
	
	System.out.println("Enter No of Ticket");
	int n = sc.nextInt();
	if(n>5||n<0){
	return 6;
	}
	return n;
	}



	public void dataInput()
	{


	System.out.println("Enter Name:");
	String name = sc.next();
	System.out.println("Enter type :");
	String type = sc.next();
	System.out.println("Enter destination:");
	String des = sc.next();
	System.out.println("Enter contact:");
	String contact = sc.next();

	Ticket t1 = new Ticket(name,type,des,contact);
	t1.displayTicket();
	} 


}


class TrainTicketDriver
{
	

	


//--------Main Method-----------------------------------------------------------------
	public static void main(String[] args)
	{
	Display d = new Display();
	int n= d.wellcome();
	if(n==6){
	System.out.println("U cant book ticket ");

	}else{
	
	
	for(int i=0;i<n;i++){
	d.dataInput();
	
	

	
	
	}
	}
	System.out.println("Congrastulation u have Book u r tickets");

	}
}

