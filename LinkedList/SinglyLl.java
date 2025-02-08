import java.util.*;
import java.lang.*;
class SinglyLl{
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	Node head,tail;
	int size=0;
	Scanner sc = new Scanner(System.in);
	public void create(){
		int ch=1;
		while(ch!=0){
			System.out.print("Enter the data: ");
			int data=sc.nextInt();
			Node newNode = new Node(data);
			if(head==null){
				head=tail=newNode;
			}
			else{
				tail.next=newNode;
				tail=newNode;
			}
			System.out.print("Do u want to Continue(0,1): ");
			ch=sc.nextInt();
		}
	
	}

	
	
	//INSERTIONS	
	public void insertAtBeg(int data){
		Node newNode = new Node(data);
		if(head==null){
			head=newNode;
		}
		else{
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void insertAtEnd(int data){
		Node newNode = new Node(data);
		if(head==null){
			head=newNode;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}	
	}
	
	public void insertAtAnyPlace(){
		System.out.print("Enter the position where u want to enter the data: ");
		int pos=sc.nextInt();
		int i=1;
		Node temp=head;
		
		System.out.print("Enter the data: ");
		int data = sc.nextInt();
		if(pos==1){
			insertAtBeg(data);
		}
		else{
			while(i<pos-1){
				temp=temp.next;
				i++;
			}
			
			Node newNode = new Node(data);
			newNode.next=temp.next;
			temp.next=newNode;
		}		
	}
	
	
	
	//DELETIONS
	public void deleteAtBeg(){
		if(head==null){
			System.out.print("List is Empty");
		}
		
		else{
			head=head.next;
			size--;
		}
		
	}
	
	public void deleteAtEnd(){
		if(head==null){
			System.out.print("List is Empty");
			 
		}
		 
		else if(head.next==null){
			head=null;
			size--;
		}
		else{
			Node prev=head;
			Node temp=head.next;
			while(temp.next!=null){
					prev=temp;
					temp=temp.next;
			}
			if(temp==head){
				head=null;
			}
			else{
				prev.next=null;
			}
			size--;
		}
	}
	
	public void deleteAtAnyPlace(){
		System.out.print("Enter the position where u want to delete the data: ");
		int pos=sc.nextInt();
		int i=1;
		Node prev=head;
		Node temp=head.next;
		if(pos==1){
			deleteAtBeg();
		}
		else{
			while(i<pos-1){
				prev=temp;
				temp=temp.next;
				i++;
			}
			prev.next=temp.next;
			size--;
		}
	}
	
	
	public void deleteGivenData(int data){
		Node pre=null;
		Node current=head;
		while(current!=null){
			if(current.data==data){
				if(pre==null){
					head=current.next;
				}
				
				else{
					pre.next=current.next;
				}
				break;
			}
			
			else{
				pre=current;
				current=current.next;
			}
		}
	}
	
	
	
	public void display(){
		Node current=head;
		while(current!=null){ 
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println("\n");
	}
	
	
	public int getSize(){
		return size;
	}








}
