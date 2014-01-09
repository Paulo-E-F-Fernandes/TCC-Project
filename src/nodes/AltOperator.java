package nodes;

import utilities.ConstantsUtils;

/**
 * Classe que representa o operador ALT do diagrama de sequ�ncia.
 * 
 * @author Paulo Fernandes
 * @since 26/12/2013
 * 
 */
public class AltOperator extends PredicateNode {
	
	private Node nextNode;
	
	/**
	 *
	 * M�todo construtor
	 * 
	 * @param nodeId - integer que identifica o nodo.
	 * @param conditon - condi��o para chamar os filhos.
	 * @param nodeIf - nodo que representa a opera��o realizada quando a condi��o � satisfeita.
	 * @param nodeElse - nodo que representa a opera��o realizada quando a condi��o N�O � satisfeita. 
	 * 
	 */
	public AltOperator(Integer nodeId, String conditon) {
		super(nodeId);
		this.name = "ALT";
		this.condition = conditon;
	}
	
	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
		
	public Node getIf() {
		return getSon(ConstantsUtils.ZERO);
	}
	
	public Node getElse() {
		if (numberOfSons().equals(ConstantsUtils.TWO)) {
			return getSon(ConstantsUtils.ONE);
		}
		else {
			return null;
		}
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
		if (listOfSons.get(ConstantsUtils.ZERO).isVisited()) {
			if (numberOfSons().equals(ConstantsUtils.TWO)) {
				if (listOfSons.get(ConstantsUtils.ONE).isVisited()) {
					setVisited(Boolean.TRUE);
				}
			}
			else {
				setVisited(Boolean.TRUE);
			}
		}
	}
	
}
