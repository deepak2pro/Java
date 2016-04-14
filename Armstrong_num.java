import java.io.*;
import java.util.*;
class Armstrong_num
{
public static void main(String[] args)
{
int n,r,s=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number");
n=in.nextInt();
int t=n;
while(n>0)
{
r=n%10;
s=s+(r*r*r);
n=n/10;
}
if(t==s)
{
System.out.println("Is a Armstrong number");
}
else
{
System.out.println("Not a Armstrong number");
}
}
}