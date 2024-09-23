package Problems;

public class RemoveDuplicate {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char current = str.charAt(idx);

        if(map[current - 'a']) {
            removeDuplicate(str, idx+1, newString);
        } else {
            newString += current;
            map[current - 'a'] = true;
            removeDuplicate(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        removeDuplicate("abdabcbad", 0, "");
    }
}
