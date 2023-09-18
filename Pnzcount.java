class Pnzcount
{
	public static void main(String... S)
	{
		while(true)
		{
		System.out.print("Please enter the your Integer Number :");
		int t=new java.util.Scanner(System.in).nextInt();
		int p=0,n=0,z=0;
		if(t>0)
			p+=p+1;
		else if(t<0)
			n+=n+1;
		else
			z+=z+1;
		System.out.println("Positive Number :"+p);
		System.out.println("Negative Number :"+n);
		System.out.println("Zero's :"+z);
		System.out.print("Do you want to continue(press 1 for yes / press 0 for no) :");
		int o=new java.util.Scanner(System.in).nextInt();
		if(o==1)
			continue;
		else
		break;
		}

	}
	
}