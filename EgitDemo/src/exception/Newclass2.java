package exception;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Newclass2 {
	
	private static final String filename = "input.txt";
	
	public static void main(String[] args) throws IOException //throws IOException
	{
		BufferedReader rd = null;
		File file=new File(filename);
		//file.createNewFile();
		try {
			// Open the file for reading.
			rd = new BufferedReader(new FileReader(new File(filename)));
			
			// Read all contents of the file.
			String inputLine = null;
			while((inputLine = rd.readLine()) != null)
				System.out.println(inputLine);
		}
		catch(IOException ex) {
			System.err.println("An IOException was caught!");
			ex.printStackTrace();
		}
		finally {
			// Close the file.
			try {
				rd.close();
			}
			catch (IOException ex) {
				System.err.println("An IOException was caught!");
				ex.printStackTrace();
			}
		}
		System.out.println("Bushra here, please enter your commits below");
		System.out.println("javeria  here, roll number:FA12-BSE-109");
		


		System.out.println("DANISH here, roll number:FA12-BSE-095");

		System.out.println("Name : Naqeebullah Karim, roll number:FA12-BSE-108");




	}
	
}
