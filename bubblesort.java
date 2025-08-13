import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {

        int[] arr ={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

        
    }                 

    static void bubble(int[] arr){
        for (int i =0; i<arr.length;i++){
             boolean swapped = false;

            // for each step , max item will come at the last index
            for(int j=1;j<arr.length-i-1;j++){

                 // swap if the item is smaller than the previous item
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}

            




        