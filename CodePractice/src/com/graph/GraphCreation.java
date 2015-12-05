package com.graph;

import java.util.ArrayList;

/*

 - Graph() creates a new, empty graph.
 - addVertex(vert) adds an instance of Vertex to the graph.
 - addEdge(fromVert, toVert) Adds a new, directed edge to the graph that connects two vertices.
 - addEdge(fromVert, toVert, weight) Adds a new, weighted, directed edge to the graph that connects two vertices.
 - getVertex(vertKey) finds the vertex in the graph named vertKey.
 - getVertices() returns the list of all vertices in the graph.
 - in returns True for a statement of the form vertex in graph, if the given vertex is in the graph, False otherwise
 */

public class GraphCreation {

	public static void main(String[] args) {

		GraphNode graph = new GraphNode(4, 5, new Edge());
		//graph.edge[0]
	}
}


/* Let us create following weighted graph
10
0--------1
|  \     |
6|   5\   |15
|      \ |
2--------3
	4  
*/
class GraphNode {

	int vertic, NumberOfEdge;

	Edge edge;
	
	public GraphNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GraphNode(int vertic, int numberOfEdge, Edge edge) {
		super();
		this.vertic = vertic;
		NumberOfEdge = numberOfEdge;
		this.edge = edge;
	}

}

class Edge {
	int src, dst, wt;

	public Edge() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Edge(int src, int dst, int wt) {
		super();
		this.src = src;
		this.dst = dst;
		this.wt = wt;
	}

}