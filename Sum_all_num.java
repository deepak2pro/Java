import java.io.*;
import java.util.*;
class Sum_all_num
{
public static void main(String[] args)
{
int n,s=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter the values");
n=in.nextInt();
for(int i=1;i<=n;i++)
{
s=s+i;
}
System.out.println(s);
}
}