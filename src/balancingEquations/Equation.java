package balancingEquations;
import java.util.ArrayList;
public class Equation {
	public ArrayList<Compound> RCompounds = new ArrayList<Compound>();
	public ArrayList<Compound> LCompounds = new ArrayList<Compound>();
	public ArrayList<Element> elements = new ArrayList<Element>();
	public ArrayList<Compound> compounds = new ArrayList<Compound>();
	
	
	public void balance() {
		
		
		while (!(this.totalBalanced())) {
			for (int i = 0; i < elements.size(); i++) {
				
				if (elements.get(i).checkIfBalanced() == false) {
					int balanced = MathFunctions.lcm(elements.get(i).getNumberOf('l'), elements.get(i).getNumberOf('r'));
					int Rmultiplier = balanced / elements.get(i).getNumberOf('r');
					
					int Lmultiplier = balanced / elements.get(i).getNumberOf('l');
					ArrayList<Compound> Rresults = this.findCompounds('r', elements.get(i));
					ArrayList<Compound> Lresults = this.findCompounds('l', elements.get(i));
					
					for (int x = 0; x < Rresults.size(); x++) {
						Rresults.get(x).coefficient*=Rmultiplier;
						
						
						
						
					}
					for (int y = 0; y < Lresults.size(); y++) {
						Lresults.get(y).coefficient*=Lmultiplier;
						
					}
						
				}
			}
				
		}
		
			
			
	}
	
	public ArrayList<Compound> findCompounds(char side, Element element) {
		ArrayList<Compound> filteredcompounds = new ArrayList<Compound>();
		for (int i = 0; i < this.compounds.size(); i++) {
			if (this.compounds.get(i).side == side) {
				for (int x = 0; x < this.compounds.get(i).elements.size(); x++) {
					if (this.compounds.get(i).elements.get(x).equals(element)) {
						filteredcompounds.add(this.compounds.get(i));
					}
				}
			}
		}
		return filteredcompounds;
	}
	public boolean totalBalanced() {
		boolean balanced;
		for (int i = 0; i < this.elements.size(); i++) {
			if (this.elements.get(i).checkIfBalanced() == false) {
				return balanced = false;
			}
		}
		
		
		return balanced = true;
	}
}

