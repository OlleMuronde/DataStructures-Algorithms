package Stacks;

public class ArrayStack {

	private int capacity;
	private static final int DEFAULT_CAPACITY=15;
	private int top=-1;
	private int[]stackArray;

	public ArrayStack(){
		stackArray= new int[DEFAULT_CAPACITY];
	}

	public ArrayStack(int capacity){

		this.capacity= capacity;
		stackArray=new int[capacity];
	}

	public int getSize(){
		return (top+1);
	}

	public boolean isEmpty(){
		return (top<0);
	}

	public int top()throws Exception{
		if(isEmpty()){
			throw new Exception("Stack is empty");
		}
		return stackArray[top];
	}

	public void push(int value) throws Exception{
		if(getSize()==this.capacity){
			throw new Exception("Stack is full dude!!");
		}
		top=top+1;
		System.out.println("top below");
		System.out.println(top);
		stackArray[top]=value;	
	}

	public int pop() throws Exception{
		if(isEmpty()){
			throw new Exception("Trying to pop of empty stack");
		}
		int data= stackArray[top];
		
		stackArray[top--]=Integer.MIN_VALUE;
		return data;
	}


}
