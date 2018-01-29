package balancingEquations;
import java.util.Scanner;
public class MainBalancer {

	public static void main(String[] args) {
		test5();
		
		
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
		Element Hydrogen2 = new Element("H", equation, compound4, 2);
		Element Oxygen3 = new Element("O", equation, compound4, 1);
		
		equation.balance();
		System.out.println("Coefficients");
		System.out.println(compound1.coefficient);
		System.out.println(compound2.coefficient);
		System.out.println(compound3.coefficient);
		System.out.println(compound4.coefficient);
	}
	public static void test3() {
		Equation equation = new Equation();
		Compound compound1 = new Compound('l', equation);
		Compound compound2 = new Compound('r', equation);
		Compound compound3 = new Compound('r', equation);
		
		Element Sodium1 = new Element("Na", equation, compound1, 1);
		Element Hydrogen1 = new Element("H", equation, compound1, 2);
		Element Phosphorus1 = new Element("P", equation, compound1, 1);
		Element Oxygen1 = new Element("O", equation, compound1, 4);
		Element Sodium2 = new Element("Na", equation, compound2, 1);
		Element Phosphorus2 = new Element("P", equation, compound2, 1);
		Element Oxygen2 = new Element("O", equation, compound2, 3);
		Element Hydrogen2 = new Element("H", equation, compound3, 2);
		Element Oxygen3 = new Element("O", equation, compound3, 1);
		
		equation.balance();
		System.out.println("Coefficients");
		System.out.println(compound1.coefficient);
		System.out.println(compound2.coefficient);
		System.out.println(compound3.coefficient);
		
		
	}
	public static void test4() {
		Equation equation = new Equation();
		Compound compound1 = new Compound('l', equation);
		Compound compound2 = new Compound('l', equation);
		Compound compound3 = new Compound('r', equation);
		Compound compound4 = new Compound('r', equation);
		
		Element Hydrogen1 = new Element("H", equation, compound1, 2);
		Element Sulfur1 = new Element("S", equation, compound1, 1);
		Element Chlorine1 = new Element("Cl", equation, compound2, 2);
		Element Sulfur2 = new Element("S", equation, compound3, 8);
		Element Hydrogen2 = new Element("H", equation, compound4, 1);
		Element Chlorine2 = new Element("Cl", equation, compound4, 1);
		
		equation.balance();
		System.out.println(compound1.coefficient);
		System.out.println(compound2.coefficient);
		System.out.println(compound3.coefficient);
		System.out.println(compound4.coefficient);
	}
	public static void test5() {
		Equation equation = new Equation();
		Compound compound1 = new Compound('l', equation);
		Compound compound2 = new Compound('l', equation);
		Compound compound3 = new Compound('l', equation);
		Compound compound4 = new Compound('r', equation);
		Compound compound5 = new Compound('r', equation);
		Compound compound6 = new Compound('r', equation);
		Compound compound7 = new Compound('r', equation);
		Compound compound8 = new Compound('r', equation);
		Compound compound9 = new Compound('r', equation);
		
		Element K1 = new Element("K", equation, compound1, 4);
		Element Fe1 = new Element("Fe", equation, compound1, 1);
		Element S1 = new Element("S", equation, compound1, 6);
		Element C1 = new Element("C", equation, compound1, 6);
		Element N1 = new Element("N", equation, compound1, 6);
		
		Element K2 = new Element("K", equation, compound2, 2);
		Element Cr1 = new Element("Cr", equation, compound2, 2);
		Element O1 = new Element("O", equation, compound2, 7);
		
		Element H1 = new Element("H", equation, compound3, 2);
		Element S2 = new Element("S", equation, compound3, 1);
		Element O2 = new Element("O", equation, compound3, 4);
		
		Element Fe2 = new Element("Fe", equation, compound4, 2);
		Element S3 = new Element("S", equation, compound4, 3);
		Element O3 = new Element("O", equation, compound4, 12);
		
		Element Cr2 = new Element("Cr", equation, compound5, 2);
		Element S4 = new Element("S", equation, compound5, 3);
		Element O4 = new Element("O", equation, compound5, 12);
		
		Element C2 = new Element("C", equation, compound6, 1);
		Element O5 = new Element("O", equation, compound6, 2);
		
		Element H2 = new Element("H", equation, compound7, 2);
		Element O6 = new Element("O", equation, compound7, 1);
		
		Element K3 = new Element("K", equation, compound8, 2);
		Element S6 = new Element("S", equation, compound8, 1);
		Element O7 = new Element("O", equation, compound8, 4);
		
		Element K4 = new Element("K", equation, compound9, 1);
		Element N2 = new Element("N", equation, compound9, 1);
		Element O8 = new Element("O", equation, compound9, 3);

		equation.balance();
		System.out.println("Coefficients:");
		System.out.println(compound1.coefficient);
		System.out.println(compound2.coefficient);
		System.out.println(compound3.coefficient);
		System.out.println(compound4.coefficient);
		System.out.println(compound5.coefficient);
		System.out.println(compound6.coefficient);
		System.out.println(compound7.coefficient);
		System.out.println(compound8.coefficient);
		System.out.println(compound9.coefficient);










		




 
		
	}
}
