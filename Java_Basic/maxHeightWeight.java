// import java.util.Scanner;

// public class weightAndHeight {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter a Size");
//         int n = scan.nextInt();
//         System.out.println("Enter a array with even(height) and odd(weight)");
//         int arr[]=new int[n*2];
//         for(int i=0;i<arr.length;i++){
//             int x = scan.nextInt();
//             arr[i]=x;
//         }
//         int height = Integer.MAX_VALUE;
//         int weight = Integer.MAX_VALUE;
//         for(int i=0;i<n;i++){
//             for(int j=1;j<n;j++){
//                 if(arr[i]>arr[i+2]){
//                     height=arr[i];
//                 }else{
//                     height=arr[i+2];
//                 }
//                 if(arr[j]>arr[j+2]){
//                     weight=arr[j];
//                 }else{
//                     weight=arr[j+2];
//                 }
//             }
//         }
//         System.out.println(height);
//         System.out.println(weight);

//         scan.close();
//     }
// }
import java.util.Scanner;

public class maxHeightWeight{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of people:");
        int n = scan.nextInt();

        int[] arr = new int[n * 2];

        System.out.println("Enter the heights (even indices) and weights (odd indices):");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int maxHeight = Integer.MIN_VALUE;
        int maxHeightIndex = -1;
        int maxWeight = Integer.MIN_VALUE;
        int maxWeightIndex = -1;

        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i] > maxHeight) {
                maxHeight = arr[i];
                maxHeightIndex = i / 2 + 1;
            }
        }

        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i] > maxWeight) {
                maxWeight = arr[i];
                maxWeightIndex = i / 2 + 1;
            }
        }

        System.out.println("Person " + maxHeightIndex + " with height " + maxHeight);
        System.out.println("Person " + maxWeightIndex + " with weight " + maxWeight);

        scan.close();
    }
}

