import java.io.*;
import java.util.*;
import java.lang.*;
class Palindromenumm
{
public static void main(String[] args)
{
int n,r,s=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the values");
n=in.nextInt();
int t=n;
while(n>0||n<0)
{
r=n%10;
s=(s*10)+r;
n=n/10;
}
if(t==s)
{
System.out.println("Is Palindrome");
}
else
{
System.out.println("Is not a Palindrome");
}
}
}