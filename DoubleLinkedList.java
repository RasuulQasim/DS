

public class DoubleLinkedList {
	
	DoubleNode head;
	DoubleNode tail;
	
	public DoubleLinkedList (DoubleNode n) {
		this.head=n;
		this.tail=n;
	}
	
	public void addLast(DoubleNode node) {
		node.previous=tail;
		tail.next=node;
		
		tail=node;
	}
	
	public void addFirst(DoubleNode node) {
		head.previous=node;
		node.next=head;
		head=node;
	}
	
	public void deleteFirst() {
		if(head.next!=null) {
		head=head.next;
		head.previous=null;	
		}
		else
			head.data="";
		
	}
	
	public void deleteLast() {
	/*	if(tail.previous==null) {
			
		}*/
		if(head.next==null) {
			tail.data="";
		}else {
		tail=tail.previous;
		tail.next=null;
		}
	}
	
	public void delete(String item) {
		DoubleNode h=head;
		if(item==head.data) {
			deleteFirst();
		
		}
		else
		while(h!=null) {
			if(h.data==item) {
				h.previous.next=h.next;
				break;
			}
			
			h=h.next;
			
			
		}
		if(h==null) {
			System.out.println("Item :"+item+" is Not Found");
		}
		
	
	}
	
	
	public String toString() {
		DoubleNode n=head;
		String str="";
		while(head!=null) {
			str+=head.data+" , ";
			head=head.next;
			
		}
		str="["+str.substring(0, str.length()-2)+"]";
		return str;
		
		
	}

}
