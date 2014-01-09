package nodes;

import utilities.ConstantsUtils;

/**
 * Classe de nodos vazios, para serem utilizados como nodo inicial ou nodo final.
 * 
 * @author Paulo Fernandes
 * @since 29/12/2013
 *
 */
public class NopNode extends Node {

	private Boolean isInitial;
		
	public Boolean getIsInitial() {
		return isInitial;
	}

	public void setIsInitial(Boolean isInitial) {
		this.isInitial = isInitial;
	}

	/**
	 * Método construtor
	 * 
	 * @param nodeId - ID do nodo
	 * @param isInitial - Boolean indicando se o nodo é inicial (true) ou final (false)
	 * @param son - nodo filho, existindo apenas quando o o nodo for inicial. Quando o nodo for final, filho deve ser null 
	 */
	public NopNode(Integer nodeId, Boolean isInitial) {
		super(nodeId);
		this.isInitial = isInitial;
	}
	
	/**
	 * @see Node#addSon(Node)
	 */
	@Override
	public void addSon(Node son) {
		this.listOfSons.add(son);
	}

	/**
	 * @see Node#getSon(Integer)
	 */
	@Override
	protected Node getSon(Integer index) {
		if (numberOfSons() > ConstantsUtils.ZERO) {
			return listOfSons.get(ConstantsUtils.ZERO);
		}
		else {
			return null;
		}
	}

	/**
	 * @see Node#allSonsWereVisited()
	 */
	@Override
	protected void allSonsWereVisited() {
		if (numberOfSons() > ConstantsUtils.ZERO && listOfSons.get(ConstantsUtils.ZERO).isVisited()) {
			setVisited(Boolean.TRUE);
		}
	}
}
