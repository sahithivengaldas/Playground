import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=first(n);
      System.out.println(sum);// Type your code here
	}
    static int first(int a)
    {
      int s=0;
      for(int i=1;i<=a;i++)
      {
        s=s+i;
      }
      return s;
    }
        
}