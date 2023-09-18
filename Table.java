class Table
{
	public static void main(String... S)
	{
		System.out.print("Please enter the positive integer :");
		int t=new java.util.Scanner(System.in).nextInt();
	for(int i=1; i<=10; i++)
	{
		int sum=i*t;
		System.out.println(t+"*"+i+"="+sum);
	}	
	}
}