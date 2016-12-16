
package graphs;
// This is iterative Pre-Order, In-Order and Post-Order Binary Tree Traversal
// Recursive is easy

import java.util.Stack;

public class TreeTraversal{
	public void PreOrder(Node root){
		Stack<Node> stack= new Stack<Node>();
		stack.push(root);
		Node node;
			
		while(!stack.isEmpty()){
			node=stack.pop();
			if(node.right!=null)
				stack.push(node.right);
			if(node.left!=null)
				stack.push(node.left);
			System.out.println(node.key);
		}
	}

	public void InOrder(Node root){
		Stack<Node> stack= new Stack<Node>();
		Stack<Node> stackNext= new Stack<Node>();
		stack.push(root);
		Node node;
		while(!stack.isEmpty() || !stackNext.isEmpty()){
			if(!stack.isEmpty()){
				node=stack.pop();				
				if(node.left!=null){
					stack.push(node.left);
					stackNext.push(node);
				}
				else{
					System.out.println(node.key);
					if(node.right!=null){						
						stack.push(node.right);
					}
						
				}
			}
			else{
				node=stackNext.pop();
				System.out.println(node.key);
				if(node.right!=null){
					stack.push(node.right);
				}
			}
		}
	}
}