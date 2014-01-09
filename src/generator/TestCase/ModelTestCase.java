package generator.TestCase;

import generator.GeneratorStrategy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

import model.Model;

public class ModelTestCase implements GeneratorStrategy {
	
	private Model model;
	private File dir;

	public ModelTestCase(Model model) {
		this.model = model;
	}

	@Override
	public void codeGenerator(BufferedWriter out, int tab) throws IOException {
		System.out.println("strategy model");
		
		dir = new File("out/" + model.getName());
		dir.mkdir();
		
		
		
/*
		System.out.println("strategy model");

		dir = new File("out/" + model.getName());
		dir.mkdir();
		for(Classe classe :  model.getListClasse()){
			generatorClasse = new ClasseAndroid(classe);
			generatorClasse.codeGenerator(out, tab);
		}
		
		for(Interface inter : model.getListInterface()){
			generatorInterface = new InterfaceAndroid(inter);
			generatorInterface.codeGenerator(out, tab);
		}		
*/		
	}

}
