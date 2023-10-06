

public class p1BinarySearch {
    public static void main(String[] args) {
int [] nums = {-25 ,-11, -10, -4, 0,5, 12, 14, 23, 34, 56, 78,80, 98,100,};
int target = 14;
int ans = binarysearch(nums, target );
        System.out.println(ans);
    }

    static int binarysearch(int [ ] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
//            int mid = (start + end)/2
//            for big arrays we can use
            int mid = start + (end- start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return  mid;
            }

        }
        return  -1;

    }
}
