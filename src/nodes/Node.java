package nodes;

import java.util.ArrayList;

public abstract class Node {
	
	protected int nodeId;
	protected ArrayList<Node> listOfSons;
	protected boolean visited;
	
	public int getNodeId() {
		return nodeId;
	}
	
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	
	public boolean isVisited() {
		return visited;
	}
	
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	/**
	 * Numero de filhos do nodo
	 * 
	 * @return numero de filhos do nodo
	 */
	public int numberOfSons() {
		return listOfSons.size();
	}
	
	/**
	 * Retorna o filho do nodo da posicao indicada
	 * 
	 * @param index
	 * @return o Node da posicao index
	 */
	public Node getSon(int index) {
		return listOfSons.get(index);
	}
	
	/**
	 * Adiciona filhos ao nodo
	 * @param son
	 */
	public void addSons(Node son) {
		this.listOfSons.add(son);
	}
}
