import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
       int n2=sc.nextInt();
       int n3=sc.nextInt();
      System.out.println(gr(n1,n2,n3));// Type your code here
	}
  public static int gr(int n1,int n2,int n3)
  {
    int g;
    if(n1>n2)
      g=n1;
    else
      g=n2;
    if(g>n3)
      return g;
    else
      return n3;
  }
}