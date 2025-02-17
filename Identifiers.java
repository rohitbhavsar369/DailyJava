class Identifiers
{
public static void main(String[]args)
{
System.out.println("\n\nIdentifiers cannot start with digits");
System.out.println("Eg 1.class #Demo \n{   \nError \n}");
System.out.println("Eg 2.class De@mo\n{   Error\n}");
System.out.println("Eg 3.class Demo\n{   Compilation Successful\n}");
System.out.println("\n\n We cannot use any specific special character expecpt _ and $ ");
System.out.println("Eg 1.class #Demo \n{   \nError \n}");
System.out.println("Eg 2.class driver_manager\n{    \nCompilation Successful \n}");
System.out.println("\n\n Keywords cannot used as identifiers");
System.out.println("Eg 1.class class \n{   \nError   \n}");
System.out.println("Eg 1.class Class \n{   \nCompilation Successful   \n}");
System.out.println("\n\n Writing space is not allowed ");
System.out.println("class driver manger  \n{    \nError    \n}");
System.out.println("class driver_manger  \n{    \nCompilation Successful   \n}");
}
}
