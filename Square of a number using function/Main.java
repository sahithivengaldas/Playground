import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        int s=square(n);
      System.out.println(s);// Type your code here   
	} 
    static int square(int a)
    {
      int p;
      p=a*a;
      return p;
    }
}