import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Calculator" width=300 height=300></applet>*/
public class Calculator extends Applet implements ActionListener
{
int a=0,b=0;
boolean op=false;
String oper="+";
JTextField tf=new JTextField();
public void init()
{
add(tf);
GridLayout fl=new GridLayout(4,4);
setLayout(fl);
JButton b0=new JButton("7");
JButton b1=new JButton("8");
JButton b2=new JButton("9");
JButton b4=new JButton("4");
JButton b5=new JButton("5");
JButton b6=new JButton("6");
JButton b8=new JButton("1");
JButton b9=new JButton("2");
JButton b10=new JButton("3");
JButton b12=new JButton("0");
JButton b3=new JButton("+");
JButton b11=new JButton("-");
JButton b7=new JButton("x");
JButton b13=new JButton("/");
JButton b14=new JButton("=");
add(b0);add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);
add(b10);add(b11);add(b12);add(b13);add(b14);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b0.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();
if(s=="x" || s=="+" || s=="-" || s=="/")
{oper=s;op=true;tf.setText(s);return;}
else if(s=="=")
{
double c;
if(oper.equals("+")) c=a+b;
else if(oper.equals("-")) c=a-b;
else if(oper.equals("x")) c=a*b;
else c=(1.0*a)/b;
String te=""+c;
a=0;b=0;c=0.0;op=false;
tf.setText(te);
}
if(!op)
{
a=a*10+Integer.parseInt(e.getActionCommand());
String te=""+a;
tf.setText(te);
}
else
{
b=b*10+Integer.parseInt(e.getActionCommand());
String te=""+b;
tf.setText(te);}}}

