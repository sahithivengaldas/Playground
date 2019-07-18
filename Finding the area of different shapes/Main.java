import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      switch(n)
      {
        case 1:
          int s=sc.nextInt();
          int areas=s*s;
          System.out.print(areas);
          break;
        case 2:
          int l=sc.nextInt();
          int b=sc.nextInt();
          int arear=l*b;
          System.out.print(arear);
          break;
        case 3:
          int ba=sc.nextInt();
          int h=sc.nextInt();
          int areat=(ba*h)/2;
          System.out.print(areat);
          break;
        case 4:
          int r=sc.nextInt();
          double areac=3.14*r*r;
          System.out.print(areac);
          break;
      }
          //Try your code here
    }
}