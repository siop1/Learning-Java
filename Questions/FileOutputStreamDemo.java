import java.io.*;

public class FileOutputStreamDemo{
    public static void main(String[] args){
        String data="Hello I am fine";
        try{
            FileOutputStream file=new FileOutputStream("file.txt");
            byte[] bytes=data.getBytes();
            file.write(bytes);
            file.close();
        }
        catch(Exception e){
            e.printStackTrace();
    }
}
}