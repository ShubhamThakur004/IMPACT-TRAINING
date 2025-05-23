public class paraligram {
    public static void main(String[] args) {
        String str = "malayalam";
        int i=0;
        int j=str.length()-1;
        boolean Signal=false;
        while(i<=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
                Signal=true;
                continue;
            }else{
                Signal=false;
                break;
            } 
        }
        if(Signal){
            System.out.println("Palindrome String :" +str);
        }else{
            System.out.println("No Palindrome String " +str);
        }
    }
}
