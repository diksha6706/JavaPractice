public class Replaces {
    static void main() {
        int[] arr = {0,1,0,3};

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                arr[i] = -1;
            }
        }

        for(int x : arr){
            System.out.print(x + " ");
        }

    }
}
