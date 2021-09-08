package datastructurelinklist.com;

public class UC3CreateQueue {
	
	int queue[] = new int[3];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		queue[rear] = data;
		rear = rear + 1;
		size = size + 1;
	}
	
	public void deQueue(int data) {
		queue[front] = data;
		front = front - 1;
		size = size - 1;
	}
	/*
	 * @purpose: insert the element using enqueue method
	 * @return:No return value
	 * @input: element 56 , 30, 70.
	 * @output: insert  this element using enqueue method 
     */
	
	 public void show() {
		 for(int i=0;i<size;i++) {
			 System.out.println(queue[i] + " ");
		 }
    }
			 
	 public static void main(String args[]) {
		 
		 UC3CreateQueue queue = new UC3CreateQueue();
		 
		 queue.enQueue(56);
		 queue.enQueue(30);
		 queue.enQueue(70);
		 
		 queue.show();
      }
}



