

public class LevelTraversal{
	public void levelByLevel(Node root){
		Queue<Node> qNode= new LinkedList<Node>();
		Queue<Integer> qLevel = new LinkedList<Integer>();

		qNode.add(root);
		qLevel.add(1);

		Node node=new Node();
		int level;
		while(!qNode.isEmpty()){
			node=qNode.remove();
			level=qLevel.remove();
			System.out.print(node.key+" ");

			if(node.left!=null){
				qNode.add(node.left);
				qLevel.add(level+1);
			}
			if(node.right!=null){
				qNode.add(node.right);
				qLevel.add(level+1);
			}
			if(!qLevel.isEmpty() && qLevel.peek()>level)
				System.out.println();
		}

	}
}