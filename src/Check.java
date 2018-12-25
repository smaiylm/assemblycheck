import java.util.*;
public class Check {
	private int type;
	private int condition;
  	private String[] states = new String[]{"AL", "AK", "AZ", "AR", "AA", "AE", "AP", "CA", "CO", "CT", "DE", "DC", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV","WI", "WY" };
  	private String[] dorms = new String[]{"Abbot", "Main St", "Kirtland", "Dow", "Amen", "Wentworth", "Webster", "Bancroft", "Moulton", "Wheelwright", "Merrill", "Soule", "Hoyt", "Will", "Gould", "Dunbar", "Browning", "Knight", "McConnell", "Cilley", "Peabody", "Ewald", "Day"};
	
	public Check(int t, int c) {
		type = t;
		condition = c;
	}
  
	public Check randCheck() {
		Random rand = new Random();
        Random randEl = new Random();
		int t = rand.nextInt(3);
        int c;
		if (t ==0)
        	c = randEl.nextInt(50);
		else if (t == 1)
			c = randEl.nextInt(23);
		else if (t == 2)
		
		return Check(t, c);
	}
  
}