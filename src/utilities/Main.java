package utilities;

import generator.GeneratorStrategy;
import generator.TestCase.ModelTestCase;
import graph.ControlFlowGraph;

import java.io.IOException;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		GeneratorStrategy generator;
		ControlFlowGraph controlFlowGraph = new ControlFlowGraph();
		
		String inputFileName = "model.uml";
		inputFileName = "in/" + inputFileName;
		
		Parser.loadXMI(inputFileName);

		Parser.runParser(inputFileName);

		Parser.getModel().printProp();
		
		generator = new ModelTestCase(Parser.getModel());
		generator.codeGenerator(null, 0);
		
	}
	
}// end class