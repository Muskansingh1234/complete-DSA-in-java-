package LinkedList;

public class Singly {
  
private Node head;
private Node tail;
int size;

Singly(){
  this.size =0;
}

public void insertfirst(int val){


Node node = new Node(val);

if(tail==null){
  head =node;
  tail=head;
  
}

node.next = head;
head = node;
size++;


}

public void display(){

Node temp = head;
while(temp!=null){
  System.out.print(temp.val + "->");
temp = temp.next;
}

System.out.print("END");

}

public void insertlast(int val){
Node node = new Node(val);
if(head==null){
  head= node;
  tail= node;
  return;
}

Node temp = head;
for(int i=0;i<size-1;i++){
  temp = temp.next;
}

temp.next = node;
size++;








}

public void insert(int val,int index){

   if (index < 0 || index > size) {
        return;
    }


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
size++;


}


public void deletefirst(){

if(tail==null){
  head=null;
  return;
}

  head = head.next;
  size--;
}

public void deletelast(){

if(tail==null){
  deletefirst();
  return;
}

Node temp = head;

for(int i=0;i<size-2;i++){
temp = temp.next;

}

temp.next = null;
size--;


}

public void delete(int index){

if(index==0){
  deletefirst();
  return;
}

if(index==size){
  deletefirst();
  return;
}

Node temp = head;

for(int i=0;i<index-1;i++){
  temp = temp.next;
}

temp.next = temp.next.next;
size--;





}



private class  Node {

int val;
Node next;

Node(int val){
this.val = val;
}

Node(int val, Node next){

this.val = val;
this.next = next;

}


  
}




















}
