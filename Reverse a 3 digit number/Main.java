import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int r,a=0;
    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    while(n>0)
    {
    r=n%10;
    a=a*10+r;
    n=n/10;
    }
    System.out.println(a);
    //Type your code here
  }
}