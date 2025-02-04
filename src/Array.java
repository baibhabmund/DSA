import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        /*int sum=0;
        int i = 0;
                while(i < arr.length){
                    sum += arr[i];
                    i++;
            System.out.println(sum);

        }*/

        /*int max = arr[0];
        for(int i = 1; i < arr.length; i++){
           if(arr[i] > max){
               max = arr[i];
           }
        }
        System.out.println("Largest element in the array is  : " + max);
         */

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
