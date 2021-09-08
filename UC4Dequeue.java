package datastructurelinklist.com;

public class UC4Dequeue {
	
	int queue[] = new int[3];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		queue[rear] = data;
		rear = rear + 1;
		size = size + 1;
	}
	
	public void deQueue() {
		
		int data = queue[front] ;
		front = front + 1;
		size = size - 1;
	}
	/*
	 * @purpose: remove the element using dequeue method
	 * @return:No return value
	 * @input: element 56 , 30,70.
	 * @output: remove element one by one
	 * 
	 */
	
	 public void show() {
		 System.out.println("Element:");
		 for(int i=0;i<size;i++) {
			 System.out.println(queue[front + i ] + " ");
		 }
    }
			 
	 public static void main(String args[]) {
		 
		 UC4Dequeue queue = new UC4Dequeue();
		 
		 queue.enQueue(56);
		 queue.enQueue(30);
		 queue.enQueue(70);
		 
		 queue.deQueue();
		 queue.deQueue();
		 
		 queue.show();
		 }
}





