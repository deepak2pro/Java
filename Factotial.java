import java.io.*;
import java.util.*;
import java.lang.*;

class Factotial
{
public static void main(String[] args)
{
int n,c,fact=1;
Scanner in=new Scanner(System.in);
System.out.println("Enter the values");
n=in.nextInt();
for(c=1;c<=n;c++)
{
fact=fact*c;
}
System.out.println("factorial of "+n+" is:"+fact);
}
}

