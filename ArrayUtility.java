import java.util.Scanner;
public class ArrayUtility {
    public static int[] getArrayFromUser(){
        Scanner scanner = new Scanner(System.in);
        int size ;
        System.out.print("Please Enter Number Of Elements: ");
        size = scanner.nextInt();
        int[] arr = new int[size] ;

        int i = 0;
        while(i < size){
            System.out.print("Enter Your Element Number " + (i+1) + ": " );
            arr[i] = scanner.nextInt();
            i++;
        }
        return arr;
    }
}