// import java.util.Scanner;

// public class first_None_Repeat{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a String:");
//         String str = sc.nextLine();
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             boolean isUnique = true;

//             for (int j = 0; j < str.length(); j++) {
//                 if (i != j && ch == str.charAt(j)) {
//                     isUnique = false;
//                     break;
//                 }
//             }

//             if (isUnique) {
//                 System.out.println("First non-repeating character: " + ch);
//                 break;
//             }
//         }

//         sc.close();
//     }
// }

import java.util.Scanner;
public class first_None_Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String str = sc.nextLine();
        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("'" + ch + "' is unique at index: " + str.indexOf(ch));
                break;
            }
        }
        sc.close();
    }
}
