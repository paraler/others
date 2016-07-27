import java.awt.*;
import javax.swing.*;
public class SimpleClipboard
{
    private JFrame f=new JFrame("复制粘贴");
    private Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
    private TextArea Copyto=new TextArea(5,20);
    private TextArea Pasteto=new TextArea(5,20);
    private Button btCopy=new Button("复制");
    private Button btPaste=new Button("粘贴");
    public void init()
    {
        Panel p=new Panel();
        p.add(btCopy);
        p.add(btPaste);
        btCopy.addActionListener(event->{
            StringSelection contents=new StringSelection(Copyto.getText());
            clipboard.setContents(contents,null);
        });
        btPaste.addActionListener(event->{
            if(clipboard.isFataFlavorAvailable(DataFlavor.stringFlavor))
            {
                try
                {
                    String content=(String) clipboard.getData(DataFlavor.stringFlavor);
                    Pasteto.append(content);
                }catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });    
        Box bos=new Box(Boxlayout.Y_AXIS);
        box.add(Copyto);
        box.add(Pasteto);
        f.add(p,Borderlayout.SOUTH);
        f.add(box,BorderLayout.CENTER);
        f.apck();
        f.setVisible(true);
    }
    public static void main(String[]  args)
    {
        new SimpleClipboard().init();
    }
}
