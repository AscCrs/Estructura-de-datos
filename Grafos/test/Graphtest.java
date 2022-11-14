// package test;

// public class Graphtest<T> {
//     Map<T, LinkedList<Edge<T>>> adyacencylist = new HashMap<>() ;
// 	boolean dirigido;
	
// 	//Constructor, Complejidad: Tiempo O(1) Escpacio O(1)
// 	public Graph () {
// 		dirigido = false; // 
// 	}
	
// 	//Constructor, Time O(1) Space O(1)
// 	public Graph(boolean d) {
// 		dirigido = d;
// 	}

//     //Add edges including adding nodes, Time O(1) Space O(1)
// 	public void addEdge(T a, T b, int w) {
// 		adyacencylist.putIfAbsent(a, new LinkedList<>()); //add node
// 		adyacencylist.putIfAbsent(b, new LinkedList<>()); //add node
// 		Edge<T> edge1 = new Edge<>(b, w);
// 		adyacencylist.get(a).add(edge1); //add edge
// 		if (!dirigido) { //undirected
// 			Edge<T> edge2 = new Edge<>(a, w);
// 			adyacencylist.get(b).add(edge2);
// 		}			
// 	}

//     //Find the edge between two nodes, Time O(n) Space O(1), n is number of neighbors 
// 	private Edge<T> findEdgeByVetex(T a, T b) {
// 		LinkedList<Edge<T>> ne = adyacencylist.get(a);
// 		for (Edge<T> edge: ne) {
// 			if (edge.verticeConectado.equals(b)) {
// 				return edge;
// 			}
// 		}
// 		return null;
// 	}
	
// 	//Remove direct connection between a and b, Time O(n) Space O(1)
// 	public void removeEdge(T a, T b) {
// 		LinkedList<Edge<T>> ne1 = adyacencylist.get(a);
// 		LinkedList<Edge<T>> ne2 = adyacencylist.get(b); 
// 		if (ne1 == null || ne2 == null)
// 			return;
// 		Edge<T> edge1 = findEdgeByVetex(a, b);
// 		ne1.remove(edge1);
// 		if (!dirigido)  {//undirected
// 			Edge<T> edge2 = findEdgeByVetex(b, a);
// 			ne2.remove(edge2);
// 		}
// 	}
	
// 	//Remove a node including all its edges, Time O(V) Space O(1), V is number of vertics in graph
// 	public void removeNode(T v) {		
// 		if (!dirigido) { //undirected
// 			LinkedList<Edge<T>> ne1 = adyacencylist.get(v);
// 			for (Edge<T> edge: ne1) {	
// 				Edge<T> edge1 = findEdgeByVetex(edge.verticeConectado, v);
// 				adyacencylist.get(edge.verticeConectado).remove(edge1);
// 			}
// 		} else { //directed
// 			for (T key: adyacencylist.keySet()) {
// 				Edge<T> edge2 = findEdgeByVetex(key, v);
// 				if (edge2 != null)
// 					adyacencylist.get(key).remove(edge2);
// 			}
// 		}
// 		adyacencylist.remove(v);
// 	}

//     //Check whether there is node by its key, Time O(1) Space O(1)
// 	public boolean hasNode(T key) {
// 		return adyacencylist.containsKey(key);
// 	}
	
// 	//Check whether there is direct connection between two nodes, Time O(n), Space O(1)
// 	public boolean hasEdge(T a, T b) {
// 		Edge<T> edge1 = findEdgeByVetex(a, b);
// 		if (dirigido) {//directed
// 			return edge1 != null;
// 		}
// 		else { //undirected or bi-directed
// 			Edge<T> edge2 = findEdgeByVetex(b, a);
// 			return edge1 != null && edge2!= null;
// 		}
// 	}

//     //Check there is path from src and dest
// 	//DFS, Time O(V+E), Space O(V)
// 	public boolean hasPathDFS(T src, T dest) {
// 		HashMap<T, Boolean> visited = new HashMap<>();
// 	    return dfsHelper(src, dest, visited);
// 	}
	 
// 	//DFS helper, Time O(V+E), Space O(V) 
// 	private boolean dfsHelper(T v, T dest, HashMap<T, Boolean> visited) {
// 		if (v == dest)
// 			return true;
// 	    visited.put(v, true);
// 	    for (Edge<T> edge : adyacencylist.get(v)) {
// 	    	T u = edge.verticeConectado;
// 	        if (visited.get(u) == null)
// 	            return dfsHelper(u, dest, visited);
// 	    }
// 	    return false;
// 	}

//     //Check there is path from src and dest
// 	//BFS, Time O(V+E), Space O(V), V is number of vertices, E is number of edges
// 	public boolean hasPathBFS(T src, T dest) {
// 		if (!hasNode(src) || !hasNode(dest))
// 			return false;
// 		HashMap<T, Boolean> visited = new HashMap<>(); 
// 		Queue<T> q = new LinkedList<>();
// 		visited.put(src, true);
//         q.offer(src);
//         while (!q.isEmpty()) {
//             T v = q.poll();
//             if (v == dest) {
//                 return true;
//             }
//             for (Edge<T> edge: adyacencylist.get(v)) {
// 	           T u = edge.verticeConectado;		           
// 	           if (visited.get(u) ==null) {
// 	        	   visited.put(u, true);
//                    q.offer(u);
//                }	            
//            }
//         }     
//         return false;
// 	}

//     //Print graph as hashmap, Time O(V+E), Space O(1)
// 	public void printGraph() {
// 		for (T key: adyacencylist.keySet()) {
// 			System.out.println(key + "," + adyacencylist.get(key));
// 		}	
// 	}
// }

// 
