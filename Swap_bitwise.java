import java.io.*;
import java.util.*;
class Swap_bitwise
{
public static void main(String[] args)
{
int a,b;
Scanner in=new Scanner(System.in);
System.out.println("Enter the a & b values");
a=in.nextInt();
b=in.nextInt();
a=a^b;
b=a^b;
a=a^b;
System.out.println("a:"+a+" b:"+b);
}
}