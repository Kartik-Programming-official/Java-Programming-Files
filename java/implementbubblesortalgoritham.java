import java.util.Arrays;
import java.util.Scanner;
public class implementbubblesortalgoritham{
	Scanner input=new Scanner(System.in);
	void bubblesort(int array[]){
		int size=array.length;
		System.out.println("\n choose sorting order.");
		System.out.println("\n 1 for Ascending.\n 2 for Descending.");
		int sortorder=input.nextInt();
		for(int i=0;i<size-1;i++)
			for(int j=0;j<size-i-1;j++)
				if(sortorder==1){
					if(array[j]>array[j+1]){
						int temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}else{
					if(array[j]<array[j+1]){
						int temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
	}
	public static void main(String[]args){
		int [] data={-2,45,0,11,-9};
		implementbubblesortalgoritham bs=new implementbubblesortalgoritham();
		bs.bubblesort(data);
		System.out.println("\n Sorted Array:- ");
		System.out.println(Arrays.toString(data));
	}
}