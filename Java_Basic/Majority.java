import java.util.Scanner;
public class Majority {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Size");
        int n = in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int x = in.nextInt();
            arr[i]=x;
        }
        int left = 0;
        int right = n - 1;
        int count1 = 0;
        int count2 = 0;
        while (left <= right) { // Fix: Use '<=' condition
            if (arr[left] == arr[right]) {
                left++;
                right--;
                count1++;
            } else {
                left++;
                count2++;
                }
            }
         System.out.println(Math.max(count1, count2));
         in.close();

    }
}
