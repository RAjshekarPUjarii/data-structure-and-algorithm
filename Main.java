public class Main {
    public static void main(String[] args) {

        int nums[] = {2,3,4,6,8,9,12,56,78};
        int target = 9;
        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target);
        System.out.println("Result-1: " + result1);
        System.out.println("Result-2: " + result2);

    }
    public static  int linearSearch(int nums[], int target){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static  int binarySearch(int nums[], int target){
         int left = 0;
         int right = nums.length -1;
         while(left <= right){
             int mid = (left+right)/2;
             if(nums[mid] == target){
                 return mid;
             } else if (nums[mid]<target) {
                 left = mid + 1;
             }
             else {
                 right = mid - 1;
             }
         }


        return -1;
    }

}