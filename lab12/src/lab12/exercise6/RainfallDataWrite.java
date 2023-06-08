package lab12.exercise6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/* This program is to write
 * data of 6 days reading of daily
 * rainfall from two stations in 
 * Melaka into a text file
 * 
 * @author asyqnnrzk
 */

public class RainfallDataWrite {

	public static void main(String[] args) {
		
		// 1. Declare output file
		String outFile = "Rainfall for two stations in Melaka.txt";
		
		// Data declaration
		String stationID[] = {"2424031", "2324033", "0300061RF", "2223023"};
		
		String stationName[] = {"Datoh Kramat di Nyalas Melaka", "Hospital Jasin", "Bukit Katil, Sg. Duyong", "Sg. Duyong"};
		
		String districtName[] = {"Jasin", "Jasin", "Melaka Tengah", "Melaka Tengah"};
		
		double dailyRainfall[][] = {{0.0, 0.0, 0.0, 0.0, 17.0, 0.0}, {0.0, 14.0, 0.0, 11.0, 15.0, 31.0}, {0.0, 0.5, 0.0, 37.5, 23.5, 57.5}, {0.0, 3.0, 0.0, 43.0, 26.0, 26.0}};
		
		try {
			
			// 2. Create stream to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			// Process data
			for(int counter = 0; counter < stationID.length; counter++)
			{
				// 3. Write data into data stream
				dos.writeUTF(stationID[counter]);
				dos.writeUTF(stationName[counter]);
				dos.writeUTF(districtName[counter]);
				
				for(int i = 0; i < 6; i++)
					dos.writeDouble(dailyRainfall[counter][i]);
				
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
