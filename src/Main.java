import javax.swing.JFrame;

public class Main {

	 public static void main(String[] args) {
	        
		 
		 		JFrame jframe = new JFrame();   //Usage of JFrame
		 		Schedule nathanSchedule = new Schedule();
		 		Schedule phillipSchedule = new Schedule();
		 		Schedule smaiylSchedule = new Schedule();
		 		nathanSchedule.addBlock('A', 'Y', 'S'); //S is for Science Building
		 		smaiylSchedule.addBlock('B', 'N', 'P'); //P is for Phillips Hall
		 		phillipSchedule.addBlock('C', 'Y', 'A'); //A is for Academy Building
		 		
		 		boolean k = true;
		 		boolean f = false;
		 	
		 		
		 		Student nathan = new Student(1, nathanSchedule, k);
		 		Student smaiyl = new Student(0, smaiylSchedule, k);
		 		Student phillip = new Student(3, phillipSchedule, f);
		 		
		 		
		 		
		 		
		 		
		 		
		 
		 
		 
		 
	    }
	
	
	
	
	
	
	
	
	
	
	
	
}