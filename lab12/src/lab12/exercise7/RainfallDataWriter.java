package lab12.exercise7;

import java.io.FileWriter;
import java.io.BufferedWriter;

/* This program is to write
 * data of 6 days reading of daily
 * rainfall from station Simpang
 * Ampat in Alor Gajah into a text file
 * 
 * @author asyqnnrzk
 */

public class RainfallDataWriter {

	public static void main(String[] args) {

		// 1. Declare output file
		String outFile = "Rainfall in Simpang Ampat 2.txt";
		
		// Data declaration
		String date[] = {"Fri, 02/06", "Sat, 03/06", "Sun, 04/06", "Mon, 05/06", "Tue, 06/06", "Wed, 07/06"};
		
		int rainfall[] = {0, 4, 1, 0, 6, 19};
		
		try {
			
			// 2. Create stream to read data
			FileWriter fw = new FileWriter(outFile);
			BufferedWriter bw = new BufferedWriter(fw);
			
			// Process data
			for(int counter = 0; counter < date.length; counter++)
			{
				// 3. Write data into data stream
				fw.write(date[counter]);
				fw.write(rainfall[counter]);
				
				// 4. Flush for each writing
				fw.flush();
			}
		
			// 5. Close stream
			fw.close();
			
		} catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		// Indicate end of program
		System.out.println("End of program. Please check " + outFile);
		
	}

}
