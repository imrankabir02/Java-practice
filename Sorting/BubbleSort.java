package Sorting;
// import java.util.*;
public class BubbleSort {

    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = {7,8,5,4,9,1,3,2,6};

        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}


// package Sorting;
// // import java.util.*;
// public class BubbleSort {

//     public static void printArray(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void swap(int a, int b) {
//         if(a > b) {
//             int temp = a;
//             a = b;
//             b = temp;
//         }
//     }
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         int arr[] = {7,8,5,4,9,1,3,2,6};

//         for(int i=0; i<arr.length-1; i++) {
//             for(int j=0; j<arr.length-1-i; j++) {
//                 swap(arr[j], arr[j+1]);
//             }
//         }
//         printArray(arr);
//     }
// }