import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str1=sc.nextLine();
      String str2=sc.nextLine();
      int n=sc.nextInt();
      String rs=str1.replace(str1,str2);
      String[] sr=rs.split(" ",n);
      for(String r:sr)
      {
      System.out.println(r);
      }//Try your code here
    }
}