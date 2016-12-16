package graphs;

public class Node {	
	public int key;
	public Node left=null;
	public Node right=null;
	
	Node(){}
	Node(int key){
		this.key=key;
	}
	
	public void add(int key){			
			if(key<this.key){
				if(this.left==null){
					this.left= new Node(key);
					return;
				}
				this.left.add(key);
			}
			else if (key>this.key){
				if(this.right==null){
					this.right= new Node(key);
					return;
				}
				this.right.add(key);				
			}			
	}
	
	public static void DFS(Node node){
		if(node!=null){
			DFS(node.left);
			System.out.println(node.key);
			DFS(node.right);
		}
	}

}
