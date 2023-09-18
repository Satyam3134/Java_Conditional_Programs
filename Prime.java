class Prime
{
	public static void main(String... S)
	{
		System.out.print("Please enter the positive integer :");
		int t=new java.util.Scanner(System.in).nextInt();
		int count=0;
		if(t==1)
			System.out.print("It is prime number");
		else
		{
		for(int i=1; i<=t; i++)
			if(t%i==0)
				count=count+1;
			if(count==2)
					System.out.print("It is prime number");
			else
					System.out.print("It is Not prime number");
		}
	}
}