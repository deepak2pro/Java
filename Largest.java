import java.io.*;
import java.util.*;
import java.lang.*;

class Largest
{
public static void main(String[] args)
{
int x,y,z;
System.out.println("Enter x y z values");
Scanner in=new Scanner(System.in);

x=in.nextInt();
y=in.nextInt();
z=in.nextInt();

if(x>y&&x>z)
System.out.println("x is Largest");
else if(y>x&&y>z)
System.out.println("y is Largest");
else if(z>x&&z>y)
System.out.println("z is Largest");
}
}
