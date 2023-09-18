class Power
{
	public static void main(String... S)
	{
		System.out.print("Please enter the Base Number :");
		int n=new java.util.Scanner(System.in).nextInt();
		System.out.print("Please enter the Power Number :");
		int p=new java.util.Scanner(System.in).nextInt();
		int sum=1;
		for(int i=1; i<=p; i++)
		{
			sum=sum*n;
		}
System.out.println("=> "+sum);
	}
}