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

public void middleElement(){
Node slow=head;
Node fast=head;
if(head==null){
System.out.println("Linked list is empty");
return;
}

while(fast!=null && fast.next!=null){
slow=slow.next;
fast=fast.next.next;
}
System.out.println("Middle element is: "+slow.data);
}

public void display(){
Node temp=head;
while(temp!=null){
System.out.print(temp.data+" ");
temp=temp.next;
}
}
}
class Qn1MiddleElement{
public static void main(String[] args){
linkedList ll=new linkedList();
ll.insertAtEnd(43);
ll.insertAtEnd(98);
ll.insertAtEnd(23);
ll.insertAtEnd(12);
ll.insertAtEnd(45);
ll.insertAtEnd(90);	
ll.display();

System.out.println();
ll.middleElement();

}
}