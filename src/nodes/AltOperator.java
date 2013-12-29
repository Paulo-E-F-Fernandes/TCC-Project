package nodes;

import utils.ConstantsUtils;

/**
 * Classe que representa o operador ALT do diagrama de sequência.
 * 
 * @author Paulo Fernandes
 * @since 26/12/2013
 * 
 */
public class AltOperator extends PredicateNode {
	
	/**
	 *
	 * Método construtor
	 * 
	 * @param nodeId - integer que identifica o nodo.
	 * @param conditon - condição para chamar os filhos.
	 * @param nodeIf - nodo que representa a operação realizada quando a condição é satisfeita.
	 * @param nodeElse - nodo que representa a operação realizada quando a condição NÃO é satisfeita. 
	 * 
	 */
	public AltOperator(Integer nodeId, String conditon, Node nodeIf, Node nodeElse) {
		super(nodeId);
		this.name = "ALT";
		this.condition = conditon;
		
		if (nodeIf == null) {
			throw new IllegalArgumentException("O operador " + name + " deve ter pelo menos o nodo filho da condição verdadeira!");
		}
		
		listOfSons.add(nodeIf);
		
		if (nodeElse != null) {
			listOfSons.add(nodeElse);
		}
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
