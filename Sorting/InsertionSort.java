package Sorting;

public class InsertionSort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = {7,8,5,4,9,1,3,2,6};

        for(int i=0; i<arr.length; i++) {
            int current = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        printArray(arr);
        
    }
}
