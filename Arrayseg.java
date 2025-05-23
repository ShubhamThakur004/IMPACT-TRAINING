// // // import java.util.Scanner;
// // // public class Arrayseg {
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //     }
// // // }
// // // import java.util.Scanner;
// // // public class OddAndEven {
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         System.out.print("Enter a size of array");
// // //         int n = sc.nextInt();
// // //         int arr[]=new int[n];
// // //         for(int i=0;i<n;i++){
// // //             int x = sc.nextInt();
// // //             arr[i]=x;
// // //         }
// // //         int x=arr[0];
// // //         int y=arr[n-1];
// // //         for(int i=0;i<n-1;i++){
// // //             if(x%2==0){
// // //                x++; 
// // //             }else{
// // //                 arr[y]=i;
// // //                 y--;
// // //             }
// // //         }
// // //         System.out.println(arr);
// // //         sc.close();
// // //     }
// // // }
// // // import java.util.Scanner;

// // // public class Arrayseg{
// // //     public static void main(String[] args) {
// // //         Scanner sc = new Scanner(System.in);
// // //         System.out.print("Enter the size of the array: ");
// // //         int n = sc.nextInt();
// // //         int arr[] = new int[n];

// // //         System.out.println("Enter the elements of the array: ");
// // //         for (int i = 0; i < n; i++) {
// // //             arr[i] = sc.nextInt();
// // //         }
// // //         int start=0;
// // //         int end = n-1;
// // //         while(start<end){
// // //             if((arr[start]%2==0 && arr[end]%2==1) && start < end){
// // //                 start++;
// // //                 end--;
// // //             }else{
// // //                 int temp = arr[start];
// // //                 arr[start]=arr[end];
// // //                 arr[end]=temp;
// // //                 start++ , end--;
// // //             }
// // //         }
// // //         for(int i : arr){
// // //             System.out.print(" "+i);
// // //         }
// // //         sc.close();
// // //     }
// // // }
// import java.util.Scanner;
// public class Arrayseg {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int start = 0, end = n - 1;

//         while (start < end) {
//             while (arr[start] % 2 == 0 && start < end) start++;
//             while (arr[end] % 2 == 1 && start < end) end--;   
//             if (start < end) {
//                 int temp = arr[start];
//                 arr[start] = arr[end];
//                 arr[end] = temp;
//                 start++;
//                 end--;
//             }
//         }
//         System.out.println("Sorted array (Even numbers first, then odd numbers): ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }

//         sc.close();
//     }
// }*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class Arrayseg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = n - 1;

        while (start < end) {
            if (arr[start] % 2 == 0 && arr[end] % 2 == 1 && start < end) {
                start++;
                end--;
            } else {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
