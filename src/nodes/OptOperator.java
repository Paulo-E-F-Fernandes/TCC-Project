package nodes;

import utils.ConstantsUtils;

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
	public OptOperator(Integer nodeId, String conditon, Node nodeOfConditionTrue, Node nodeOfConditionFalse) {
		super(nodeId);
		this.name = "OPT";
		this.condition = conditon;
		
		if (nodeOfConditionTrue == null || nodeOfConditionFalse == null) {
			throw new IllegalArgumentException("O nodo " + name + " deve ter nodos filhos tanto para a condi��o verdadeira quanto para a condi��o falsa!");
		}
		
		listOfSons.add(nodeOfConditionTrue);
		listOfSons.add(nodeOfConditionFalse);
	}
		
	public Node getNodeOfConditionTrue() {
		return getSon(ConstantsUtils.ZERO);
	}
	
	public Node getNodeOfConditionFalse() {
		return getSon(ConstantsUtils.ONE);
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
