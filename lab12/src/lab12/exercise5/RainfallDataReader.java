package lab12.exercise5;

import java.io.DataInputStream;
import java.io.FileInputStream;

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
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));
			
			// Variables for processing byte-based data
			double rainfall = 0;
			double totalRain = 0;
			int noOfRecords = 0;
			String date = "";
			
			// 3. Process data until end-of-file
			while(dis.available() > 0)
			{
				// Read data
				date = dis.readUTF();
				rainfall = dis.readDouble();
				System.out.println(date + "\t" + rainfall);
				
				// Calculate total rainfall
				totalRain += rainfall;
				noOfRecords++;
			}
			
			// 4. Close stream
			dis.close();
			
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
