package balancingEquations;
import java.util.ArrayList;
public class Compound {
	public int coefficient;
	public char side;
	
	public ArrayList<Element> elements = new ArrayList<Element>();
	public static ArrayList<Compound> compounds = new ArrayList<Compound>();
	
	public Compound(char side) {
		this.side = side;
		this.coefficient = 1;
		compounds.add(this);
	}
	public static ArrayList<Compound> findCompounds(char side, Element element) {
		ArrayList<Compound> filteredcompounds = new ArrayList<Compound>();
		for (int i = 0; i < compounds.size(); i++) {
			if (compounds.get(i).side == side) {
				for (int x = 0; x < compounds.get(i).elements.size(); x++) {
					if (compounds.get(i).elements.get(x).equals(element)) {
						filteredcompounds.add(compounds.get(i));
					}
				}
			}
		}
		return filteredcompounds;
	}
}
