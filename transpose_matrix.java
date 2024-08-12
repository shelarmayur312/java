import java.lang.*;
class transpose_matrix
{
public static void main(String args[])
{
int i,j;
int array[][]={{1,3,4},{2,4,3},{3,4,5}};
System.out.println("Transpose of matrix is ");
for (i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(array[i][j]+" ");
}
System.out.println(" ");
}
}
}