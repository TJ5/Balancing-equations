package balancingEquations;
import java.util.ArrayList;
public class Compound {
	public int coefficient;
	public char side;
	public Equation equation;
	public ArrayList<Element> elements = new ArrayList<Element>();
	
	
	public Compound(char side, Equation equation) {
		this.side = side;
		this.coefficient = 1;
		
		this.equation = equation;
		this.equation.compounds.add(this);
		if (side == 'l') {
			equation.LCompounds.add(this);
		}
		else {
			equation.RCompounds.add(this);
		}
	}
	
}
