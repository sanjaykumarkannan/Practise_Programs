import java.io.*;

public class CharacterStreams
{
public static void main(String args[]) throws IOException
{
FileReader in=null;
try
{
in=new FileReader("input.txt");
int i;
while((i=in.read())!=-1)
{
System.out.println((char)i);
}
//max no an integer can hold
int a=2147483647;
System.out.println(a);
a=a+1;
//what happens when it crosses that limit
System.out.println(a);
}
finally
{
if(in!=null)
{
in.close();
}
}
}
}
