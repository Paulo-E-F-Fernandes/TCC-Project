package graph;

import java.util.Stack;

import nodes.Node;
import nodes.NopNode;
import utilities.ConstantsUtils;

public class ControlFlowGraph {
	
	private Node grafh;
	private Stack<Node> stackOfNextNodes;
	
	private Integer sequenceID = null;
	
	public ControlFlowGraph() {
		this.grafh = new NopNode(getNextId(), Boolean.TRUE);
		this.stackOfNextNodes = new Stack<Node>();
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
	
	public void push(Node nextNode) {
		this.stackOfNextNodes.push(nextNode);
	}
	
	public Node pop() {
		return stackOfNextNodes.pop();
	}

}
