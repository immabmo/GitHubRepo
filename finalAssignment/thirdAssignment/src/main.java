import java.io.IOException;
import java.util.Scanner;


public class main {
	
	static String[][] information; //initializing multidimensional array

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		bubbleSort method = new bubbleSort(); //initialize bubbleSort class
		Scanner scan = new Scanner(System.in); //initialize scanner for user input
		fileOptions read = new fileOptions(); //initialize fileOptions class
			
		
				try {
			information = read.readText(); //read from students file
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
student[] studentChecker = new student[information.length]; //assigning returned values to newly made array, in order to choose which parts to access and how to display
for(int count = 0; count < information.length; count++) { //or get student info and chop it into parts so you can easy manipulate parts of the data
		student bucky = new student(information[count][0], //lastname
									information[count][1], //givenNames
									information[count][2], //prefferedName
									Integer.parseInt(information[count][3]), //studentID // need to change int to String
									information[count][4], //lovesJava
									Integer.parseInt(information[count][5]), //mobile // need to change int to String
									information[count][6], //fulltime
									information[count][7]); //continuing to diploma
		studentChecker[count] = bucky; //initialize student checker 
}
boolean invalid = true; //set while loop to keep the program until manually ended

while(invalid){
System.out.println("Choose" + "\n" + "1 = write to file ordered by Id" + "\n" + "2 = write to file ordered by surname" + "\n" + "3 = View Students"+ "\n" + "4 = End program");
	int choose = scan.nextInt(); //user input time
	if (choose == 1){ //starts bubblesort method, writes to file sorted by ID
		try {
		studentChecker = method.sortById(studentChecker, studentChecker.length);
			read.itWritesNow(studentChecker, "orderedStudents.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}else if (choose == 2){  //starts bubblesort method, writes to file sorted by surname
		try {
			studentChecker = method.sortBySurname(studentChecker, studentChecker.length);
			read.itWritesNow(studentChecker, "sNameOrderedStudents.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}else if (choose == 3){ //displays ordered students on console // jeff is a getter, the rest is just for styles
		invalid = false;
		System.out.println("Display Students on Console");
	for(student jeff: studentChecker){
		System.out.println(jeff.surname + " :Surname" + "\n" + jeff.givenNames + " :Given names " + "\n" + jeff.preferredNames + " :Preferred name" + "\n" + jeff.studentId 
				+ " :Student ID" + "\n" + jeff.fullTime + " :Fulltime?" + "\n" + jeff.mobile + " :Mobile number" + "\n" + jeff.loveJava + " :Loves Java?" + "\n" + jeff.diploma + " :Continue to diploma?" +  "\n" +  "\n" + "*******************************" + "\n" );
	}
	
	
	
	}else if (choose == 4){ //closes program
		invalid = false;
		System.out.println("Closing program");
		 scan.close(); //closes scanner, kept getting 'resource leak' otherwise
		
		
	}else{
	
		System.out.println("invalid Option, select again"); //exception, only valid input allowed
	}
}

	}

}
