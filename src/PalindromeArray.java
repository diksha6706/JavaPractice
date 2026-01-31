public class PalindromeArray {
    static void main() {
        int[] arr = {1,2,3,2,1};
        int left = 0, right = arr.length-1;
        boolean check = true;

        while(left < right){
            if(arr[left] != arr[right]){
                check = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(check);

    }
}
