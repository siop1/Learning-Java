import java.io.*;

public class FileInputStreamDemo{
    public static void main(String[] args){
        try{
        FileInputStream file=new FileInputStream("file.txt");
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