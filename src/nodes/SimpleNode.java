package nodes;

import java.util.ArrayList;

public class SimpleNode extends Node {
	
	private String operation;

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	/**
	 * Método construtor
	 */
	public SimpleNode() {
		this.nodeId = 0;
		this.listOfSons = new ArrayList<Node>();
		this.visited = false;
		this.operation = null;
	}
}
