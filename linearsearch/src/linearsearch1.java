
public class linearsearch1 {
    public static void main(String[] args) {
        int[] nums = {23, 45, 65, 5, 43, 19, 3, 3, 3};
        int target = 19;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }
    //search in the array:return the index if item found
    // otherwise if the item is not found return -1




    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;

        }


        // run a for loop 
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is == target
            int element = arr[index];
            if (element == target) {
                return index;
            }


        }
        return -1;

    }

}











