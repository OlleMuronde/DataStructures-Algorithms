package Queue;

public class Main {

	public static void main(String[] args) throws Exception {
		Queue q= new Queue(10);
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(7);
		q.enQueue(8);
		q.enQueue(9);
		q.enQueue(10);
 System.out.print(q.deQueue());
 System.out.print(q.deQueue());
 System.out.print(q.deQueue());
 System.out.print(q.deQueue());
 
	}

}
