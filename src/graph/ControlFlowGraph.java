package graph;

import utils.ConstantsUtils;
import nodes.Node;
import nodes.NopNode;

public class ControlFlowGraph {
	
	private Node grafh;
	
	private Integer sequenceID = null;
	
	public ControlFlowGraph () {
		this.grafh = new NopNode(getNextId(), Boolean.TRUE);
	}
	
	public Node getGrafh() {
		return grafh;
	}
	
	public Integer getNextId() {
		if (sequenceID != null) {
			sequenceID = sequenceID + ConstantsUtils.ONE;
		}
		else {
			sequenceID = ConstantsUtils.ZERO;
		}
		return sequenceID;
	}

}
