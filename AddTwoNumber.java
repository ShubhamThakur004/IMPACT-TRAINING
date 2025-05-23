import java.util.Scanner;
import java.util.ArrayList;

public class AddTwoNumber {

    static int[] fill(int size, Scanner sc) {
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of first array:");
        int size1 = sc.nextInt();
        int arr1[] = fill(size1, sc);

        System.out.println("Size of second array:");
        int size2 = sc.nextInt();
        int arr2[] = fill(size2, sc);

        ArrayList<Integer> sumList = new ArrayList<>();
        int carry = 0, i = size1 - 1, j = size2 - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? arr1[i] : 0;
            int digit2 = (j >= 0) ? arr2[j] : 0;
            
            int tempSum = digit1 + digit2 + carry;
            sumList.add(tempSum % 10);
            carry = tempSum / 10;
            
            i--; 
            j--; 
        }
        System.out.println("Array");
        for (int item : sumList) {
            System.out.print(item);
        }

        
    }
}
