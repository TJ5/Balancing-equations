package balancingEquations;
import java.lang.Math;


public class MathFunctions {
	public static int lcm(int numberone, int numbertwo) {
	int lcm = 1;
	int large = Math.max(numberone, numbertwo);
	int small = Math.min(numberone, numbertwo);
	
	int multiplier = 1;
	while (true) {
		lcm=large*multiplier;
		if (lcm % small == 0) {
			break;
		}
		multiplier++;
	}
	return lcm;
	}
}
