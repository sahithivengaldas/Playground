import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // Get the size of an array
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
      int search_elem_1=in.nextInt();
       int search_elem_2=in.nextInt();
      int element_1_index=-1;
       int element_2_index=-1;
      for(int idx = 0; idx <= arr_size - 1; idx++)
      {
        if(search_elem_1==arr[idx])
        {
          element_1_index=idx;
        }
         if(search_elem_2==arr[idx])
        {
          element_2_index=idx;
        }
      }
      System.out.println(element_1_index);
      System.out.println(element_2_index);
      // Type your code here
    }
}