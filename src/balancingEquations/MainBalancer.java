package balancingEquations;
import java.util.Scanner;
public class MainBalancer {

	public static void main(String[] args) {
		test();
		
		
	}
	public static void test() {
		Element Carbon = new Element(1,1,"C");
		Element Hydrogen = new Element(4,2,"H");
		Element Oxygen = new Element(2,3,"O");
		Compound compound1 = new Compound('l');
		compound1.elements.add(Carbon);
		compound1.elements.add(Hydrogen);
		compound1.elements.add(Hydrogen);
		compound1.elements.add(Hydrogen);
		compound1.elements.add(Hydrogen);
		Compound compound2 = new Compound('l');
		compound2.elements.add(Oxygen);
		compound2.elements.add(Oxygen);
		Compound compound3 = new Compound('r');
		compound3.elements.add(Hydrogen);
		compound3.elements.add(Hydrogen);
		compound3.elements.add(Oxygen);
		Compound compound4 = new Compound('r');
		compound4.elements.add(Carbon);
		compound4.elements.add(Oxygen);
		compound4.elements.add(Oxygen);
		Element.balance();
		System.out.println(compound1.coefficient+","+compound2.coefficient+","+compound3.coefficient+","+compound4.coefficient );
	}
}
