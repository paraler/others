import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class calc extends WindowAdapter implements ActionListener
{

    JFrame f;
    //Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton b[]=new JButton[11];
    JButton be,badd,bc,bj,bch,bcu,bp;
    JTextField answer;
    JPanel p;
    String s="";
    double t1,t2;
    int q=0;
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
    public static void main(String args[])
    {
        calc cg=new calc();
        cg.go();
    }
    public void go()
    {
        p=new JPanel();
        answer=new JTextField("0",15);
        b[0]=new JButton("0");
        b[1]=new JButton("1");
        b[2]=new JButton("2");
        b[3]=new JButton("3");
        b[4]=new JButton("4");
        b[5]=new JButton("5");
        b[6]=new JButton("6");
        b[7]=new JButton("7");
        b[8]=new JButton("8");
        b[9]=new JButton("9");
        b[10]=new JButton(".");
        be=new JButton("=");
        badd=new JButton("+");
        bc=new JButton("C");
        bj=new JButton("-");
        bch=new JButton("*");
        bcu=new JButton("/");
        //bp=new JButton(".");
        p.setLayout(new GridLayout(4,4));
        p.add(b[7]);p.add(b[8]);p.add(b[9]);p.add(bcu);
        p.add(b[4]);p.add(b[5]);p.add(b[6]);p.add(bch);
        p.add(b[1]);p.add(b[2]);p.add(b[3]);p.add(bj);
        p.add(b[0]);p.add(b[10]);p.add(be);p.add(badd);
        for(int i=0;i<b.length;i++)
            b[i].addActionListener(this);//注册监听器


        be.addActionListener(this);
        badd.addActionListener(this);
        bj.addActionListener(this);
        bch.addActionListener(this);
        bcu.addActionListener(this);
        f=new JFrame ("calc");
        f.setSize(300,300);
        f.add(answer,"North");
        f.add(p,"Center");
        f.add(bc,"South");
        bc.addActionListener(this);
        f.addWindowListener(this);
        f.pack();//调整窗口大小
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bc)
        {
            s="";
            t1=0;
            t2=0;
            answer.setText("0");
        }
        else if(e.getSource()==badd)
        {
            q=0;
            t1=Double.parseDouble(s);
            s="";
            answer.setText("0");
        }
        else if(e.getSource()==bj)
        {
            q=1;
            t1=Double.parseDouble(s);
            s="";
            answer.setText("0");
        }
        else if(e.getSource()==bch)
        {
            q=2;
            t1=Double.parseDouble(s);
            s="";
            answer.setText("0");
        }
        else if(e.getSource()==bcu)
        {
            q=3;
            t1=Double.parseDouble(s);
            s="";
            answer.setText("0");
        }
        else if(e.getSource()==be)
        {
            if(q==0)
            {
                t2=Double.parseDouble(s);
                t2=t2+t1;
            }
            if(q==1)
            {
                t2=Double.parseDouble(s);
                t2=t1-t2;
            }
            if(q==2)
            {
                t2=Double.parseDouble(s);
                t2=t1*t2;
            }
            if(q==3)
            {
                t2=Double.parseDouble(s);
                t2=t1/t2;
            }
            answer.setText((new Double(t2)).toString());
        }
        else{
            for(int i=0;i<b.length;i++)
                if(e.getSource()==b[i])
                {
                    if(answer.getText().charAt(0)=='0') 
                    {
                        answer.setText(answer.getText().substring(1));
                    }
                    answer.setText(answer.getText() + b[i].getActionCommand()); 
                    s=s+b[i].getActionCommand();
                }
        }
    }
}
