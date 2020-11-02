import java.io.*;
public class drop
{
public static void main(String []p) throws IOException{
{
FileWriter fw=new FileWriter("./sarika.txt",false);
BufferedWriter bf=new BufferedWriter(fw);
String s="Aditya";
char ch[]=s.toCharArray();
for(int i=0;i<s.length();i++)
bf.write(ch[i]);
bf.write("\nmy name is khan");
bf.close();
}
}
}