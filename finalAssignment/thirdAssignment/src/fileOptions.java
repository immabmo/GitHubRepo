import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;



public class fileOptions {
	
	BufferedReader buff; //initialize imports
	FileReader reader;
	File filey;
	Writer writeOn;

	
	
	fileOptions(){
		filey = new File("resources/students.txt"); //reads from students text document
		try {
			reader = new FileReader(filey); //initialize file reader
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buff = new BufferedReader(reader); //initialize another import
		



		}
		public String[][] readText() throws IOException{
		ArrayList <String[]> values = new ArrayList<String[]>(); //temp string
		String[] temp = new String[8]; //puts the read stuff in a temporary array
		String line = buff.readLine(); //reads the text file with the filereader
			while(line !=null){
				
				
			//	System.out.println(temp[0]); //just for testing that the reader was working, ignore
			//	System.out.println(temp[1]);
			//	System.out.println(temp[2]);
			//	System.out.println(temp[3]);
			//	System.out.println(temp[4]);
			//	System.out.println(temp[5]);
			//	System.out.println(temp[6]);
			//	System.out.println(temp[7]);
				
				temp = line.split(","); //splits the values			
				values.add(temp); //add newly read data into temp array
				line = buff.readLine();
			
			
		
	}
			String[][] returns = new String[values.size()][8];  //returns all the data
			for(int a = 0; a < values.size();a ++){
				returns[a] = values.get(a);
			}

			return returns;

		}
	              

			public void itWritesNow(student[] studentChecker, String path) throws IOException{
				System.out.println("Now writing to file"); //method to write to file
				filey = new File("resources/"+path);
				BufferedWriter	writingToFile;
				writeOn = new FileWriter(filey);
				writingToFile = new BufferedWriter(writeOn);
				
				for(student jeff:studentChecker){ //order/syntax of writing to file
					writingToFile.write( jeff.surname + ", " + jeff.givenNames + ", " + jeff.preferredNames + ", " + jeff.studentId 
							+ ", " + jeff.fullTime + ", " + jeff.mobile + ", " + jeff.loveJava + ", " + jeff.diploma + "\n");
				}
				


				//public String surname;
				//public String givenNames;
				//public String preferredNames;
				//public int studentId;
				//public String fullTime;
				//public int mobile;
			    //public String loveJava;
				//public String diploma;
				
				writingToFile.close(); //close writing file method
				System.out.println("finished writing to file");
			}
			
	//file writer - write to sNameOrderedStudents - ordered by surname
	//public String[]
		
}
