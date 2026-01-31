public class MinElement {
    static void main() {
        int[] arr = {5,3,7,1,9};
        int min = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
