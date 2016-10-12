package Stacks;

public class ArrayListStack {
	private int capacity;
	private int top=-1;
	private static final int DEFAULT_CAPACITY=16;
	private static int MIN_CAPACITY=1<<16;
	private int [] stackArrayList;


	public ArrayListStack(){
		stackArrayList=new int[DEFAULT_CAPACITY];
	}

	public ArrayListStack(int capacity){
		this.capacity=capacity;
		stackArrayList=new int[capacity];
	}


	public int getSize(){
		return (top+1);
	}

	public boolean isEmpty(){
		return (top<0);

	}

	public int getTop() throws Exception{
		if (isEmpty()){
			throw new Exception("Cant retrieve top stack is empty");

		}

		return stackArrayList[top];

	}


	public void push(int value){
		if(getSize()==capacity){
			 expand();
		}
		stackArrayList[++top]=value;
	}

	public int pop()throws Exception{
		if (isEmpty()){
			throw new Exception("Cannot pop of empty stack");
		}
		int data=stackArrayList[top];
		stackArrayList[top--]=Integer.MIN_VALUE;
		return data;
	}
	public void expand(){
		int length=getSize();
		int []newStack= new int[length<<1];
		System.arraycopy(stackArrayList, 0, newStack, 0, length);
		stackArrayList=newStack;
	}
}
