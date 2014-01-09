package nodes;

import utilities.ConstantsUtils;

/**
 * Classe que representa o operador LOOP do diagrama de sequência.
 * 
 * @author Paulo Fernandes
 * @since 01/01/2014
 * 
 */
public class LoopOperator extends PredicateNode {

	/**
	 * Método constutor.
	 * 
	 * @param conditon - condição para chamar os filhos. 
	 * @param insideLoop - nodo que representa a operação realizada quando a condição é satisfeita.
	 * @param outsideLoop - nodo que representa a operação realizada quando a condição NÃO é satisfeita.
	 * 
	 */
	public LoopOperator(Integer nodeId, String conditon) {
		super(nodeId);
		this.name = "LOOP";
		this.condition = conditon;
	}
		
	public Node getNodeInsideLoop() {
		return getSon(ConstantsUtils.ZERO);
	}
	
	public Node getNodeOutsideLoop() {
		return getSon(ConstantsUtils.ONE);
	}
	
	@Override
	public void addSon(Node son) {
		this.listOfSons.add(son);
	}

	@Override
	protected Node getSon(Integer index) {
		return listOfSons.get(index);
	}

	@Override
	protected void allSonsWereVisited() {
		if (listOfSons.get(ConstantsUtils.ZERO).isVisited() && listOfSons.get(ConstantsUtils.ONE).isVisited()) {
			setVisited(Boolean.TRUE);
		}
	}
	
}
