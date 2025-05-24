// import java.util.Scanner;

// public class arrayshift {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a size of Array");
//         int n = sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             int x = sc.nextInt();
//             arr[i]=x;
//         }
//         System.out.println("Enter a Position");
//         int p = sc.nextInt();
//         System.out.println("Enter a Element");
//         int e = sc.nextInt();
//         arr[p-1]=e;
//         for(int i=p;i<=n+1;i++){
//             arr[i]=i;
//         }
//         for(int  i : arr){
//             System.out.print(i+" ");
//         }
//         sc.close();

//     }
// }
import java.util.Scanner;

public class arrayshift{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = sc.nextInt();
        
        int arr[] = new int[n + 1];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the position to insert:");
        int p = sc.nextInt();

        System.out.println("Enter the element to insert:");
        int e = sc.nextInt();

        for (int i = n; i >= p; i--) {
            arr[i] = arr[i - 1];
        }
        arr[p - 1] = e;

        System.out.println("Updated Array:");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
