import javax.swing.*;
 import java.awt.*;
import java.awt.event.*;

public class Celcius_Conv extends JFrame implements ActionListener {

    public static Container c;
    JLabel label1,label2,label3;
    JTextField num1,num2;
    JButton add,sub,mul,div;

    Celcius_Conv()
    {
        setTitle("Temperature  Converter");
        setBounds(400,100,600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        c=getContentPane();
        c.setLayout(null);

        

        label1=new JLabel(" Temprature");
        label1.setBounds(10,30,130,20);
        c.add(label1);

        num1= new JTextField();
        num1.setBounds(140,30,100,20);
        c.add(num1);

        label3=new JLabel(".  ");
        label3.setBounds(10,210,200,20);
        c.add(label3);

        add=new JButton("Conversion in Fhareheight:");
        add.setBounds(10,150,200,40);
        c.add(add);

        div=new JButton("Conversion in Celcius:");
        div.setBounds(250,150,200,40);
        c.add(div);
        
        label3=new JLabel("Result : ");
        label3.setBounds(10,260,250,40);
        c.add(label3);
        div.addActionListener(this);
        
        add.addActionListener(this);   

    }


    public void actionPerformed(ActionEvent e ) 
    {
        try{

            if(e.getSource()==add)
      {
          int a=Integer.parseInt(num1.getText());
          double b=a*1.5;
           double c=b+32;
           //c to f 
        label3.setText("Result in Fhareheight: "+c);
      }

      if(e.getSource()==div)
      {
          int a=Integer.parseInt(num1.getText());
          double b=(a-32)*1.5;
           double c=b;
           //f to c
           label3.setText("Result in celcius: "+c);
      }


        }catch(NumberFormatException e1){
        label3.setText("Please enter integers only");
        }catch(ArithmeticException e2){
          label3.setText("Integers cannot be divided by zero");
        }

    }
    public static void main(String args[])
    {
        new Celcius_Conv();  
    }
}