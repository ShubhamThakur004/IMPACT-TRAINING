import java.util.Scanner;

public class SmallestChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            char smallestChar = str.charAt(0);
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) < smallestChar) {
                    smallestChar = str.charAt(i);
                }
            }

            System.out.println("Smallest character in the string: " + smallestChar);
        }

        sc.close();
    }
}

