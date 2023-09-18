class Calsum
{
	public static void main(String... S)
	{
		do
		{
		System.out.print("Please enter the First integer :");
		int o=new java.util.Scanner(System.in).nextInt();
		System.out.print("Please enter the Second integer :");
		int t=new java.util.Scanner(System.in).nextInt();
		int sum;
		sum=o+t;
		System.out.println("Sum of two numbers is :"+sum);
		System.out.print("Do you want to continue(press 1 for yes / press 0 for no) :");
		int q=new java.util.Scanner(System.in).nextInt();
		if(q==1)
			continue;
		else
		break;
		}while(true);
	}
	
}