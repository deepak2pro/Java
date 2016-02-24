import java.io.*;
import java.util.*;
import java.lang.*;

class Sumnaturalnumbers
{
public static void main(String[] args)
{
int n,i=1;
int sum=0;
System.out.println("Enter the values");
Scanner in=new Scanner(System.in);
n=in.nextInt();
while(i<=n)
{
sum=sum+i;
i++;
}
System.out.print("Sum of Natural numbers:"+sum);

}
}