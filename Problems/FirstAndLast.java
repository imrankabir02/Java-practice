package Problems;

public class FirstAndLast {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurance(String str, int idx, char target) {
        if(idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = str.charAt(idx);
        if(current == target) {
            if(first == -1) {
                first = last = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx+1, target);
    }

    public static void main(String[] args) {
        String str = "ajfkdshqjghsdajkjajkfg";
        findOccurance(str, 0, 'a');
    }
}
