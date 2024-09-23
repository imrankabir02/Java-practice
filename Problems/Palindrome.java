package Problems;

public class Palindrome {
    public String isPalindrome(String s) {
        if(s.equals(new StringBuilder(s).reverse().toString())){
            return s;
        }

        String left = isPalindrome(s.substring(1));
        String right = isPalindrome(s.substring(s.length() - 1));

        if(left.length() > right.length()) {
            return left;
        } else {
            return right;
        }

    }
    public static void main(String[] args) {
        System.err.println(isPalindrome("123212"));
    }
}
