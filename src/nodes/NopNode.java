package nodes;

import java.util.ArrayList;

public class NopNode extends Node {

	private boolean isInitial;

	public boolean isInitial() {
		return isInitial;
	}

	public void setInitial(boolean isInitial) {
		this.isInitial = isInitial;
	}
	
	/**
	 * Método construtor
	 * 
	 * @param nodeId
	 * @param isInitial
	 * @param son
	 */
	public NopNode(int nodeId, boolean isInitial) {
		this.nodeId = nodeId;
		this.isInitial = isInitial;
		this.visited = false;
		this.listOfSons = new ArrayList<Node>();
	}
}
