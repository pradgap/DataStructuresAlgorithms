package graphs;

public class MirrorTree {
	
	public static void mirror(Node newNode, Node oldNode){
		newNode.key=oldNode.key;
		
		if(oldNode.left!=null){
			newNode.right= new Node();
			mirror(newNode.right,oldNode.left);
		}
		
		if(oldNode.right!=null){
			newNode.left=new Node();
			mirror(newNode.left,oldNode.right);
		}
	}

}
