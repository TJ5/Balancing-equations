package balancingEquations;

public class Element {
	public boolean balanced;
	
	public String chemSymbol;
	public Equation equation;
	public int count;
	public Compound compound;
	public boolean checkIfBalanced() {
		if (this.getNumberOf('l') == this.getNumberOf('r')) {
			this.balanced = true;
			return true;
		}
		return false;
		
	}
	public int getNumberOf(char side) {
		int total = 0;
		int sizeCompounds = equation.LCompounds.size();
		
		if (side == 'l') {
			for (int i = 0; i < equation.LCompounds.size(); i++) {
				int sizeElements = equation.LCompounds.get(i).elements.size();
				for (int x = 0; x < equation.LCompounds.get(i).elements.size(); x++) {
					if (this.equals(equation.LCompounds.get(i).elements.get(x))) {
						total += (equation.LCompounds.get(i).coefficient * equation.LCompounds.get(i).elements.get(x).count);
					}
				}
			}
		
		}
		else {
			for (int i = 0; i < equation.RCompounds.size(); i++) {
				for (int x = 0; x < equation.RCompounds.get(i).elements.size(); x++) {
					if (this.equals(equation.RCompounds.get(i).elements.get(x))) {
		
						total += (equation.RCompounds.get(i).coefficient * equation.RCompounds.get(i).elements.get(x).count);		
					}
				}
			}
		}
				
		return total;
	}
	
	public Element(String chemSymbol, Equation equation, Compound compound, int count) {
		
		this.chemSymbol = chemSymbol; 
		this.equation = equation;
		this.compound = compound;
		this.count = count;
		compound.elements.add(this);
		equation.elements.add(this);
		if (this.getNumberOf('l') == this.getNumberOf('r')) {
			this.balanced = true;
		}
		else {
			this.balanced = false;
		}
		
		
	}
	public boolean equals(Element element) {
		if (this.chemSymbol == element.chemSymbol) {
			return true;
		}
		return false;
	}
	
}
