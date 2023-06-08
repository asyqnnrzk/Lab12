package lab12.exercise5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/* This program is to write
 * data of 6 days reading of daily
 * rainfall from station Simpang
 * Ampat in Alor Gajah into a text file
 * 
 * @author asyqnnrzk
 */

public class RainfallDataGenerator {

	public static void main(String[] args) {

		// 1. Declare output file
		String outFile = "Rainfall in Simpang Ampat.txt";
		
		// Data declaration
		String date[] = {"Fri, 02/06", "Sat, 03/06", "Sun, 04/06", "Mon, 05/06", "Tue, 06/06", "Wed, 07/06"};
		
		double rainfall[] = {0.0, 4.0, 1.0, 0.0, 6.0, 19.0};
		
		try {
			
			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			// Process data
			for(int counter = 0; counter < date.length; counter++)
			{
				// 3. Write data into data stream
				dos.writeUTF(date[counter]);
				dos.writeDouble(rainfall[counter]);
				
				// 4. Flush for each writing
				dos.flush();
			}
		
			// 5. Close stream
			dos.close();
			
		} catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		// Indicate end of program
		System.out.println("End of program. Please check " + outFile);
		
	}

}
