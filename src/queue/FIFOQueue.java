package queue;
import list.List;
/*
 * This is a abstraction in the bridge pattern between Queue and List
 * It's the abstraction because it's does not hold much functional responsibility
 * FIFO is an abstract concrete class.
 */
public class FIFOQueue implements Queue {
	protected List list;
	
	//Constructor to make the abstraction instances
	public FIFOQueue()
	{
		
	}
	public FIFOQueue(List list)
	{
		this.list = list;
	}
	
	@Override
	public int head()
	{ //This returns the first element in the list 
		return (int)list.first();
	}
	@Override
	public void enqueue(int item)
	{
		//This adds the item to the start of the list
		list.prepend(item);
	}
	
	@Override
	public int dequeue()
	{//This removes the item at the end of the list and returns that item
		if(this.isEmpty()==true)
		{ //Throw an exception if trying to dequeue an empty queue
			throw new ArrayIndexOutOfBoundsException("Cannot dequeue an empty list");
		}
		
		//placehold and delete last element
		int temp = (int)list.last();
		list.deleteLast();
		return temp;
	}
	
	@Override
	public boolean isEmpty()
	{// if the queue is empty then return true, otherwise false
		if(list.count()<=0)
		{
			return true;
		}
		return false;
	}

}
