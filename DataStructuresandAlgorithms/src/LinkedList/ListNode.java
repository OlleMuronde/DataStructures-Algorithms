package LinkedList;

public class ListNode {

	private int data;
	private ListNode next;

	public ListNode(int data) {
		this.data = data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setNxtPtr(ListNode node) {
		next = node;
	}

	public int getData() {
		return data;
	}
	public ListNode getNxtPointer() {
		return next;
	}

}
