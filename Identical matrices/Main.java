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
     int b[][] = new int[r][c];
     for(i = 0; i < r; i++)
     {
       for(j = 0; j < c; j++)
        {
         b[i][j] = sc.nextInt();
        }
     }
    int flag=0;
     for(i = 0; i < r; i++)
     {
       for(j = 0; j < c; j++)
        {
         if(a[i][j]!=b[i][j])
         {
           flag=1;
           break;
         }
       }
     }
    if(flag==0)
    {
      System.out.println("Yes");
    }
    else
    {
       System.out.println("No");
    }//your code here
  }
}