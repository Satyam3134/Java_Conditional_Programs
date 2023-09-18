class Factorial
{
	public static void main(String... S)
	{
		System.out.print("Please enter the your Number :");
		int t=new java.util.Scanner(System.in).nextInt();
		int sum=1;
	for(int i=1; i<=t; i++)
	{
		sum=sum*i;
	}	
	System.out.println("Factorial of "+t+" is "+sum);
	}
}