package LinkedList;

public class Circular {
  
private Node head;
private Node tail;
int size;

Circular(){
  this.size = 0;
}

public void insertfirst(int val){

  Node node = new Node(val);

if(head==null){
head= node;
return;
}

node.next = head;
tail.next = node;
  head = node;


}


public void display(){
Node temp = head;
do{
System.out.println(temp.val + "->");
temp = temp.next;
}while(temp!=head);
System.out.println("END");
}










private class Node{

   Node next;
  int val;

  Node(int val){
    this.val =val;
  }

  Node(int val, Node next){

this.val = val;
this.next = next;

  }



}





}
