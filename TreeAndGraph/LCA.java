package graphs;

// Finds Least Common Ancestor of Two nodes, provided those two nodes exists in Binary Tree

public class LCA {
	
	public static Node LCAfind(Node node, int p, int q){
		if(node==null){
			return null;
		}
		if(node.key==p ||node.key== q){
			return node;
		}
		
		Node leftNode=LCAfind(node.left,p,q);
		Node rightNode=LCAfind(node.right,p,q);
		
		if(leftNode!=null && rightNode!=null){
			return node;
			
		}
		
		if(leftNode!=null){
			return leftNode;
		}
		else{
			return rightNode;
		}
		
	}

}
