package nodes;

import utilities.ConstantsUtils;

/**
 * Classe que representa o operador LOOP do diagrama de sequ�ncia.
 * 
 * @author Paulo Fernandes
 * @since 01/01/2014
 * 
 */
public class LoopOperator extends PredicateNode {

	/**
	 * M�todo constutor.
	 * 
	 * @param conditon - condi��o para chamar os filhos. 
	 * @param insideLoop - nodo que representa a opera��o realizada quando a condi��o � satisfeita.
	 * @param outsideLoop - nodo que representa a opera��o realizada quando a condi��o N�O � satisfeita.
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
