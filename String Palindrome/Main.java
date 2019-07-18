import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      StringBuilder sb1=new StringBuilder(str);
      StringBuilder sb=new StringBuilder(str);
      int len=sb.length();
      int front=0;
      int end=len-1;
      int f=1;
      while(front<end)
      {
        /*char temp=sb.charAt(front);
        sb.setCharAt(front,sb.charAt(end));
        sb.setCharAt(end,temp);*/
        if(sb.charAt(front)!=sb.charAt(end))
        {
          f=0;
          break;
        }
        front++;
        end--;
      }
     // System.out.println(sb);
      if(f==1)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }//Type your code here
    } 
}