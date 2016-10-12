package Stacks;

public class Stack {
	private int capacity;
	private int top=-1;
	private static final int DEFAULT_CAPACITY=15;
	private int[] stackArray;
	
	public Stack(){
		stackArray=new int[DEFAULT_CAPACITY];
	}
	public Stack(int capacity){
		this.capacity=capacity;
		stackArray=new int[capacity];
	}
	
	public int getSize(){
		return (top+1);
	}
	
	public boolean isEmpty(){
		return (top<0);
	}
	
	public int getTop() throws Exception{
		if(isEmpty()){
			throw new Exception("stack is empty");	
		}
		return stackArray[top];
		
	}
	
	public void push (int value){
		if(getSize()==capacity){
			expand();
		}
		stackArray[++top]=value;
	}
	
	public int pop()throws Exception{
		if (isEmpty()){
			throw new Exception("Popping from Empty Stack");
		}
	
		int data= stackArray[top];
		stackArray[top--]=Integer.MIN_VALUE;
		return data;
	}
	
	public void expand(){
	 int length=getSize();
	 int[]copyArray= new int[length<<1];
	 System.arraycopy(stackArray, 0, copyArray, 0, length);
	 stackArray=copyArray;

	}
	
	
	
}
