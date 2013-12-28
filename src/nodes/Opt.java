package nodes;

import java.util.ArrayList;

public class Opt extends PredicateNode {

	private ArrayList<Boolean> visited;
	
	public Opt(String conditon, Node nodeIf, Node nodeElse) {
		this.name = "OPT";
//		this.condition = conditon;
//		if (nodeIf != null) {
//			this.listOfSons = new ArrayList<Node>();
//			this.visited = new ArrayList<Boolean>();
//			this.listOfSons.add(nodeIf);
//			this.visited.add(false);
//			if (nodeElse != null) {
//				this.listOfSons.add(nodeElse);
//				this.visited.add(false);
//			}
//		}
//		else {
//			this.listOfSons = null;
//			this.visited = null;
//		}
	}
		
//	public Node getIf() {
//		if (this.listOfSons != null) {
//			this.visited.set(0, true);
//			return this.listOfSons.get(0);
//		}
//		else {
//			return null;
//		}
//	}
	
//	public Node getElse() {
//		if (this.listOfSons != null && this.listOfSons.size() == 2) {
//			this.visited.set(1, true);
//			return this.listOfSons.get(1);
//		}
//		else {
//			return null;
//		}
//	}
	
}
