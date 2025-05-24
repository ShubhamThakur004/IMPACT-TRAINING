import java.util.Scanner;

public class TwoD_Array {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Row ");
    int row= sc.nextInt();
    System.out.println("Enter a Column ");
    int col= sc.nextInt();
    int arr[][] = new int[row][col];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    // tranpose matrix
    System.out.println("Matrix After Tranpose");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[j][i]+" ");
        }
        System.out.println();
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[j][i]+" ");
        }
        System.out.println();
    }
    sc.close();
 }   
}
