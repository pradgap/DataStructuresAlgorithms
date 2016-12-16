package graphs;

import java.util.ArrayList;

public class RootToLeaf {
	public void printPath(Node root){
		ArrayList<Integer> list= new ArrayList<Integer>();
		printPath(root,list);

	}

	private void printPath(Node node, ArrayList<Integer> list){
		list.add(node.key);
		if(node.left==null && node.right==null){	// if(!node.hasChild())
			for(int w: list){
				System.out.print(w+" ");
			}
			System.out.println();			
		}
		else{
			if(node.left!=null){
				printPath(node.left,list);
			}
			if(node.right!=null){
				printPath(node.right,list);
			}			
		}
		list.remove(list.size()-1);
	}

}
