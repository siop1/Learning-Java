/*
--> In the following example, we use the FileWriter class together with its write() method to 
write some text to the file we created in the program _02_CreateFile.java.
--> Even if the filename.txt does not exist, it will be created automatically by the FileWriter()
method before writing to the file. 
--> Note that when you are done writing to the file, you should close it with the close() method:
*/

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class _03_WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      myWriter.write("I love java");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

/*
It will overwrite the content of "filename.txt" if the file already exists
*/