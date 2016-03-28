import java.util.Iterator;
public class Queue<T> implements Iterable{

    Node first=null;
    Node last = null;
    public void enqueue(T item){
	Node oldLast = last;

	last = new Node();
	last.item = item;
	last.next = null;
	if(isEmpty())
	    first=last;
	else
	    oldLast.next = last;
    }

    public T dequeue(){
	T item = first.item;
	first = first.next;
	if(isEmpty())
	    last = null;
	return item;	
    }

    public boolean isEmpty(){
	return first == null;
    }

    private class Node{
	T item;
	Node next;
    }

    public Iterator<T> iterator() {
	return new ListIterator();
    }

    private class ListIterator implements Iterator<T>
    {
	private Node current = first;

	public boolean hasNext() { return current != null ; }
	public void remove() { }
	public T next(){
	    T item = current.item;
	    current = current.next;
	    return item;
	}
    }
}