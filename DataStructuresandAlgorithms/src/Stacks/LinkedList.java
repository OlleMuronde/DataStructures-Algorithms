package Stacks;

public class LinkedList {

	private int length;
	private ListNode head_top;

	public LinkedList() {
		length = 0;
		head_top = null;

	}

	public void push(int value) {

		ListNode node = new ListNode(value);
		node.setNext(head_top);
		head_top = node;
		length++;

	}

	public int pop() throws Exception {
		if (head_top == null) {
			throw new Exception("Trying to pop of empty stack");
		}
		ListNode copyPtr = head_top;
		head_top = copyPtr.getNext();
		copyPtr.setNext(null);
		length--;
		return copyPtr.getValue();
	}

	public boolean isEmpty() {
		return (length == 0);

	}

	public int getSize() {
		return length;
	}

	public int getTop() {
		return head_top.getValue();
	}

}
