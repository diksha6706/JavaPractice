public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        int sum1 = 0, sum2 = 0;

        for (int i = 0; i <= nums.length; i++) {
            sum1 += i;
        }

        for (int i = 0; i < nums.length; i++) {
            sum2 += nums[i];
        }

        System.out.println(sum1 - sum2);
    }
}
