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

public void reverse(){
Node prev=null;
Node curr=head;
Node next=null;
while(curr!=null){
next=curr.next;
curr.next=prev;
prev=curr;
curr=next;
}
head=prev;
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
ll.reverse();
ll.display();
}
}