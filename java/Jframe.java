import javax.swing.*;
public class Jframe
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Swing Test");
        System.out.println("创建了JFrame事例");
        frame.setSize(400,400);
        frame.setResizable(true);
        frame.setVisible(true);
//        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
