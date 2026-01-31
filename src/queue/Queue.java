package queue;

 public interface Queue{
	public int head();
	public void enqueue(int item);
	public int dequeue();
	public boolean isEmpty();
}
