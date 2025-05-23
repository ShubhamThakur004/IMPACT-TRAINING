import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimal = sc.nextInt();
        int binary = 0, factor = 1;

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * factor;
            factor *= 10;
            decimal /= 2;
        }

        System.out.println("Binary representation: " + binary);
        sc.close();
    }
}

