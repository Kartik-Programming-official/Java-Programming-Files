import java.util.Scanner;
import java.util.Arrays;
public class Array_toString{
    public static void main(String[] args) {
        Scanner INPUT=new Scanner(System.in);

        int [] ARR=new int[100];
        System.out.print("\n Enter Size of Array:-");
        int n=INPUT.nextInt();
        System.out.print("Insert Array Element:-");
        for(int i=0;i<=n;i++){
            ARR[i]=INPUT.nextInt();
        }
        Arrays.toString(ARR);
        System.out.println("\t" +ARR);
    }
}