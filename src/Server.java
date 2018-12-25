import java.util.ArrayList;

public class Server {
	private ArrayList<Check> checks= new ArrayList<Check>();
//	responsibleStudents is an arrayList of students attending assembly
	private ArrayList<Student> responsibleStudents = new ArrayList<Student>();
//	absentees is an arrayList of students not attending assembly
	private ArrayList<Student> absentees= new ArrayList<Student>();
	
	public Server(ArrayList<Student> a, ArrayList<Student> d) {
		responsibleStudents = a;
		absentees = d;
	}
	
	private void reviewChecks() {
		if ((checks.size()*1.0) / responsibleStudents.size() > 0.2) {
			Alert a = new Alert(checks);
		}
	}
	
	public void pushCheck(Check c) {
		checks.add(c);
		reviewChecks();
	}
}