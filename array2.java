// import java.util.Scanner;

// public class array2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int arr1[]=new int[5];
//         int arr2[]=new int[5];
//         int sum1=0;
//         int sum2=0;
//         for(int i=0;i<arr1.length;i++){
//             int n = sc.nextInt();
//             arr1[i]=n;
//             sum1+=n;
//         }
//         for(int i=0;i<arr2.length;i++){
//             int n = sc.nextInt();
//             arr2[i]=n;
//             sum2+=n;
//         }

//         if((arr1.length==arr2.length) && (sum1==sum2)){
//             System.out.println("Same");
//         }else{
//             System.out.println("Not Same");
//         }

//         sc.close();
//     }
// }
import java.util.Scanner;
public class array2{
    public static void main(String[] args) {
        int arr1[]=new int[5];
        Scanner sc = new Scanner(System.in);
        int sum1=0;
        for(int i=0;i<arr1.length;i++){
            int n = sc.nextInt();
            int negn=-n;
            arr1[i]=negn;
            sum1+=negn;
        }
        System.out.println(sum1);
        sc.close();
    }
}