import java.io.*;
import java.util.*;
import java.lang.*;

class Leapyear
{
public static void main(String[] args)
{
int y;
System.out.println("Enter the year");
Scanner in=new Scanner(System.in);
y=in.nextInt();
if(y%4==0)
System.out.println("It is Leap Year");
else
System.out.println("It is not Leap Year");

} 
}