package SPGraphAlgorithms;

import java.util.*;
import java.lang.*;
import java.io.*;


public class BellmanFordSP
{
    int numberOfVertices, numberofEdges;

    BellmanFordSP(int vertices, int edges)
    {
         int i ;

        numberOfVertices = vertices;
        numberofEdges = edges;

        edge = new Edge[edges];

        for (i=0; i<edges; i++)

            edge[i] = new Edge();
    }


    class Edge
    {
        private int source;
        private int destination;
        private int weight;

        Edge()
        {
            source = 0;
            destination = 0;
            weight = 0;
        }
    };



    Edge[] edge = new Edge[0];


    void bellmanFord(BellmanFordSP graph,int source)
    {
        int vertex = graph.numberOfVertices;
        int edges = graph.numberofEdges;
        int distance[] = new int[numberOfVertices];


        for (int i=0; i<numberOfVertices; i++)
            distance[i] = Integer.MAX_VALUE; // taking it as infinite
        distance[source] = 0;


        for (int i=1; i<numberOfVertices; i++)
        {
            for (int j=0; j<numberofEdges; j++)
            {
                int u = graph.edge[j].source;
                int v = graph.edge[j].destination;
                int weight = graph.edge[j].weight;

                if ( distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v] )

                    distance[v] = distance[u] + weight;

            }
        }


        for (int j=0; j < numberofEdges; j++)
        {
            int u = graph.edge[j].source;
            int v = graph.edge[j].destination;
            int weight = graph.edge[j].weight;

            if (distance[u] != Integer.MAX_VALUE && distance[u]+weight < distance[v])

                System.out.println("There is negative weight cycle in graph");
        }
        print(distance, numberOfVertices);
    }


    void print(int dist[], int V)
    {
        System.out.println("Vertex   Distance from Source");
        for (int i=0; i<V; ++i)
            System.out.println(i+"\t\t"+dist[i]);
    }


        public static void main(String [] args)
        {
        	
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the number of vertices :");
    		int n = sc.nextInt();//no vertex
    		System.out.println("Enter the number of edges :");
    		int m = sc.nextInt();//no of edges
    		BellmanFordSP graph = new BellmanFordSP(n, m);
    		System.out.println("Enter the connected edges:"); //Space seperated values
    		for(int i = 0; i<m; i++){
                graph.edge[i].source = sc.nextInt();
                graph.edge[i].destination =sc.nextInt();
                graph.edge[i].weight = sc.nextInt();
    		}
    		
    		graph.bellmanFord(graph,0);
    		sc.close();
        }
}

/* TEST DATA
int V = 5; // Number of vertices in graph 
int E = 8; // Number of edges in graph 

// Every edge has three values (u, v, w) where 
// the edge is from vertex u to v. And weight 
// of the edge is w. 
int graph[][3] = { { 0, 1, -1 }, { 0, 2, 4 }, 
                   { 1, 2, 3 }, { 1, 3, 2 },  
                   { 1, 4, 2 }, { 3, 2, 5 },  
                   { 3, 1, 1 }, { 4, 3, -3 } }; 
*/