import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=2;i<=n;i++)
      {
       if(isprime(i)==1)
         System.out.println(i);
       }// Type your code here
	}
  public static int isprime(int a)
  {
    int isprime=1;
    for(int m=2;m<=a/2;m++)
    {
      if(a%m==0)
      {
        isprime=0;
        break;
      }
    }
    return isprime;
  }
}