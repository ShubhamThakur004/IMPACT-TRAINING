import java.util.Scanner;
public class arraycom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of arr1");
        int s1=sc.nextInt();
        System.out.println("Enter a size of arr1");
        int s2=sc.nextInt();
        int arr1[]=new int[s1];
        int arr2[]=new int[s2];
        for(int i=0;i<s1;i++){
            int n = sc.nextInt();
            arr1[i]=n;
        }
        for(int i=0;i<s2;i++){
            int n = sc.nextInt();
            arr2[i]=n;
        }
        if(s1==s2){
            for(int i=0;i<s1 && i<s2;i++){
                if(arr2[i]>=arr1[i]){
                    continue;
                }else{
                    System.out.println("Not comparible");
                    break;
                }
            }
       }
        sc.close();

    }
}
