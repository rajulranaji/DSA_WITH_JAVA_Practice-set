import java.util.Arrays;

//find target first appairains and last appairains...
class leedcodeQ3 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 4, 6 };
        System.out.println("Your arr is:" + Arrays.toString(arr));
        int start = arr(arr, 0, true);
        int last = arr(arr, start, false);
        System.out.println("Your Element first occurance index is:"+" "+start);
        System.out.println("YOur Element last occurance index no is:"+" "+last);
    }

    static int arr(int arr1[],int key,boolean firstindex) {
         int ans = -1;
        int start = 0;
        int end = arr1.length - 1;
         key = 2;
        while (start < end) {
            int mid = (start + end) / 2;
            if (key > arr1[mid]) {
        start = mid+1;
            }
            else if(key < arr1[mid]){
        end = mid-1;
            }
            else{
            ans = mid;
            if(firstindex){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            }
            }
            return ans;
        }
    }
