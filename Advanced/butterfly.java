package Advanced;

public class butterfly {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for(int i=1; i<=n; i++) {
            //1st part
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            int space = 2*(n-i);
            for(int j=1;j<= space; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>0; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            int space = 2*(n-i);
            for(int j=1;j<= space; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
