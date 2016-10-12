package LinkedList;

public class LinkedList {
private int length=0;
private ListNode head;

public LinkedList(){
	
}

public void addFirst(ListNode node){
 node.setNxtPtr(head);
 head=node;
 length++; 
}

public void addLast(ListNode node ){
if(head==null){
	
}

}


}

