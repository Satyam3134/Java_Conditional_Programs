class Fibonacci
{
	public static void main(String... S)
	{
		System.out.print("Please enter the First integer :");
		int o=new java.util.Scanner(System.in).nextInt();
		int a=0,b=1,c;
		for(int i=0; i<=o; i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}
	}
}