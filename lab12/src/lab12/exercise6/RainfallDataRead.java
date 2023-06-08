package lab12.exercise6;

import java.io.DataInputStream;
import java.io.FileInputStream;

/* This program is to display
 * data of 6 days reading of daily
 * rainfall from two stations in 
 * Melaka from a text file
 * 
 * @author asyqnnrzk
 */

public class RainfallDataRead {

	public static void main(String[] args) {

		// 1. Declare output file
		String sourceFile = "Rainfall for two stations in Melaka.txt";
		System.out.println("Reading data from " + sourceFile + "\n");
		
		//String date[] = {"Sat, 03/06", "Sun, 04/06", "Mon, 05/06", "Tue, 06/06", "Wed, 07/06", "Thu, 08/06"};
		
		System.out.println("The data is from Saturday, 03/06 until Thursday, 07/06\n");
		
		try {
			
			// 2. Create stream to read data
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));
			
			// Variables for processing byte-based data
			double rainfall = 0;
			double totalRain = 0;
			int noOfRecords = 0;
			String stationID = "";
			String stationName = "";
			String districtName = "";
			
			// 3. Process data until end-of-file
			while(dis.available() > 0)
			{
				// Read data
				stationID = dis.readUTF();
				stationName = dis.readUTF();
				districtName = dis.readUTF();
				rainfall = dis.readDouble();
				System.out.println(stationID + "\t" + stationName + "\t" + districtName + "\t" + rainfall);
				
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
