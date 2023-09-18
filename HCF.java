class HCF
{
	public static void main(String... S)
	{
		System.out.print("Please enter the First integer :");
		int o=new java.util.Scanner(System.in).nextInt();
				System.out.print("Please enter the Second integer :");
		int t=new java.util.Scanner(System.in).nextInt();
		int i,hcf=0;
		for(i = 1; i <= o || i <= t; i++) 
		{
         if( o%i == 0 && t%i == 0 )
         hcf = i;
		}
	 System.out.print("Your HCF is :"+hcf);
	}
}