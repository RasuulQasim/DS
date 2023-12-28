public class main {
	
	

	public static void main( String[] args) {
		
		DoubleNode dNode=new DoubleNode(null, "A", null);
		DoubleLinkedList dlist=new DoubleLinkedList(dNode);
		dlist.addFirst(new DoubleNode(null, "B", null));
		dlist.addFirst(new DoubleNode(null, "C", null));
		dlist.addFirst(new DoubleNode(null, "D", null));
		dlist.addFirst(new DoubleNode(null, "E", null));
		dlist.addFirst(new DoubleNode(null, "F", null));
		dlist.delete("n");
		dlist.addLast(new DoubleNode(null, "X", null));
		dlist.delete("B");
		dlist.addFirst(new DoubleNode(null, "T", null));
        dlist.delete("E");

        dlist.addFirst(new DoubleNode(null,"X",null));
        
		
		System.out.println(dlist.toString());

	}

}
