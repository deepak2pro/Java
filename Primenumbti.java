import java.io.*;
import java.util.*;
class Primenumbti
{
public static void main(String[] args)
{
int n,m;
Scanner in=new Scanner(System.in);
System.out.println("Enter the value");
n=in.nextInt();
m=in.nextInt();

for(int i=n;i<=m;i++)
{
int j;
for(j=2;j<=i;j++)
{
if(i%j==0)
{
break;
}
}

if(i==j)
{
System.out.println(i);
}
}
}
}