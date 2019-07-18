import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    String s=sc.nextLine();
    int l1=str.length();
    int l2=s.length();
    int c=0;
    for(int i=0;i<(l1-l2+1);i++)
    {
      int match=1;
      for(int j=0;j<l2;j++)
      {
        if(str.charAt(i+j)!=s.charAt(j))
        {
          match=0;
        }
      }
      if(match==1)
        c++;
    }
    System.out.println(c);// Type your code here
  } 
}