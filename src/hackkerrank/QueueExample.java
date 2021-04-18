package hackkerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

//Queue is an interface...it can be implemented using Priority Queue. 
//To add user-defined objects in PriorityQueue, you need to implement Comparable interface.OR you will get classCast exception
//String and Wrapper classes are Comparable by default. 

class BookClass implements Comparable<BookClass>{
	int isbn;
	String bname;
	String aname;
	String type;
	//constructor
	BookClass(int isbn, String bname, String aname, String type){
		this.isbn = isbn;
		this.bname = bname;
		this.aname = aname;
		this.type = type;
	}
	@Override
	public int compareTo(BookClass b) {
		if(this.isbn > b.isbn) return 1;
		else if(this.isbn < b.isbn) return -1;
		else return 0;
	}
}




public class QueueExample {

	public static void main(String[] args) {
		//simple example
		Queue pq = new PriorityQueue();
		pq.add(25);
		pq.add(50);
		pq.add(17);
		System.out.println(pq);//output [17,50,25]
		System.out.println(pq.peek());//output 17 as it's the hightest priority
		//System.out.println(pq.poll());
		pq.remove(); //removes 17 and the next highest priority is 25
		System.out.println(pq);//output [25,50]
		System.out.println("*************");
		
		//using priority queue to user defined class BookClass
		
		Queue<BookClass> bq = new PriorityQueue<BookClass>();
		bq.add(new BookClass(11234,"Wimpy Kid", "Jeff Kinney","Fiction"));
		bq.add(new BookClass(10456,"Harry Potter", "J.K.Rowling","Fiction")); 
		bq.add(new BookClass(13456,"Willy Wonka", "Ronald Dahl","Fiction"));
		bq.add(new BookClass(48567,"Cat in the Hat", "Dr. Seuss","Fiction"));
		bq.add(new BookClass(25678,"Hungry Caterpillar", "Eric Carle","Fiction"));
		
		//print priority queue using iterator
		System.out.println("Printing the books from Priority Queue");
		Iterator itr = bq.iterator();
		while(itr.hasNext()) {
			BookClass b = (BookClass)itr.next();
			System.out.println(b.isbn + "," + b.bname + "," + b.aname + "," + b.type);
		}
	}

}
