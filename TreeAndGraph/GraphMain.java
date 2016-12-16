package graphs;

public class GraphMain {

	public static void main(String[] args) {
	
		GraphAPI G= new GraphAPI(6);
		G.addEdge(2, 0);
		G.addEdge(2, 3);
		G.addEdge(2, 5);
		G.addEdge(5, 1);
		G.addEdge(5, 4);
	
//		G.DFSItr(2);
//		G.BFS(5);
		
		Node root= new Node(6);
		root.add(8);
		root.add(4);
		root.add(7);
		root.add(5);
		root.add(3);
		
		Node mNode= new Node();
		MirrorTree m= new MirrorTree();
		m.mirror(mNode, root);
		Node.DFS(mNode);
		
	
		
	}
	
	

}
