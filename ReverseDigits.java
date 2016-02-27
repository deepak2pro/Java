import java.io.*;
import java.util.*;
import java.lang.*;

class ReverseDigits
{
public static void main(String[] args)
{
int n,r=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the digits");
n=in.nextInt();
while(n!=0)
{
r=r*10;
r=r+n%10;
n=n/10;
}
System.out.println("Reverse the digits"+r);
}
}