//To get more information about a file, use any of the File methods:
import java.io.File;  // Import the File class

public class _05_GetFileInfo { 
  public static void main(String[] args) {
    File myObj = new File("filename.txt");
    if (myObj.exists()) {
      System.out.println("File name: " + myObj.getName());
      System.out.println("Absolute path: " + myObj.getAbsolutePath());
      System.out.println("Writeable: " + myObj.canWrite());
      System.out.println("Readable " + myObj.canRead());
      System.out.println("File size in bytes " + myObj.length());
    } else {
      System.out.println("The file does not exist.");
    }
  }
}

/*
You will get output something like this:
File name: filename.txt
Absolute path: /media/aryan/Shared Disk/Programming/Java/16_File_Handling/filename.txt
Writeable: true
Readable true
File size in bytes 11
*/

/*
Note: There are many available classes in the Java API that can be used to read and write files in Java:
FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, 
FileOutputStream, etc. Which one to use depends on the Java version you're working with 
and whether you need to read bytes or characters, and the size of the file/lines etc.
*/