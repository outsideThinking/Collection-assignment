class Node{
int data;
Node next;
Node(int data){
this.data=data;
}
}
class linkedList{
Node head=null;
Node tail=null;
public void insertAtEnd(int val){
Node temp=new Node(val);
if(head==null){
head=temp;
tail=temp;
}
else{
tail.next=temp;
tail=temp;
}
}

public void insertAtBegining(int val){
Node temp=new Node(val);
if(head==null){
insertAtEnd(val);
}
else{
temp.next=head;
head=temp;
}
}

public void reverse(){
Node temp=head;
linkedList ll1=new linkedList();
while(temp!=null){
ll1.insertAtBegining(temp.data);
temp=temp.next;
}
this.head=ll1.head;
this.tail=ll1.tail;
}

public void display(){
Node temp=head;
while(temp!=null){
System.out.print(temp.data+" ");
temp=temp.next;
}
}
}
class Qn3ReverseLinkedList{
public static void main(String[] args){
linkedList ll=new linkedList();
ll.insertAtEnd(34);
ll.insertAtEnd(90);
ll.insertAtEnd(32);
ll.insertAtEnd(54);
ll.display();

System.out.println();
System.out.println("After reverse element ");
ll.reverse();
ll.display();
}
}