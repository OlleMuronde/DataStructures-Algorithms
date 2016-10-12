package Recap;

public class QuickSort {
    private int[] array;
	public QuickSort(int[]array){
		this.array=array;
		sort(array);
	}
public void sort( int [] array){
	int start=0;
	int end=array.length-1;
	quickSortAlgo(start,end,array);
	
}

private void quickSortAlgo(int start, int end, int[] array) {
	int leftPtr=start;
	int rightPtr=end;
	int pivot= array[start+(end-start)/2];
	
	while(leftPtr<=rightPtr){
		while(array[leftPtr]<pivot){
			leftPtr++;
		}
		while(array[rightPtr]>pivot){
			rightPtr--;
		}
		if(leftPtr<=rightPtr){
			swap(leftPtr,rightPtr);
			leftPtr++;
			rightPtr--;
			
		}
		
	}
	if(start<rightPtr){
		quickSortAlgo(start,rightPtr,array);	
	}
	if(leftPtr<end){
		quickSortAlgo(end,leftPtr,array);
	}
	for(int elem: array){
		System.out.println(elem);
	}
}

private void swap(int leftPtr, int rightPtr) {
	int temp=array[leftPtr];
	array[leftPtr]=array[rightPtr];
	array[rightPtr]=temp;
	
}

}
