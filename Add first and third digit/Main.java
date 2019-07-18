import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
    int s=n1/100;
    int w=n1%10;
    int e=s+w;
    System.out.println(e);// Type your code here
	}
}