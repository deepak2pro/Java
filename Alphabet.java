import java.io.*;
import java.util.*;
import java.lang.*;
class Alphabet
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the character");
String line=in.nextLine();
char c=line.charAt(0);
if(Character.isLetter(c))
System.out.printf("Is a alphabet",c);
else 
System.out.printf("Is not a alphabet",c);
}
}
