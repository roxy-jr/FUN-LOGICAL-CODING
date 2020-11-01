import java.util.*;
class slap
{
public static void main(String []d) 
{
	int i,sum=0,add=0,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	 n=sc.nextInt();
	 int c=n/2+1;
	 int p=n/2;
	int ar[]=new int[n];
	int br[]=new int[n];
	System.out.println("enter the " +  n  + "elements of array:");
	for(i=0;i<=n-1;i++)
	{
		ar[i]=sc.nextInt();
	}
	System.out.println("the elements of array are;-");
	for(i=0;i<=n-1;i++)
	{
		System.out.println(ar[i]+"\t");
	}
			for(i=n-1;i>=0;i--)
			{
			add=add+ar[i];
			br[i]=add;
			System.out.println("the sum from index "+ i +" is="+add);
			}
			System.out.println("the array of sum are");
            for(i=0;i<=n-1;i++)
            {
             System.out.println(br[i]);
			} 
System.out.println("the largest element in array of sum are="+br[0]);
System.out.println("\nthe smallest element in array of sum are="+br[n-1]);
if(n%2==0)
{
	System.out.println("the initial half array of sum are=");	
for(i=0;i<=p;i++)
{
	System.out.println(br[i]+"  ");
}
System.out.println("the remaining  half array of sum are=");	
for(i=c;i<=n;i++)
{
	System.out.println(br[i]+"  ");
}
}
}
}
		
		
		
		
		