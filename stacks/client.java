//import Stack;
import java.util.Iterator;
class client{
    public static void main(String args[]){
	System.out.println("stack example");
	Stack intStack = new Stack<String>();
	boolean flag = true;
	int count = 0;

	for(int i = 0; i < 10 ; i++){
	    intStack.push(Integer.toString(i));
	}

	for(int i = 0; i < 10 ; i++){
	    System.out.println(""+intStack.pop());
	}

	/*Stack myStack = new Stack<String>();
	myStack.push("this ");
	myStack.push("is ");
	myStack.push("my ");
	myStack.push("stack ");

	while(!myStack.isEmpty()){
	    System.out.println(myStack.pop());
	    }*/

	/*System.out.println("Queue example");
	Queue myQueue = new Queue<String>();
	myQueue.enqueue("this ");
	myQueue.enqueue("is ");
	myQueue.enqueue("my ");
	myQueue.enqueue("queue ");

	while(!myQueue.isEmpty()){
	    System.out.println(myQueue.dequeue());
	}

	System.out.println("Iterate on stack");
	
	Iterator it = myStack.iterator();
	while(it.hasNext()){
	    System.out.println("Stack = " + it.next());
	}

	Iterator it2 = myQueue.iterator();
	while(it2.hasNext()){
	    System.out.println("Queue = " + it2.next());
	}*/

    }
}