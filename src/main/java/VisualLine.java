import javax.swing.*;
import java.awt.*;

public class VisualLine extends VisualCurve{

    protected Line line;

    public VisualLine(IPoint a, IPoint b) {
        line = new Line(a,b);
    }

    public void Draw(Graphics g) {
//        double sizeX, sizeY;
//        double minX, minY, maxX, maxY;
        double startX = line.a.GetX();
        double startY = line.a.GetY();
        double finishX = line.b.GetX();
        double finishY = line.b.GetY();
//        if (startX > finishX) {
//            minX = finishX;
//            maxX = startX;
//            sizeX = startX - finishX;
//        }
//        else {
//            maxX = finishX;
//            minX = startX;
//            sizeX = finishX - startX;
//        }
//        if (startY > finishY) {
//            minY = finishY;
//            maxY = startY;
//            sizeY = startY - finishY;
//        }
//        else {
//            maxY = finishY;
//            minY = startY;
//            sizeY = finishY - startY;
//        }
        g.drawLine((int)(startX), (int)(finishX), (int)(startY), (int)(finishY));
    }

    public IPoint GetPoint(double t) {
        return line.GetPoint(t);
    }

}
