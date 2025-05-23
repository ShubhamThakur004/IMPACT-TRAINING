import java.util.*;
public class movezeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int m =sc.nextInt();
                int reverse=0;
                int count=0;
            while(m!=0){
                int remainder = m%10;
                if(remainder==1){
                    reverse=(reverse*10)+remainder;
                }else{
                    count++;
                }
                m=m/10;
            }
            int power = (int)Math.pow(10, count);
            System.out.println(reverse*power); 
            System.out.println();   
        }
        sc.close();
    }
}

