//Class StringNode for implementing a double linked list
public class StringNode {

	StringNode next; //next pointer
	StringNode prev; //prev pointer
	String string; //this value
	
	//construcs a new StringNode
		public StringNode(String s) {
			this.string = s;
			next = null;
			prev = null;
		}
}
