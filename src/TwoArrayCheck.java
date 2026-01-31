public class TwoArrayCheck {
    static void main() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        if(arr1.length != arr2.length){
            System.out.println(false);
        } else {
            java.util.Arrays.sort(arr1);
            java.util.Arrays.sort(arr2);
            boolean isEqual = true;
            for(int i=0;i<arr1.length;i++){
                if(arr1[i] != arr2[i]){
                    isEqual = false;
                    break;
                }
            }
            System.out.println(isEqual);
        }

    }
}
