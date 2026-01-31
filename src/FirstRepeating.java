public class FirstRepeating {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 1, 4};

        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                    break;
                }
            }
            if (ans != -1) break;
        }

        System.out.println(ans);
    }
}
