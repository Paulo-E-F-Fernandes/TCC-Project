package nodes;

import utilities.ConstantsUtils;

/**
 * Classe que representa o operador OPT do diagrama de sequ�ncia.
 * 
 * @author Paulo Fernandes
 * @since 27/12/2013
 * 
 */
public class OptOperator extends PredicateNode {
	
	/**
	 * M�todo constutor.
	 * 
	 * @param conditon - condi��o para chamar os filhos. 
	 * @param nodeOfConditionTrue - nodo que representa a opera��o realizada quando a condi��o � satisfeita.
	 * @param nodeOfConditionFalse - nodo que representa a opera��o realizada quando a condi��o N�O � satisfeita.
	 * 
	 */
	public OptOperator(Integer nodeId, String conditon) {
		super(nodeId);
		this.name = "OPT";
		this.condition = conditon;
	}
	
	public Node getNodeOfConditionTrue() {
		return getSon(ConstantsUtils.ZERO);
	}
	
	public Node getNodeOfConditionFalse() {
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
