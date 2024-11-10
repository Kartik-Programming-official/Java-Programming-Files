import java.util.Scanner;
public class implementBinarysearch{
	int binarysearch(int array[],int element,int low,int high){
		while(low<=high){
			int mid=low+(high-low)/2;
			if(array[mid]==element){
				return mid;
			}else{
				high=mid-1;
				}
		}
		return 0;
	}
	public static void main(String[]args){
	implementBinarysearch obj=new implementBinarysearch();
	int [] array={3,4,5,6,7,8,9};
	int n=array.length;
	Scanner input=new Scanner(System.in);
	System.out.print("\n Enter Element to be Search:-");
	int element=input.nextInt();
	input.close();
	int result=obj.binarysearch(array,element,0,n-1);
	if(result==0){
		System.out.println("\n Element Not Found");
	}else{
		System.out.println("\n Element Found at index:- " +result);
	}
	}
}