/* File:    ReedFile.java
 * Author:  Yael Brown
 * Date:    October 9, 2017
 * Purpose: Demostrate understanding of reading files and outputting information.
 */

import java.io.*;
import java.util.*;

public class ReedFile {
	// Method for finding mean of a double. 
	public static double mean(double[] m) {
		double sum = 0.0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i];
		}
		return sum / m.length;
	}
	
	public static void main(String[] args) throws IOException {
		double grade = 0.0;
		double count = 0.0;
		double finalGrade = 0.0;
		File scores = new File("scores.dat");
		Scanner fileIn = new Scanner(scores);
		
		// Read the file 
		while (fileIn.hasNextDouble()) {
			grade += fileIn.nextDouble();
			count++;
		}
		// Calculate average
		finalGrade = grade / count;
		
		// Print out results
		System.out.println("The average of the test scores are: " + finalGrade);
		
		// Close the file
		fileIn.close();
	}
}
