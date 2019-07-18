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
      int sum=sc.nextInt();
      for(int i=0;i<=n-1;i++)
      {
        for(int j=i+1;j<=n-1;j++)
        {
          int k=a[i]+a[j];
          if(sum==k)
          {
            System.out.println(a[i]+ ", "+ a[j]);
          }
        }
      }// Type your code here
    }
}