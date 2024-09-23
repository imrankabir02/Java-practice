package Problems;

public class MoveAllX {
    public static void moveAllX (String str, int idx, int count, String newString) {
        if(idx == str.length()) {
            for(int i=0; i<count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char target = str.charAt(idx);
        if(target == 'x') {
            count++;
            moveAllX(str, idx+1, count, newString);
        } else {
            newString += target;
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        moveAllX("hxelxlxox", 0, 0, "");
    }
}
