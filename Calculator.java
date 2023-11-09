import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
  Container c;
                                                        
    JLabel label1,label2,label3;
    JTextField num1,num2;
    JButton add,sub,mul,div;
    Calculator()
    {
        setTitle("Simple Calculator");
        setBounds(400,100,400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        c=getContentPane();
        c.setLayout(null);
        label1=new JLabel("First number");
        label1.setBounds(10,30,100,20);
        c.add(label1);
        label2=new JLabel("Second number");
        label2.setBounds(10,70,100,20);
        c.add(label2);
        num1= new JTextField();
        num1.setBounds(120,30,100,20);
        c.add(num1);
        num2= new JTextField();
        num2.setBounds(120,70,100,20);
        c.add(num2);
        add=new JButton("+");
        add.setBounds(10,150,70,40);
        c.add(add);
        
        sub=new JButton("-");
        sub.setBounds(90,150,70,40);
        c.add(sub);
        
        mul=new JButton("*");
        mul.setBounds(170,150,70,40);
        c.add(mul);
        div=new JButton("/");
        div.setBounds(250,150,70,40);
        c.add(div);
        
        label3=new JLabel("Result : ");
        label3.setBounds(10,210,200,20);
        c.add(label3);
        
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e ) 
    {
     try{
          if(e.getSource()==add)
      {
          int a=Integer.parseInt(num1.getText());
          int b=Integer.parseInt(num2.getText());
           int c=a+b;
        label3.setText("Result : "+c);
      }
      if(e.getSource()==sub)
      {
          int a=Integer.parseInt(num1.getText());
          int b=Integer.parseInt(num2.getText());
          int c=a-b;
          label3.setText("Result : "+c);
      }
      if(e.getSource()==mul)
      {
          int a=Integer.parseInt(num1.getText());
          int b=Integer.parseInt(num2.getText());
          int c=a*b;
          label3.setText("Result : "+c);
      }
      if(e.getSource()==div)
      {
          int a=Integer.parseInt(num1.getText());
          int b=Integer.parseInt(num2.getText());
          long c=a/b;
          label3.setText("Result : "+c);
      }
     }catch(NumberFormatException e1){
        label3.setText("Please enter integers only");
        }catch(ArithmeticException e2){
          label3.setText("Integers cannot be divided by zero");
        }
    }  
   public static void main(String[] args)
   {
      new Calculator();
    }
}