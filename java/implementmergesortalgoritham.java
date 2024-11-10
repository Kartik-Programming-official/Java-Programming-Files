import java.util.Arrays;
class implementmergesortalgoritham{
	void merge(int array[],int p,int q,int r){
		int n1=q-p+1;
		int n2=r-q;
		int L[]=new int [n1];
		int M[]=new int [n2];
		for(int i=0;i<n1;i++)
			L[i]=array[p+i];
		for(int j=0;j<n2;j++)
			M[j]=array[q+1+j];
		int i,j,k;
		i=0;
		j=0;
		k=p;
		while(i<n1&&j<n2){
			if(L[i]<=M[j]){
				array[k]=L[i];
				i++;
			}else{
				array[k]=M[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			array[k]=M[j];
			j++;
			k++;
		}
	}
	void Mergesort(int array[],int left,int right){
		if(left<right){
			int mid=(left+right)/2;
			Mergesort(array,left,mid);
			mergesort(array,mid+1,right);
			merge(array,left,mid,right);
		}
	}
	public static void main(String[]args){
		int [] array={6,5,12,10,9,1};
		implementmergesortalgoritham ob=new implementmergesortalgoritham();
		ob=mergesort(array,0,array.length-1);
		System.out.println("\n Sorted Array:-");
		System.out.println(Arrays.toString(array));
	}
}