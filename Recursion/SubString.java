package Recursion;

public class SubString {
    public static void subSequence(String str, int idx, String newString, HashSet<String> set) {
        if(idx == str.length()) {
            if(set)
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        subSequence(str, idx+1, newString+currChar, set);
        subSequence(str, idx+1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();

        subSequence(str, 0, "", set);
    }
}
