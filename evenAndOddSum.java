import java.util.Scanner;
public class evenAndOddSum{
    static int evenSum(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                count+=arr[i];
            }
        }
        return count;
    }
    static int oddSum(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==1){
                count+=arr[i];
            }
        }
        return count;
    }
    static int min(int[]arr){
        int x = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(x>=arr[i]){
                x=arr[i];
            }
        }
        return x;
    }
    static int max(int[]arr){
        int x = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(x<=arr[i]){
                x=arr[i];
            }
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Size of Array");
        int size = in.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            int x = in.nextInt();
            arr[i]=x;
        }
        int evenSum=evenSum(arr);
        int oddSum=oddSum(arr);
        int max=max(arr);
        int min=min(arr);
        System.out.println("User Input :");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Sum of Even Number :" +evenSum);
        System.out.println("Sum of Odd Number :" +oddSum);
        System.out.println("Max Number :" +max);
        System.out.println("Min Number :" +min);
        in.close();
    }
    
}