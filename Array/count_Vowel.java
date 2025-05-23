import java.util.Scanner;
public class count_Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String :");
        String str = sc.nextLine();
        int count=0;
        // str=str.toLowerCase();
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='o'|| str.charAt(i)=='i' || str.charAt(i)=='u'){
        //         count++;
        //     }
        // }
        // if(count>0){
        //     System.out.println("Vowel  in :" + str + ":" + count);
        // }else{
        //     System.out.println("No Vowel  in "+str +":" + count);
        // }
        // sc.close();
    //    String vowel = "aeiouAEIOU";
    //    for (int i = 0; i < str.length(); i++) {
    //         char ch = str.charAt(i);
    //         if (vowel.indexOf(ch) != -1) {
    //             count++;
    //         }
    //     }

        if(count>0){
            System.out.println("Vowel  in :" + str + ":" + count);
        }else{
            System.out.println("No Vowel  in "+str +":" + count);
        }
        sc.close();
    }
}
