
public class Pattern11 
{
public static void main(String args[])
{
	char ch='A';
	int n=6,m=6,s=1;
	while(ch<+'G')
	{
		System.out.print(ch++);
	}
	while(ch>='A')
		{
		System.out.print(ch--);
		}
	System.out.println();
	ch='A';
	for(int j=1;j<7;j++)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print(ch++);
		}
		for(int k=1;k<=s;k++)
		{
			System.out.print(" ");
		}
		for(int i=1;i<=m;i++)
		{
			System.out.print(--ch);
		}
		n--;
		m--;
		s=s+2;
		System.out.println();
	}
	System.out.println();
}
}
