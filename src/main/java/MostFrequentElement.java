import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentElement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++) {
            array[i] = input.nextInt();
        }
        int num=  mostFrequentElement(array);
        System.out.println(num);
    }

    public static int mostFrequentElement(int[] arr) {
         Arrays.sort(arr);

         int max_count = 1, res = -1;
         int curr_count = 1;

         for (int i = 1; i < arr.length; i++)
         {
             if (arr[i] == arr[i - 1]) {
                 curr_count++;
             } else {
                 curr_count = 1;
             }

             if (curr_count > max_count) {
                 max_count = curr_count;
                 res = arr[i - 1];
             }
         }
         return res;
    }

}
