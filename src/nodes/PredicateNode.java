package nodes;

public abstract class PredicateNode extends Node {
	
	protected String name;
	protected String condition;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public PredicateNode(Integer nodeId) {
		super(nodeId);
	}

}
