public class binarysearch {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5,6,7,8,9,10};
        int target=6;
        int ans = Binary(arr,target);
        System.out.println(ans);


    }

    static int Binary(int[] arr, int target) {
        int start=0;
        int end = arr.length - 1;

        while(start <= end) {


            //find the middel element
            // int mid =(start+end)/2 // but u cant do this because sometimes the resulting number might cross the int value
            //limet so we do this

            int mid = start + (end - start) / 2;

            if(target< arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;

            }else{
                return mid;
            }

        }
        return -1;

    }
}