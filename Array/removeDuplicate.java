import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Str1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter a Str2: ");
        String str2 = sc.nextLine();
        
        StringBuilder uniqueChars = new StringBuilder();
        
        for (char ch : (str1 + str2).toCharArray()) {
            if (!str1.contains(String.valueOf(ch)) || !str2.contains(String.valueOf(ch))) {
                uniqueChars.append(ch);
            }
        }
        
        System.out.println("Characters that are not common in both strings: " + uniqueChars);
        sc.close();
    }
}
