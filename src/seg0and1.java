public class seg0and1 {
    static void main() {
        int[] arr = {0,1,1,0,1,0};
        int left = 0, right = arr.length-1;

        while(left < right){
            if(arr[left] == 0) left++;
            else if(arr[right] == 1) right--;
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        for(int x : arr){
            System.out.print(x + " ");
        }

    }
}
