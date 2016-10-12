package Searching;

public class BinSearch {

	public static void BinarySearch(int array[], int target){
		BinarySearchAlgo(array,target,0,array.length-1);
	}
	
	public static int BinarySearchAlgo(int array[],int target,int start,int end){
		int mid =(start+end)/2;
		if(end<start){
			return-1;
		}
		if(target==array[mid]){
			return target;
		}
		else if(array[mid]<target)
		{
			BinarySearchAlgo (array,target,start,mid-1);
		}
		
		else{
			BinarySearchAlgo(array,target,mid+1,end);
		}
		System.out.println("Not Found !!!");
		return -1;
	
	}
}
