import java.io.*;
import java.util.*;
import java.lang.*;

class Count
{
public static void main(String[] args)
{
int n,c=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number");
n=in.nextInt();
while(n>0)
{
n=n/10;
c++;

}
System.out.println(c);
}
}
