package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphAPI {
	private int V;
	
	private LinkedList<Integer>[] array;
	private boolean marked[];
	
	GraphAPI(int V){
		this.V= V;
		array= (LinkedList<Integer>[]) new LinkedList[V];
		marked= new boolean[V];
		for(int i=0; i<V; i++){
			array[i]= new LinkedList<Integer>();
		}		
	}
	public void addEdge(int v, int w){
		array[v].add(w);
		array[w].add(v);
	}
	
	public Iterable<Integer> adj(int v){
		return array[v];
	}
	
	public int getV(){
		return this.V;
	}
	
// Depth First Search of Graph to print all the elements reachable from the given vertex	
	public void DFS(int v){
		marked[v]=true;
		for(int w: adj(v)){
			if(!marked[w]){
				System.out.println(w);
				DFS(w);				
			}
		}		
	}
	
	public void DFSItr(int vertex)
	{
		for(int i=0;i<this.V; i++){
			marked[i]=false;
		}
		
		Stack<Integer> stack= new Stack<Integer>();
		stack.push(vertex);
		int v;
		while(!stack.isEmpty()){
			v= stack.pop();
			marked[v]=true;
			System.out.println(v);
			
			for(int w: array[v]){
				if(!marked[w]){
					stack.push(w);
				}
			}
		}
		
	}
// Breadth First Search of Graph
	
	public void BFS(int vertex){
		Queue<Integer> q= new LinkedList<Integer>();
		
		for(int i=0;i<this.V; i++){
			marked[i]=false;
		}
		q.add(vertex);		
		int v;
		
		while(!q.isEmpty()){
			v=q.remove();
			marked[v]=true;
			System.out.println(v);
			
			for(int w: array[v]){
				if(!marked[w]){
					q.add(w);
				}					
			}			
		}
		
	}
	
	

}
