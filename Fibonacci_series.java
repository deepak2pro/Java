import java.io.*;
import java.util.*;
/*0 1 1 2  3 5 8 13 21*/
class Fibonacci_series
{
public static void main(String[] args){
int x=0,y=1,z,c;
Scanner in=new Scanner(System.in);
System.out.println("Enter the range values");
c=in.nextInt();
for(int i=0;i<c;i++){
z=x+y;
x=y;
y=z;
System.out.println(z);
}
}
}