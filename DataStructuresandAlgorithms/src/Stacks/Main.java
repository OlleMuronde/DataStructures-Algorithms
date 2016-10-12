package Stacks;

public class Main {
    
	public static void main(String[] args) throws Exception {
		LinkedList list =new LinkedList();
		list.push(2);
		list.push(18);
		list.push(22);
		list.push(30);
		
		System.out.println(list.pop());

		System.out.println(list.pop());

		System.out.println(list.pop());


		System.out.println(list.getSize());
		System.out.println(list.isEmpty());
		System.out.println(list.getTop());
		
		}
	

	}
