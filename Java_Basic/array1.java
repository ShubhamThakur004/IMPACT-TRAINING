import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a size of array");
       int n = sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        int x=sc.nextInt();
        if(x%2==0){
            arr[i]=x;
        }
       }
       for(int x : arr){
        System.out.print(+x+" ");
       }
    //    System.out.println(arr);
    //    for(int i=0;i<arr.length;i++){
    //     if(arr[i]%2==0){
    //         System.out.println("Even Number :"+arr[i]+" ");
    //     }
    //    }
       sc.close();
    }
}
