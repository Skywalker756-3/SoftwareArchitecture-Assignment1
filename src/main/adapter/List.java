package adapter;

public interface List {

	int count(); // this returns the number of elements in list
	Object get(int index); // this one returns the object at the index in list
	Object first(); // returns first object in list
	Object last();  // returns last object in list
	boolean include(Object obj); // return true if the object is there
	void append(Object obj);     // append object to the end of the list
	void prepend(Object obj); // insert the object to the front 
	void delete(Object obj);  // deletes the object
	void deleteLast();  // deletes last element of the list
	void deleteFirst(); // deletes first element 
	void deleteAll();   // deletes all elements 

}
