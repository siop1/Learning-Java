import javax.swing.*;
public class _01_Factorial{
    public _01_Factorial(){
        JFrame jframe=new JFrame();
        JLabel numLabel=new JLabel("Enter a number:");
        JLabel factLabel=new JLabel("Factorial:");
        JTextField numField=new JTextField("I am hero");
        JTextField factField=new JTextField();
        JButton okBtn=new JButton("OK");
        

        numLabel.setBounds(20,30,120,30);
        numField.setBounds(150,30,120,30);
        factLabel.setBounds(60,60,70,30);
        factField.setBounds(150,60,120,30);
        okBtn.setBounds(60,120,80,30);

        jframe.add(numLabel);
        jframe.add(numField);
        jframe.add(factLabel);
        jframe.add(factField);
        jframe.add(okBtn);

        jframe.setSize(500,500);
        jframe.setLayout(null);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new _01_Factorial();
    }
}