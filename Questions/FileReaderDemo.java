import java.io.*;

public class FileReaderDemo{
    public static void main(String[] args){
        try{
            FileReader file=new FileReader("file.txt");
            int ch=file.read();
            while(ch!=-1){
                System.out.println((char)ch);
                ch=file.read();
            }
            file.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}