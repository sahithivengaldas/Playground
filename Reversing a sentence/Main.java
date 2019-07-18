import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      StringBuilder sb=new StringBuilder(str);
      int len=sb.length();
      int start_idx=0;
      int end_idx=len-1;
      reverse_string(sb,start_idx,end_idx);
      for(int i=0;i<len;i++)
      {
       if(sb.charAt(i)==' ')
       {
        reverse_string(sb,start_idx,i-1);
         start_idx=i+1;
       }
        else if(i==len-1)
        {
          reverse_string(sb,start_idx,i);
          start_idx=i+1;
        }
      }
      System.out.println(sb);// Type your code here
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        while(start_idx<end_idx)
        {
          char temp=sb.charAt(start_idx);
          sb.setCharAt(start_idx,sb.charAt(end_idx));
          sb.setCharAt(end_idx,temp);
          start_idx++;
          end_idx--;
        }     // Type your code here
    }
}