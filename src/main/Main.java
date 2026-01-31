package main;
import adapter.ArrayListAdapter;

import list.List;
import queue.FIFOQueue;
import queue.*;

public class Main {

	public static boolean arrayListAdapterTest()
	{
		/* This program will test the ArrayListAdapter and how it works an adapter
		 * pattern structure to allow this program to interface with the list object
		*/
		boolean result = false;
		try {
			//Test Instantiation
			ArrayListAdapter myList = new ArrayListAdapter();
			Object positionTestValue = "k";
			Object inclusionTestValue = 5;
			int inclusionPosition = 5;
			System.out.println("ArrayListAdapter Test Results:\n");
			
			//Check Class
			System.out.println("Class:" + myList.getClass());

			//Test Deletion in an empty list
			System.out.println("Deleting Empty Lists Test:");
			System.out.println("Initial List Count: " + myList.count());
			myList.deleteAll();
			myList.deleteFirst();
			myList.deleteLast();
			System.out.println("Post-deletion List Count: " + myList.count());
			if((int)myList.count() !=0)
			{
				throw new Exception("Deletion cause an unexpected count: "+myList.count());
			}
			
			//Test the get method on an empty list
			System.out.println("Testing the get method on empty List");
			myList.get(inclusionPosition); 
			//This can throw a bound error at the try block 
			
			
			//Fill up List for further tests
			System.out.print("List: ");
			for(int i=0; i<10; i++)
			{
				myList.append(i);
				System.out.print(myList.get(i));
			}
			System.out.println("\nRefilled List Count: " + myList.count());
			
			//Test the get method on a filled list
			if((int)myList.get(inclusionPosition) != (int)inclusionTestValue)
			{
				throw new Exception(".get() obtained: "+(int)myList.get(inclusionPosition)+" Expected: "+(int)inclusionTestValue);
			}
			
			//Test the first method
			if((int)myList.first() !=0)
			{
				throw new Exception("Unexpected first value obtained from .first()");
			}
			
			//Test the last method
			if((int)myList.last() !=9)
			{
				throw new Exception("Unexpected last value obtained from .first()");
			}
			
			//Test the include method
		/*	
			if(myList.include(inclusionTest))
			{
				throw new Exception(".include method, was not able to detect a value in the list");
			}
		*/
			//Test the prepend method
			myList.prepend(positionTestValue );
			if(myList.first().toString()!=positionTestValue.toString())
			{
				throw new Exception(".prepend method failed, expected "+
						positionTestValue .toString() +" got: " +myList.first().toString());
			}
			
			//Test the append method
			myList.append(positionTestValue );
			if(myList.last().toString()!=positionTestValue .toString())
			{
				throw new Exception(".append method failed, expected "+ positionTestValue .toString() +
						" got: " +myList.last().toString());
			}
			
			//Test Success
			result = true;
		}
		catch(Exception e){
			System.out.println("\nArrayListAdapter has failed testing:\n"+ e.getMessage());
		}
		finally {
			System.out.println("--------------------------------------\n\t\tTest Complete");
		}
		return result;
	}
	
	public static boolean testFIFO_Queue()
	{
		System.out.println("FIFO_QUEUE Test Results:\n");
		try {
			List myList = new ArrayListAdapter();
			Queue myQueue = new FIFOQueue(myList);
			for (int i = 0; i < 100; i++) {
				int n = (int) (Math.random() * 100);
				myQueue.enqueue(n);
				System.out.print(n + " ");
				}
			System.out.println("FIFO output:");
			while(! myQueue.isEmpty()) {
				int n = myQueue.head();
				System.out.print(n + " ");
				myQueue.dequeue();
				}
			}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// This program is split into two parts: ArrayListAdapter Test and FIFO

		//this holds the results of the tests for the summary
		boolean results [] = new boolean[2];
		results [0] = arrayListAdapterTest();
		results [1] = testFIFO_Queue();
		System.out.println("\nTest Summary");
		System.out.println("ArrayListAdapterTest: "+ results[0] );
		System.out.println("FIFO_QueueTest: "+ results[1] );

		System.out.println("\t\tEnd of Program");
	}

}
