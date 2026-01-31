public class ZerosToEnd {
    static void main() {
        int[] arr = {0,1,0,3,12};
        int left = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }

        for(int x : arr){
            System.out.print(x + " ");
        }

    }
}
