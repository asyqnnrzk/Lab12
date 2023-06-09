package lab12.exercise7;

import java.io.FileReader;
import java.io.BufferedReader;

/* This program is to display
 * data of 6 days reading of daily
 * rainfall from station Simpang
 * Ampat in Alor Gajah from a text file
 * 
 * @author asyqnnrzk
 */

public class RainfallDataReader {

	public static void main(String[] args) {

		// 1. Declare output file
		String sourceFile = "Rainfall in Simpang Ampat.txt";
		System.out.println("Reading data from " + sourceFile + "\n");
		
		try {
			
			// 2. Create stream to read data
			FileReader fr = new FileReader(sourceFile);
			BufferedReader br = new BufferedReader(fr);
			
			// Variables for processing byte-based data
			int rainfall = 0;
			int totalRain = 0;
			int noOfRecords = 0;
			String date = "";
			
			// 3. Process data until end-of-file
			while(fr.ready() == true)
			{
				// Read data
				while((date = bufferedReader.readLine()) != null)
					System.out.println(date);
				rainfall = fr.read();
				System.out.println(date + "\t" + rainfall);
				
				// Calculate total rainfall
				totalRain += rainfall;
				noOfRecords++;
			}

			// 4. Close stream
			fr.close();
			
			// Calculate average rainfall
			double avgRain = totalRain / noOfRecords;
			String formattedAvg = String.format("%.1f", avgRain);
			System.out.println("\nAverage rainfall for " + noOfRecords + " days is " + formattedAvg);
			
		} catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		// Indicate end of program
		System.out.println("\nEnd of program.");
	}

}
