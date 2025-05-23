// import java.util.Scanner;
// public class OddAndEven {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a size of array");
//         int n = sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             int x = sc.nextInt();
//             arr[i]=x;
//         }
//         int x=arr[0];
//         int y=arr[n-1];
//         for(int i=0;i<n-1;i++){
//             if(x%2==0){
//                x++; 
//             }else{
//                 arr[y]=i;
//                 y--;
//             }
//         }
//         System.out.println(arr);
//         sc.close();
//     }
// }
import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenIndex = 0, oddIndex = n - 1;
        int sortedArr[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sortedArr[evenIndex++] = arr[i];
            } else {
                sortedArr[oddIndex--] = arr[i];
            }
        }

        System.out.println("Sorted array (Even numbers first, then odd numbers): ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
