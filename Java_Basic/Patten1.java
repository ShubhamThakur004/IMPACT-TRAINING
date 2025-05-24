// import java.util.Scanner;
// public class Patten1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum=1;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(" "+sum);
//                 sum++;
//             }
//             System.out.println();
            
//         }
//         sc.close();
//     }
// // }
// import java.util.Scanner;
// public class Patten1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<=i;j++){
//                 System.out.print("#");
//             }
//             System.out.println();
//         } 
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class Patten1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a row");
//         int row=sc.nextInt();
//         for(int i=1;i<=row;i++){
//             for(int j=i;j<row;j++){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=(2*i-1);k++){
//                 System.out.print("#");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class Patten1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a row");
//         int n = sc.nextInt();
//         for(int i=n;i>=0;i--){
//             for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
       
//         sc.close();
//     }
// }

// import java.util.Scanner;
// public class Patten1{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=n;i>=1;i--){
//             for(int j=0;j<n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<i;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

public class Patten1{
    public static void main(String[] args) {
      int row=4;
      for(int i=1;i<=row;i++){
       for(int j=1;j<=row;j++){
            if(i==1 || i==row || j==1 || j==row){
                System.out.print("*");
            }else{
                System.out.print(" "); 
            }
       }
       System.out.println();
      }

    }
}