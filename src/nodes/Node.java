package nodes;

import java.util.ArrayList;

public abstract class Node {
	
	protected Integer nodeId;
	protected Boolean visited;
	protected ArrayList<Node> listOfSons;
	
	/* M�TODOS ABSTRATOS */
	/**
	 * Retorna o filho da lista de filhois da posi��o indicada por index
	 *  
	 * @param index - posi��o do filho na lista de filhos
	 * @return um node
	 * 
	 */
	protected abstract Node getSon(Integer index);
	/**
	 * Para que o nodo seja indicado como visitado, precisa que todos os filhos tenham sido visitados.
	 */
	protected abstract void allSonsWereVisited();
	
	/* M�TODOS CONSTRUTORES */
	public Node (Integer nodeID) {
		this.nodeId = nodeID;
		this.listOfSons = new ArrayList<Node>();
		this.visited = Boolean.FALSE;
	}
	
	public Node () {
		this.listOfSons = new ArrayList<Node>();
		this.visited = Boolean.FALSE;
	}
	
	/* M�TODOS CONCRETOS */
	public Integer getNodeId() {
		return nodeId;
	}
	
	public void setNodeId(Integer nodeId) {
		this.nodeId = nodeId;
	}
	
	public Boolean isVisited() {
		return visited;
	}
	
	public void setVisited(Boolean visited) {
		this.visited = visited;
	}
	
	/**
	 * Numero de filhos do nodo
	 * 
	 * @return numero de filhos do nodo
	 */
	public Integer numberOfSons() {
		return listOfSons.size();
	}
	
}
