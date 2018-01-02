package balancingEquations;
import java.util.ArrayList;
public class Element {
	public boolean balanced;
	public int totalL;
	public int totalR;
	public String chemSymbol;
	public static ArrayList<Element> elements = new ArrayList<Element>();
	
	public boolean checkIfBalanced() {
		if (this.totalL == this.totalR) {
			this.balanced = true;
			return true;
		}
		return false;
		
	}
	public static boolean totalBalanced() {
		boolean balanced;
		for (int i = 0; i < Element.elements.size(); i++) {
			if (Element.elements.get(i).checkIfBalanced() == false) {
				return balanced = false;
			}
		}
		
		
		return balanced = true;
	}
	public Element(int totalL, int totalR, String chemSymbol) {
		this.totalL = totalL;
		this.totalR = totalR;
		this.chemSymbol = chemSymbol; 
		Element.elements.add(this);
		if (totalL == totalR) {
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
	public static void balance() {
		int placeholder = 0;
		System.out.println(!(Element.elements.get(placeholder).balanced));
		while (!(Element.totalBalanced())) {
			for (int i = 0; i < elements.size(); i++) {
				
				if (elements.get(i).checkIfBalanced() == false) {
					int balanced = MathFunctions.lcm(elements.get(i).totalL, elements.get(i).totalR);
					int Rmultiplier = balanced / elements.get(i).totalR;
					int Lmultiplier = balanced / elements.get(i).totalL;
					ArrayList<Compound> Rcompounds = Compound.findCompounds('r', elements.get(i));
					ArrayList<Compound> Lcompounds = Compound.findCompounds('l', elements.get(i));
					
					for (int x = 0; x < Rcompounds.size(); x++) {
						Rcompounds.get(x).coefficient*=Rmultiplier;
						elements.get(i).totalR*=Rmultiplier;
						System.out.println(Rcompounds.get(x).coefficient);
					}
					for (int y = 0; y < Lcompounds.size(); y++) {
						Lcompounds.get(y).coefficient*=Lmultiplier;
						elements.get(i).totalL*=Lmultiplier;
						System.out.println(Lcompounds.get(y).coefficient);
					}
				}
				
			}
			placeholder++;
		}
	}
}
