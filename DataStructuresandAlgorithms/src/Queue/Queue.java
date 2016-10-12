package Queue;

public class Queue {
	private int size,front,rear,capacity;
	private static final int DEFAULT_CAPACITY=16;
	private int[]array;

	public Queue(){
		array=new int[DEFAULT_CAPACITY];
	}

	public Queue(int capacity){
		this.capacity=capacity;
		array=new int[capacity];
	}

	public boolean isEmpty(){
		return(getSize()==0);
	}
	public boolean isFull(){
		return (getSize()==capacity);	
	}
	public int getSize(){
     return size;
	}

	public void enQueue(int value){
		if(isFull()){
		//	expand();
		}
	 size++;
	 array[(rear%capacity)]=value;
	 rear=(rear+1)%capacity;
	 
	}
	
	public int deQueue() throws Exception{
		if(isEmpty()){
			throw new Exception("Popping of empty queue");
			
		}
		size --;
		int data=array[(front%capacity)];
		array[front]=Integer.MIN_VALUE;
		front=(front+1)%capacity;
		return data;
	}
	

}
