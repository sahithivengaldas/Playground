import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      int result=power(b,e);
      System.out.println(result);
    }
  public static int power(int a,int b)
  {
    int p=1;
    for(int i=1;i<=b;i++)
    {
      p=p*a;
    }
     return p; 
  }
}