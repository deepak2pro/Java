import java.io.*;
import java.util.*;
import java.lang.*;
class ReverseString
{
public static void main(String args[])
{
String o, r = "";
Scanner in = new Scanner(System.in);
System.out.println("Enter a string to reverse");
o = in.nextLine();
int length = o.length();
for ( int i = length - 1 ; i >= 0 ; i-- )
r = r + o.charAt(i);
System.out.println("Reverse of entered string is: "+r);
}
}
