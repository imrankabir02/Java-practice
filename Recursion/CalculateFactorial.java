package Recursion;

public class CalculateFactorial {
    
    public static int calculateFact(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        return n * calculateFact(n-1);
    }
    
    public static void main(String[] args) {
        int n = 5;

        int result = calculateFact(n);

        System.out.println(result);
    }
}
