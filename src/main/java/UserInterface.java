import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class UserInterface {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("curves");
        jFrame.setSize(1600, 800);
        JPanel jPanel = new JPanel();
        jFrame.getContentPane().add(jPanel);
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.LINE_AXIS));
        JPanel jPanel1 = new JPanel();
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        JPanel jPanel2 = new JPanel();
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.black, 2));

        IPoint a = new Point();
        a.SetX(1);
        a.SetY(1);
        IPoint b = new Point();
        b.SetX(10);
        b.SetY(3);
        IPoint c = new Point();
        c.SetX(0);
        c.SetY(4);
        IPoint d = new Point();
        d.SetX(7);
        d.SetY(5);

        VisualLine visualLine = new VisualLine(a,b);
        visualLine.Draw(jPanel1.getGraphics());

        VisualBezier visualBezier = new VisualBezier(a,b,c,d);


        jPanel.add(jPanel1);
        jPanel.add(jPanel2);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }




}
