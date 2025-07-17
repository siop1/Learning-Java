import javax.swing.*;

public class _02_FrameMethods{
    public _02_FrameMethods(){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setTitle("Checkbox");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon image=new ImageIcon("heart.png");
        frame.setIconImage(image.getImage());

    }

    public static void main(String[] args){
        new _02_FrameMethods();

    }
}