import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     int i, j;
     Scanner sc = new Scanner(System.in);
     int r = sc.nextInt();
     int c = sc.nextInt();
     int a[][] = new int[r][c];
     for(i = 0; i < r; i++)
     {
       for(j = 0; j < c; j++)
        {
         a[i][j] = sc.nextInt();
        }
     }
    for(i=r-1;i>=0;i--)
    {
      for(j=0;j<=c-1;j++)
      {
        System.out.print(a[j][i]+" ");
      }
      System.out.println(" ");
    }// your code here
  }
}