package queue;

public class ArrayQueue {

	private int capacity; // generelle Größe
	private int front;
	private int rear;
	private int[] queue;
	
	public ArrayQueue(int capacity) {
		this.front = 0;
		this.rear = 0;
		this.capacity = capacity;
		this.queue = new int [capacity];
		
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	public int[] getQueue() {
		return queue;
	}

	public void setQueue(int[] queue) {
		this.queue = queue;
	}
	
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(rear == capacity) {
			return true;
		}
		return false;
	}
	
	/**
	 * Fügt einen Eintrag in die Queue an vorderster stellle ein
	 * @param element
	 */
	public void enqueue(int element) {
		if(!isFull()) {
			queue[rear] = element;
			rear++;
		} else {
			System.out.println("Queue is full!");
		}
	}
	
	/**
	 * Nimmt den vordersten Eintrag aus der Queue
	 */
	public void dequeue() {
		if(!isEmpty()) {
			for(int i = 0; i < rear-1; i ++) {
				queue[i] = queue[i+1];
			}
			if(rear < capacity) {
				queue[rear] = 0;
			}
			rear --;
		} else {
			System.out.println("Queue is empty!");
		}
	}
	
	/**
	 * Überprüft ob die Methode voll ist und gibt den vordersten Eintrag dieser aus
	 * @return vorderster Eintrag
	 */
	public int front() {
		if(!isEmpty()) {
			return queue[front];
		}
		return -1; // keine saubere Lösung --> Exception Handling
	}
	
	/**
	 * Diese Methode gibt die einzelnen Einträge der Queue aus
	 */
	public void display() {
		if(!isEmpty()) {
			for(int i = 0; i < rear-1; i++) {
				System.out.println(queue[i]);
			}
		} else {
			System.out.println("Queue is empty!");
		}
	}
	
	public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.enqueue(60);

        System.out.println("Queue elements:");
        queue.display();

        queue.dequeue();
        queue.dequeue();

        System.out.println("Front element of the queue: " + queue.front());

        System.out.println("Queue elements after dequeuing:");
        queue.display();
    }
	
}
