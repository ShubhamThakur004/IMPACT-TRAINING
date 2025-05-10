import java.util.Scanner;

class adamNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        
        int n = sc.nextInt();
        int originalN = n;

        int rev = 0;
        while(n != 0){
           int r = n % 10;
           rev = (rev * 10 + r);
           n = n / 10;
        }
        
        int revSquared = rev * rev;
        int originalSquared = originalN * originalN;

        int rn = 0;
        while(revSquared != 0){
          int r = revSquared % 10;
          rn = (rn * 10 + r);
          revSquared = revSquared / 10;
        }

        if(rn == originalSquared){
            System.out.println("Adam Number");
        } else {
            System.out.println("Not Adam Number");
        }

        sc.close(); 
    }
}
