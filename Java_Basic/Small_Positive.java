import java.util.Scanner;
public class Small_Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array");
        int n = sc.nextInt();
        int arr [] = new int[n];
        int sum =0;
        int count=0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            arr[i]=x;
            if(x>=0){
                sum+=x;
                count++;
            }
        }
        int sum1=0;
        for(int i=0;i<=count;i++){
            sum1+=i;
        }
        int result = sum1-sum;
        System.out.println("Misssing Number is " + result);
        sc.close();

    }
}
