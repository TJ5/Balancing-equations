package balancingEquations;
import java.util.Scanner;
public class MainBalancer {

	public static void main(String[] args) {
		test2();
		
		
	}
	public static void test1() {
		Equation equation = new Equation();
		Compound compound1 = new Compound('l', equation);
		Compound compound2 = new Compound('l', equation);
		Compound compound3 = new Compound('r', equation);
		
		Element Hydrogen1 = new Element("H", equation, compound1, 2);
		Element Oxygen1 = new Element("O", equation, compound2, 2);
		Element Hydrogen2 = new Element("H", equation, compound3, 2);
		Element Oxygen2 = new Element("O", equation, compound3, 1);
		
		
		equation.balance();
		System.out.println(compound1.coefficient);
		System.out.println(compound2.coefficient);
		System.out.println(compound3.coefficient);
	}
	public static void test2() {
		Equation equation = new Equation();
		Compound compound1 = new Compound('l', equation);
		Compound compound2 = new Compound('l', equation);
		Compound compound3 = new Compound('r', equation);
		Compound compound4 = new Compound('r', equation);
		
		Element Hydrogen1 = new Element("H", equation, compound1, 4);
		Element Carbon1 = new Element("C", equation, compound1, 1);
		Element Oxygen1 = new Element("O", equation, compound2, 2);
		Element Carbon2 = new Element("C", equation, compound3, 1);
		Element Oxygen2 = new Element("O", equation, compound3, 2);
		Element Hydrogen2 = new Element("H", equation, compound4, 1);
		Element Oxygen3 = new Element("O", equation, compound4, 2);
		
		equation.balance();
		System.out.println("Coefficients");
		System.out.println(compound1.coefficient);
		System.out.println(compound2.coefficient);
		System.out.println(compound3.coefficient);
		System.out.println(compound4.coefficient);
	}
}
