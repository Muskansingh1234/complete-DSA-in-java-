package LinkedList;

public class Main {
  public static void main(String[] args) {
    
Singly l = new Singly();
l.insertfirst(45);
l.insertfirst(765);
l.insertlast(54);
l.display();
l.deletefirst();
l.display();
l.deletelast();
System.out.println();
l.display();
System.out.println();
l.delete(0);
l.display();
l.insertfirst(56);
l.insertfirst(78);
l.insert(678, 01);
System.out.println();
l.insertlast(7899);
l.display();
l.deletelast();
System.out.println();
l.display();
System.out.println();
l.insertlast(9888);
l.insert(222, 1);
l.delete(1);
l.display();
System.out.println();


// Doubly LinkedList:

Doubly d = new Doubly();

d.insertfirst(78);
d.insertlast(8);
d.insertfirst(789);
d.insert(657, 1);

d.display();
d.deletefirst();

d.delete(1);
System.out.println();
d.display();
d.deletelast();
System.out.println();
d.display();


// Circular Linkedlist : 

Circular c = new Circular();

c.insertfirst(45);
c.insertfirst(56);
c.display();






  }
}
