import java.util.Scanner;

public class Antakshari{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str1 = sc.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a String: ");
            String str2 = sc.nextLine();

            char lastChar = str1.charAt(str1.length() - 1);
            char firstChar = str2.charAt(0);

            if (lastChar == firstChar) {
                System.out.println(str1);
            } else {
                System.out.println("End of game, mismatch found!");
                break;
            }
            str1 = str2;
        }
        sc.close();
    }
}
