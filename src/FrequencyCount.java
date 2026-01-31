public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 20};

        for (int i = 0; i < arr.length; i++) {
            boolean visited = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    visited = true;
                    break;
                }
            }

            if (!visited) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " -> " + count);
            }
        }
    }
}
