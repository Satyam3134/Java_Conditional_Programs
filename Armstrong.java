class Armstrong
{
	public static void main(String... S)
	{
		System.out.print("Please enter the your Integer Number :");
		int t=new java.util.Scanner(System.in).nextInt();
		int rev=0,sum,j=t;
		while(t>0)
		{
			sum=t%10;
			t=t/10;
			rev+=(sum*sum*sum);

		}
			if(rev==j)
			{
			System.out.print("Armstrong your number is : "+rev+ " It is Armstrong");	
			}
			else
			{
			System.out.print("It is not Armstrong");
			}
	}
	
}