package Searching;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
     
    BinarySearch(array,8);
    
	}

	public static void BinarySearch(int array[], int target){
		BinarySearchAlgo(array,target,0,array.length-1);
	}
	
	public static int BinarySearchAlgo(int array[],int target,int start,int end){
		int mid =(start+end)/2;
		if(end<start){
			return-1;
		}
		if(target==array[mid]){
			System.out.println(target+" found");
			return target;
		}
		else if(target<array[mid])
		{
			BinarySearchAlgo (array,target,start,mid-1);
		}
		
		else{
			BinarySearchAlgo(array,target,mid+1,end);
		}

		return -1;
	
	}
}
