import java.util.Scanner;
public class ZeroAtEnd{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ones = 0, zeros = 0;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (num == 1) {
                ones++;
            } else if (num == 0) {
                zeros++;
            }
        }
        for (int i = 0; i < ones; i++) {
            System.out.print(0);
        }
        for (int i = 0; i < zeros; i++) {
            System.out.print(1);
        }

        in.close();
    }
}

