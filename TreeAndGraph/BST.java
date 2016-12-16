package graphs;

public class BST {
	
	public static void main(String[] args){
		
		Node root = new Node(23);
		root.add(12);
		root.add(18);
		root.add(33);
		root.add(20);
		root.add(21);
		root.add(16);
		root.add(17);
		
//		DeepestNode dNode= new DeepestNode(root);
//		System.out.println(dNode.findDepth());
		
		Node node=LCA.LCAfind(root, 90, 21);
		System.out.println(node.key);
		
	}

}
