import java.io.*;

public class FileWriterDemo{
    public static void main(String[] args){
        String data="I am using FileWriter to write this data";
        try{
            // File outputFile=new File("file.txt");
            // FileWriter file=new FileWriter(outputFile,true);
            FileWriter file=new FileWriter("file.txt",true);
            file.write(data);
            file.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}