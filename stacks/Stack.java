//package com.mylibs;
import java.util.Iterator;

public class Stack<T> implements Iterable<T>
{
    Node first = null;

    public boolean isEmpty(){
	return first == null;
    }

    void push(T item){
	Node oldFirst = first;
	Node n = new Node ();
	n.next = oldFirst;
	n.item = item;
	first = n;
    }

    public T pop(){
	T item = first.item;
	first = first.next;
	return item;
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