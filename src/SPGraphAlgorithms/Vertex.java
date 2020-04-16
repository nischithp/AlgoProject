package SPGraphAlgorithms;

import java.util.LinkedList;

public class Vertex {
	public LinkedList<Vertex> adj;
	public int data;
	public int color;//0=white, 1=gray, 2=black
	public int distance;//from start vertex
	public Vertex parent;
	public int discoveryTime;
	public int finishTime;
	public boolean extracted;
	
	public Vertex(int data){
		this.data=data;
		color=0;
		distance=-1;
		parent=null;
		adj = new LinkedList<>();
		discoveryTime=0;
		finishTime=0;
	}
}
