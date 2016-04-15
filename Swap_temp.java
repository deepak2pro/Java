import java.io.*;
import java.util.*;
class Swap_temp
{
public static void main(String[] args)
{
int i,j,t;
Scanner in=new Scanner(System.in);
System.out.println("Enter the i & j values");
i=in.nextInt();
j=in.nextInt();
t=i;
i=j;
j=t;
/*i=i+j;
   j=i-j;
   i=i-j;
*/
System.out.println("i="+i);
System.out.println("j="+j);
}
}