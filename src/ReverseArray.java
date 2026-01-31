public class ReverseArray {
    static void main() {
        int[] arr = {1,2,3,4,5};
        int left = 0, right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for(int x : arr){
            System.out.print(x + " ");
        }

    }
}
