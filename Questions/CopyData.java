import java.io.*;

public class CopyData{
    public static void main(String[] args){
        try{
            File inputFile=new File("file.txt");
            File outputFile=new File("file1.txt");
            
            FileReader fr=new FileReader(inputFile);
            FileWriter fw=new FileWriter(outputFile);
            char[] inputData=new char[(int)inputFile.length()];

            fr.read(inputData);
            fw.write(inputData);

            fr.close();
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}