import java.io.*;
import java.util.*;
class Oddnum
{
public static void main(String[] args)
{
int n;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number");
n=in.nextInt();
if(n%2!=0)
{
System.out.println("Odd number");
}
else
{
System.out.println("Not odd number");
}
}
}
