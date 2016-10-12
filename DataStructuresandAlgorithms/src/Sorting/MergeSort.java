package Sorting;

public class MergeSort {
private int [] helper;
private int [] finalArray;

public MergeSort(int [] array){
	this.finalArray=array;
	this.helper=new int[array.length];
	mergeSort(0,array.length-1);
	
}

private void mergeSort(int start, int end) {
	if( start<end ){
		int mid=start+(end-start)/2;
		mergeSort(start,mid);
		mergeSort(mid+1,end);
		merge(start,mid,end);
		
	}
	
}

private void merge(int start, int mid, int end) {

for(int i=start; i<=end;i++){
	helper[i]=finalArray[i];
}

int i=start;
int j=mid+1;
int k=start;

while(i<=mid&&j<=end){
	if(helper[i]<=helper[j]){
		finalArray[i]=helper[i];
		i++;
	}
	else{
		finalArray[k]=helper[j];
		j++;
	}
	k++;
}

while(i<=mid){
	helper[k]=helper[i];
	k++;
	i++;
}
}

}
