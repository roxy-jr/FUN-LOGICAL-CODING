import java.util.*;
class pyramid
{
public static void main(String []args)
{
System.out.println("enter the number of row");
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
for(int r=1;r<=n;r++)
{
	for(int c=1;c<=2*n-1;c++)
	{
		if(c>=n-(r-1)&&c<=n+(r-1))
		{
			System.out.println("*");
		}
		else
		{
			System.out.println("\n ");
		}
		
	}
}
}
}