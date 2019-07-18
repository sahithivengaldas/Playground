import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int index = 0; index < n; index++)
    {
      list[index] = sc.nextInt();
    }
    print(list, n);
}

public static void print(int list[], int n)
{
  int max=0,j=0;
  for(int i=0;i<=n-1;i++)
  {
    if(list[i]>max)
    {
      max=list[i];
      j=i;
    }
  }
    System.out.println(j);
  }//Try your code here
}