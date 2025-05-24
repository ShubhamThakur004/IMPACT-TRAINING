// import java.util.Scanner;
// public class busEx {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter a Group No :");
//         int gn = in.nextInt();
//         System.out.println("Enter a Capacity :");
//         int c = in.nextInt();
//         int []arr = new int[gn];
//         System.out.println("Enter group member");
//         for(int i=0;i<gn;i++){
//             int n = in.nextInt();
//             arr[i]=n;
//         }
//         int bus=0;
//         while(c<=0){
//             for(int i=0;i<arr.length;i++){
//                 if((arr[i]==arr[i+1] && c==arr[i]+arr[i+1])){
//                     bus++;
//                 }
//                 if(c==arr[i] || c<=arr[i]){
//                     bus++;
//                 }
//             }
//             c--;
//         }
//         in.close();
//         System.out.println(bus);
//     }
// }
import java.util.Scanner;

public class busEx{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of groups: ");
        int gn = in.nextInt();
        
        System.out.print("Enter bus capacity: ");
        int c = in.nextInt();
        
        int[] arr = new int[gn];
        System.out.println("Enter number of members in each group:");
        for (int i = 0; i < gn; i++) {
            arr[i] = in.nextInt();
        }
        
        int busCount = 1;
        int currentCapacity = 0;

        for (int i = 0; i < gn; i++) {
            if (currentCapacity + arr[i] <= c) {
                currentCapacity += arr[i];

            } else {
                busCount++;
                currentCapacity = arr[i];
            }
        }

        if (currentCapacity > 0) {
            busCount++;
        }

        in.close();
        System.out.println("Minimum buses needed: " + busCount);
    }
}
