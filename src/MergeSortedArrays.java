public class MergeSortedArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] result = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        // merge both arrays
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        // remaining elements of arr1
        while (i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // remaining elements of arr2
        while (j < n2) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        // print result
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
