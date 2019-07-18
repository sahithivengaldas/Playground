import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int index = 0; index <= (arr_size - 1); index++)
        {
            arr[index] = in.nextInt();
        }
      move(arr_size,arr);
      for(int index=0;index<=(arr_size-1);index++)
      {
        System.out.print(arr[index]+" ");
      }
    }
      public static void move(int arr_size,int arr[])
      {
        int count=0;
        for(int i=0;i<=(arr_size-1);i++)
        {
          if(arr[i]!=0)
          {
            int temp=arr[i];
            arr[i]=arr[count];
            arr[count]=temp;
            count++;
          }
        }
      }// Type your code here
}