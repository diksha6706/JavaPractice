public class SquareOfSortedArray {
    static void main() {
        int[] arr = {-4,-1,0,3,10};
        int n = arr.length;
        int[] result = new int[n];
        int left = 0, right = n-1, pos = n-1;

        while(left <= right){
            int lsq = arr[left]*arr[left];
            int rsq = arr[right]*arr[right];
            if(lsq > rsq){
                result[pos--] = lsq;
                left++;
            } else {
                result[pos--] = rsq;
                right--;
            }
        }

        for(int num : result){
            System.out.print(num + " ");
        }

    }
}
