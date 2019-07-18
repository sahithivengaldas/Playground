import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=n%10;
      while(n>10)
      {
        n=n/10;
      }
      int n2=n1+n;
      System.out.println(n2);// Type your code here
	}
}