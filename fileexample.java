import java.io.*;
public class fileexample
{
public static void main(String []ar) throws IOException{
{
FileOutputStream fout=new FileOutputStream("./sarika.txt",false);
String s="aditya";
char a[]=s.toCharArray();
for(int i=0;i<s.length();i++)
	fout.write(a[i]);
	fout.close();
}
}}
