import java.util.*;
class jagged_array2
{
public static void main(String... args)
{
int[][] arr = new int[3][];
Scanner sc = new Scanner(System.in);
for(int i=0;i<arr.length;i++)
{
System.out.print("enter number of columns ");
int col = sc.nextInt();
System.out.println("enter elements ");
int[] arr2 = new int[col];
for(j=0;j<col;j++)
{
arr2=sc.nextInt();
}
arr[i]=arr2;
}
for(int i = 0 ; i<arr.length ; i++)
{
for(int j = 0 ; j<arr[i].length ; j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
}