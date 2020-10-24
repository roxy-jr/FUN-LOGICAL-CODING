import java.util.*;
class rikku
{
public static void main(String gs[])
{
System.out.println("enter the size of array");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int ar[]=new int[n];
int br[]=new int[n];
System.out.println("enter the elements ");
int i;
char j;
for(j=97;j<=122;)
{
for(i=1;i<=n;)
{
ar[j]=sc.nextInt();
System.out.println(j+"="+i+"\n");
j++;
i++;
}
}
}
}
