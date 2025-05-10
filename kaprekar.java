import java.util.Scanner;
public class kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        // int originalN = n;
        int temp = n * n;
        int count = 0;
        int num = n;
        while (num != 0) {
            count++;
            num /= 10;
        }
        int divisor = 1;
        for (int i = 0; i < count; i++) {
            divisor *= 10;
        }
        int rem = temp % divisor;
        int quo = temp / divisor;
        if (rem + quo == n) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not a Kaprekar Number");
        }
        sc.close();
    }
}
