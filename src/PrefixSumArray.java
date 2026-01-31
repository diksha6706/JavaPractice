public class PrefixSumArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int[] pref = new int[arr.length];
        pref[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        for (int i = 0; i < pref.length; i++) {
            System.out.print(pref[i]+ " ");
        }
    }
}
