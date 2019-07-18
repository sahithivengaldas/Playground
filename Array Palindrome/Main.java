import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int l=0;
      int r=n-1;
      int s=0;
      while(l<=r)
      {
        if(a[l]!=a[r])
        {
          s=1;
          break;
        }
        l++;
        r--;
      }
      if(s==0)
        System.out.println("Yes");
      else
         System.out.println("No");// Type your code here
    }
}