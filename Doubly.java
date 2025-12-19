package LinkedList;

public class Doubly {

private Node head;
int size;

Doubly(){

  this.size = 0;
}

public void insertfirst(int val){

Node node = new Node(val);

node.prev =null;
node.next = head;

if(head!=null){
head.prev = node;
}
head = node;
size++;

}

public void display(){

Node temp = head;

while(temp!=null){
System.out.print(temp.val + "<->");
temp = temp.next;
}
System.out.print("END");
}

public void insertlast(int val){

if(head==null){
  insertfirst(val);
  return;
}

Node node = new Node(val);
Node temp = head;

for(int i=0;i<size-1;i++){
temp = temp.next;
}

temp.next = node;
node.prev = temp;
node.next = null;
size++;

}


public void insert(int val,int index){

if(index==0){
  insertfirst(val);
  return;
}

if(index==size){
  insertlast(val);
  return;
}

Node node = new Node(val);
Node temp = head;

for(int i=0;i<index-1;i++){
temp = temp.next;
}
node.next = temp.next;
temp.next = node;
node.prev = temp;
node.next.prev = node;
size++;

}

public void deletefirst(){

if(head==null){
  head=null;
return;

}

head = head.next;
head.prev = null;
size--;

}

public void deletelast(){
if(size<=1){
  deletefirst();
  return;
}



Node temp = head;

while(temp.next.next!=null){
  temp = temp.next;
}

temp.next.prev = null;
temp.next = null;
size--;

}

public void delete(int index){

if(index==0){
  deletefirst();
  return;
}

if(index==size){
  deletelast();
  return;
}


Node temp = head;

for(int i=0;i<index-1;i++){
  temp = temp.next;
}

temp.next = temp.next.next;
size--;






}








private class Node{

  int val;
  Node next;
  Node prev;


  Node(int val){
    this.val = val;
  }

  Node(int val,Node next,Node prev){

this.val = val;
this.next = next;
this.prev = prev;

  }


}










}
