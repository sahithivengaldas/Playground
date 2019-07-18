import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=n;i>=1;i--)
      {
        int s=i;
        for(int j=1;j<=i;j++)
        {
          System.out.print(s);
           s=s-1;
        }
          System.out.println();
      }
        //Type your code here
	}
}