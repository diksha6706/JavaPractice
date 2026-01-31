public class ValidPalindrome {
    static void main() {
        String s = "Madam";
        s = s.toLowerCase();
        int left = 0, right = s.length()-1;
        boolean check = true;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                check = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(check);

    }
}
