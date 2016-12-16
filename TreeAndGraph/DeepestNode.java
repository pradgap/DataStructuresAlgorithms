package graphs;

// ITERATIVE WAY
// Do level order traversal (BST), last node will be the deepest node ! 
// So, return the level of the last node

// RECURSIVE WAY
// Do DFS, return maximum_depth 
// max = Maximum(leftSubTree, rightSubTree)

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNode {
	
	Queue<Node> qNode= new LinkedList<Node>();
	Queue<Integer> qLevel = new LinkedList<Integer>();
	
	
	DeepestNode(Node node){
		qNode.add(node);
		qLevel.add(1);
	}
	
	public int findDepth(){
		Node node;
		int level=0;
		while(!qNode.isEmpty()){
			node= qNode.remove();
			level= qLevel.remove();
			level++;
			if (node.left!=null){
				qNode.add(node.left);
				qLevel.add(level);
			}
			if(node.right!=null){
				qNode.add(node.right);
				qLevel.add(level);
			}
		}	
		
		return --level;
	}
	
	

}
