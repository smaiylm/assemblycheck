public class Calendar {

	private int week;
	private int day;
	private int W1Tue = 1;
	private int W2Tue = 2;
	private int W1Fri = 3;
	private int W2Fri = 4;
  
	private int i;
	
	private char A = 'A';
	private char B = 'B';
	private char C = 'C';
	private char D = 'D';
	
	public Calendar(int w, int d) {
		week = w;
		day = d;
	}
	
	
	public char getBlock() {
		
		if (week == 1){
			if (day ==1)
				return A;
			else
				return C;
		}
		
		else {
			if (day == 1)
				return B;
			else
				return D;
		}
	}
	
	public void currentDay() {
		System.out.println("hi");
	}
	
}
