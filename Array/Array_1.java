// return a  count of char in array
import java.util.Scanner;
public class Array_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = in.nextLine();
        System.out.println("Enter a Char");
        char value = in.next().charAt(0);
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==value){
                count++;
            }
        }
        if(count>0){
            System.out.println("Count of :"+ value +" :is :"+count);
        }else{
            System.out.println("Not Found :" + value);
        }
        in.close();
    }
}
