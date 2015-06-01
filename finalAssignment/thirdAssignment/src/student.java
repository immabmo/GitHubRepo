
public class student { //initialize students
	

	public String surname;
	public String givenNames;
	public String preferredNames;
	public int studentId;
	public String fullTime;
	public int mobile;
	public String loveJava;
	public String diploma;
	
	
	
	//student constructor
	student(String sName, String gNames, String pNames, int id, String ft, int mob, String lj, String dip ){ 
		this.studentId = id;
		this.surname = sName;
		this.givenNames = gNames;
		this.preferredNames = pNames;
		this.fullTime = ft;
		this.mobile = mob;
		this.loveJava = lj;
		this.diploma = dip;

	}

}
