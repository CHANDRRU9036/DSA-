package array_questons;

public class linear_search {
    public static void main(String[] args) {
        int []arrr={1,2,3,5,7,8};
        System.out.println(search(arrr, 7, 0));
        

    }
    static boolean search(int arr[],int target, int index){
        if(index==arr.length){
            return false;
        }

        return arr[index]==target || search(arr, target, index+1);
    }
    
}
