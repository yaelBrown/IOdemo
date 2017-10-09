/* File:    UMUC_FileRead.java
 * Author:  InstructorX
 * Date:    dd-mm-yyyy
 * Purpose: demonstrates getting input for a program from a file
 */

import java.io.*;
import java.util.*;

public class UMUC_FileRead {

   public static void main(String[] args) throws IOException { 
      int milesDriven = 0;
      double gallonsUsed = 0.0;
      File myFile = new File("input.dat");
      Scanner fileIn = new Scanner(myFile);

     // Read the file until no more data is found
     while (fileIn.hasNext()) {
        milesDriven += fileIn.nextInt();
        gallonsUsed += fileIn.nextDouble();
     }

     System.out.println("Average mpg = " +
                       (milesDriven / gallonsUsed));
                       
     fileIn.close();  // close the file                   
   }
}