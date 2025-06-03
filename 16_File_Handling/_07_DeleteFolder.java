//You can also delete a folder. However, it must be empty:
import java.io.File; 

public class _07_DeleteFolder {
  public static void main(String[] args) { 
    File myObj = new File("Test"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the folder: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the folder.");
    } 
  } 
}

/*
Note: Before running this program make an empty folder "Test"
The output will be:
Deleted the folder: Test 
*/