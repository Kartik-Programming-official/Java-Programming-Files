import java.util.Scanner;
import java.util.Arrays;
public class Array_toString{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[] arr=new int[100];
        System.out.print("\n Enter Size of Array:-");
        int n=input.nextInt();
        System.out.print("\n Insert Array Element:-");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        Arrays.toString(arr);
        /*for(int i=0;i<n;i++){
            System.out.println("\n Array element:- " +(arr[i]));
    }*/
    System.out.println(arr);
}
}