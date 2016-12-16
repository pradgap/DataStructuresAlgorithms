package graphs;

import java.util.Queue;
import java.util.LinkedList;

public class DeleteNode {
	
	Queue<Node> qNode= new LinkedList<Node>();
	
	public boolean delete(Node root, int key){
		qNode.add(root);
		Node node;
		
		while(!qNode.isEmpty()){
			node=qNode.remove();
			if(node.key==key){
				if(node.left!=null){}
//					Node nNode=findSmall(node);
			}
		}		
		return true;		
	}
	
	public Node findSmall(Node node){
		while(node.right!=null){
			
		}
		return new Node();
		
	}

}
