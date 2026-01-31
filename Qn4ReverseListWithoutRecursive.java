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
if(head==null || head.next==null){
return;
}
else{
Node previousNode=head;
Node currentNode=previousNode.next;
while(currentNode!=null){
Node nextNode=currentNode.next;
currentNode.next=previousNode;

previousNode=currentNode;
currentNode=nextNode;
}
head.next=null;
head=previousNode;
}
}

public void display(){
Node temp=head;
while(temp!=null){
System.out.print(temp.data+" ");
temp=temp.next;
}
System.out.println();
}
}
class Qn4ReverseListWithoutRecursive{
public static void main(String[] args){
linkedList ll=new linkedList();
ll.insertAtEnd(43);
ll.insertAtEnd(98);
ll.insertAtEnd(12);
ll.insertAtEnd(87);
ll.display();

ll.reverse();
ll.display();
}
}