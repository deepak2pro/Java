import java.io.*;
import java.util.*;
class Prime
{
public static void main(String[] args)
{
int n,m,f=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number");
n=in.nextInt();
m=n/2;

for(int i=2;i<=m;i++)
{
if(n%i==0)
{
System.out.println("Is not a prime");
f=1;
}
}
if(f==0)
{
System.out.println("Is prime number");
}
}
}