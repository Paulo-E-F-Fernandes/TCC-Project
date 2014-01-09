package nodes;

import utilities.ConstantsUtils;

/**
 * Classe que representa os nodos simples, usados como chamadas de método, por exemplo.
 * 
 * @author Paulo Fernandes
 * @since 29/12/2013
 *
 */
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
	 * 
	 * @param nodeId
	 * @param operation
	 * @param son
	 */
	 
	public SimpleNode(Integer nodeId, String operation) {
		super(nodeId);
		this.operation = operation;
	}

	public void addSon(Node son) {
		this.listOfSons.add(son);
	}

	@Override
	protected Node getSon(Integer index) {
		return listOfSons.get(ConstantsUtils.ZERO);
	}

	@Override
	protected void allSonsWereVisited() {
		if (listOfSons.get(ConstantsUtils.ZERO).isVisited()) {
			setVisited(Boolean.TRUE);
		}
	}
}
