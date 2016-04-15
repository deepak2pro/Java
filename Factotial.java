import java.io.*;
import java.util.*;
class Factorial
{
public static void main(String[] args)
{
int f,s=1;
Scanner in=new Scanner(System.in);
System.out.println("Enter the values");
f=in.nextInt();
for(int i=1;i<=f;i++)
{
s=s*i;

}
System.out.println(s);
}
}

