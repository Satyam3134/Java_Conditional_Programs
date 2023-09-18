class Reverse
{
	public static void main(String... S)
	{
		System.out.print("Please enter the your Integer Number :");
		int t=new java.util.Scanner(System.in).nextInt();
		int rev=0,sum;
		while(t>0)
		{
			sum=t%10;
			t=t/10;
			rev=rev*10+sum;
		}
		System.out.print("Reversed of your number is : "+rev);
	}
}