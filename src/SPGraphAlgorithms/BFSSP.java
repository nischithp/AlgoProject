package SPGraphAlgorithms;

import java.util.LinkedList;
import java.util.Scanner;

public class BFSSP extends Graph {
	public BFSSP(int v) {
		super(v);
	}

	void BFS(int start){
		for(Vertex v: vertex){
			v.color=0;
			v.distance=-1;//if after BFS, distance=-1 --> unreachable
			v.parent=null;
		}
		LinkedList<Vertex> queue = new LinkedList<>();
		vertex[start].color=1;
		vertex[start].distance=0;
		queue.add(vertex[start]);
		while(!queue.isEmpty()){
			Vertex u = queue.removeFirst();
			for(Vertex v : u.adj){
				if(v.color==0){
					v.color=1;
					v.distance=u.distance+1;
					v.parent=u;
					queue.add(v);
				}
			}
			u.color=2;
		}
	}
	
	void printPath(int start, int end){
		System.out.print("Path from "+start+" to "+end+": ");
		BFS(start);
		print(start, end);
		System.out.println();
	}
	
	void print(int start, int end){
		if(end==start)
			System.out.print(start+" ");
		else if(vertex[end].parent==null)
			System.out.println("No path from "+start+" to "+end+" exists.");
		else {
			print(start,vertex[end].parent.data);
			System.out.print(end+" ")	;
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices :");
		int m = sc.nextInt();//no of edges
		BFSSP g = new BFSSP(m);
		System.out.println("Enter the connected edges:"); //Space seperated values
		for(int i = 0; i<m; i++){
			g.addEdge(sc.nextInt(), sc.nextInt());
		}
		System.out.println("Enter the 2 vertices to check the path from :");//Space seperated values
		int a= sc.nextInt();
		int b= sc.nextInt();
		g.printPath(a,b);
		sc.close();
	}
}

/* TEST DATA
BFSSP g = new BFSSP(5);
g.addEdge(0, 1);
g.addEdge(1, 2);
g.addEdge(2, 0);
g.addEdge(3, 3);
g.addEdge(4, 2);
g.printPath(1, 4);
*/