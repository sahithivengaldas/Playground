import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      for(int i=0;i<=n-2;i++)
      {
        for(int j=i+1;j<=n-1;j++)
        {
          for(int k=j+1;k<=n-1;k++)
          {
            System.out.print("("+a[i]+","+" "+a[j]+","+" "+a[k]+")"+" ");
          }
        }
        System.out.println(" ");
      }
      // Type your code here
    }
}