import java.lang.*;
class nested_for_loop_star
{
public static void main(String args[])
{
int r=5;
for(int i=1;i<=r;i++)//represent row..
{
for(int st=1;st<=i;st++)
{
System.out.print("*");
}
System.out.println(" ");
}
}
}