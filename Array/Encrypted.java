import java.util.Scanner;
public class Encrypted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Input");
        String str = sc.nextLine();
        int i=0;
        int j=1;
        int n=str.length()-1;
        while(i<n){
            char temp = str.charAt(i);
            char temp1=str.charAt(j);
            temp=temp1;
            temp1=temp;
            i=i+2;j=j+2;
        }

        System.out.println(str);
        sc.close();
    }
}
